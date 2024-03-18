package starter6;

import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        User Tom = new User("tom@mail.com", "1234");
        User Tom2 = new User("tom@mail.com", "1234");
        User Jason = new User("jason@mail.com", "1234");
        User.admins = new ArrayList<User>();

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Cal@mail.com", "1234"));
        users.add(new User("mehmet@mail.com", "1234"));
        User.admins.add(Jason);
        Student s1 = new Student();
        System.out.println(s1.get_verified());
        s1.set_email("s1@mail.com");
        System.out.println(s1.get_email());

        // for(int i = 0; i < users.size() ; i++){
        //     System.out.println(users.get(i).get_email());
        // }
        // System.out.println("--Admin--");
        // User.print_admin_emails();
        // System.out.println("----");
        // System.out.println(Tom);
        // System.out.println(Tom.equals(Tom2));
    }
}
