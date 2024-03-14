package encapsulation;

public class App {
    public static void main(String  args[]){
        //WITH CONSTRUCTOR it requires less code
        //CLEAN CODE we can force that data to be required
        User Frank = new User("Frank", "Gold");
        System.out.println(Frank);//otoconverts to string using toString() we can override the toString()
        User Frank2 = new User("Frank", "Bronze");
        System.out.println(Frank==Frank2);

        
        //WITHOUT A CONSTRUCTOR
        // User James = new User();
        // James.set_name("James");
        // System.out.println(James.get_name());
        // James.set_membership(User.Membership.Gold);
        // System.out.println(James.get_membership());
    }
}


