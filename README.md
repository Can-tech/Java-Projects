# Java-Projects

Note: I had an error due to the java version. I uploaded new version and changed the environemnt variables, restart the computer and it worked.

Access the topics by order using the git versions.

- git log --oneline
- git checkout <commit-hash>
  //note that this will put your repository in a 'detached HEAD' state, which means you're not on any branch. If you want to make changes and save them, you should create a new branch while you're at this commit:
- git checkout -b <new-branch-name>
- git checkout main
  //the latest commit is on the main branch

## Topics

### 1 Getters-Setters(Encapsulation)

> Hide inner details. We can abstract the insides of the class so the person who's using the class don'T have to knwo the inner details. Makes developing easier.

> Getters and Setters are methods allow us to gate access to our attributes. Ex: If we need to get an age input i can't be negative number! But a user who has a direct access to the field can change it whatever he wants. We can pervent that with a proper setter function.
> Getters & Setters also allow us to have consistent interface.

> Words that are starting with \_ , are knwon as something you're not supposed to be touching. We can use 2 ways:

> 1-
> public class User{  
>  String \_name;
> String membership;
> void set_name(String name){
> \_name = name
> }
>
> }

> 2-
> public class User{  
>  String name;
> String membership;
> void set_name(String name){
> this.name = name
> }
>
> }

> Notice, get methods return something, and set methods return void.

### 2 Method Overloading:

> Create different variations of methods with different types(signuture).

```
public enum Membership {
  Bronze, Silver, Gold
}
void set_membership(String name){
    _membership = membership
}
void set_membership(Membership membership){
  _membershipt = membership
}
```

### 3 Constructors

> Any time we create a class, default constructor will be there.

> We want to pass membership and name when the object initialized.

```
public class User{
  private String _name;
  private String _membership;
  public User(){
    <!-- If there is custom constructor, there will be no default constructor hence this constructor has to be created again. -->
  }
  public User(String name, String membership){
    set_name(_name);
    set_membership(_membership)
  }
  void set_name(String name){
    _name=name;
  }
}
```

### 4 Method Overriding:

> when i log the object user1. It logs the memeory location place by implicitly converting it using the toString(). This is not so useful in my case so I used Method Overriding inside the String class to create my version of the function toString()

> 2 cases of overriding important: 1- When i want to log user name. 2- When we compare two objects.By default using "=" sign will not work as intended since it compares refrences. We can override the built-in equals() method.

>

```
public class User{
  private String _name;
  private String _membership = "Bronze";
  public User(String name, String membership){
    set_name(_name);
    set_membership(_membership)
  }
  public String toString(){
    return get_name() + " " + get_membership();
  }
  public boolean equals(User u2){
    if(get_name()== u2.get_name() && get_membership == u2.getmembership()){
      return true;
    }else{
      return false;
    }
  }
}
public class OOP{
  public static void main(String[] args){
    User u = new User("Caleb", "Gold);
    User u2 = new User("Caleb", "Gold");

    System.out.println(u);//prints the "Caleb Gold"
    System.out.println(u.equals(u2));
  }
}
```

### 5 Generic Lists

> It is complicated to work with 100 objects. So insted of creating user variables one by one. Tt is ideal to create a list that can contain numerous users.

> Since OOP allows us to create our own type. We can use generically typed things and just use that as the type. The most common example of generic type is generic list.

```
public class User{
  private String _name;
  public User(String name, String membership){
    set_name(_name);
  }
  void set_name(String name){
      this.name = name
  }
}
public class OOP{
  public static void main(String[] args){
    ArrayList<User> users = new ArrayList<User>();
    user.add(new User("Caleb"));
    user.add(new User("Jason"));
    user.add(new User("Gibson"));
    for(nt i = 0; i < user.size();i++){
        System.out.println(users.get(i).get_name());

    }
  }
}
```

### 6 Static Data Members

> Anything static on a class is accessed on that class directly, instead of accessing it on an object.

```
public class User{
  private String _name;

  public static List<User> admin;

  public User(String name, String membership){
    set_name(_name);
  }
  void set_name(String name){
      this.name = name
  }
}
public class OOP{
  public static void main(String[] args){
    User.admins = new ArrayList<User>();
    User.admins.add(new User("Caleb"));
    User.admins.add(new User("Jason"));
    User.admins.add(new User("Gibson"));
    for(nt i = 0; i < User.admins.size();i++){
        System.out.println(users.get(i).get_name());
    }
  }
}
```

### 7 Static Methods

```
    public static void print_admin_emails(){
        for(User u : admins){
            System.out.println(u.get_email());
        }
    }
```

### 8 Inheritance

> We can create derived classes from another classes.

> Example: User and Student Classes. Student class inherits all fileds and method from the User class and we can just add some extra stuff.

> In java there are "extends" and "implements" keywords to inherit class. By using implements we inherit interfaces.
> public class Student extend User{}: A student is a user(being)
> Student implements User{}: A student is behaving as a user(behaving)

Note: Don't use "-" sign when naming the folders the folder name affects the package name in java. And package names is important when i try to accees other files and classes.

### Polymorpsm

> We can have 2 child class inherited from 1 parent class.

> polymorphism allows us to perform a single action in different ways.

```
//From w3scools.com
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```
