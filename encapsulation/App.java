package encapsulation;

public class App {
    public static void main(String  args[]){
        User James = new User();
        James.set_name("James");
        System.out.println(James.get_name());
        James.set_membership(User.Membership.Gold);
        System.out.println(James.get_membership());
    }
}


