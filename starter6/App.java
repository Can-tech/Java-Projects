package starter6;

public class App {
    public static void main(String args[]){
        User Tom = new User("tom@mail.com", "1234");
        User Tom2 = new User("tom@mail.com", "1234");
        User Jason = new User("jason@mail.com", "1234");

        System.out.println(Tom);
        System.out.println(Tom.equals(Tom2));
    }
}
