package encapsulation;

public class User{
    private String _name;//use underscore _ to prevent naming contradict
    private String _membership;//otherwise use "this" keyword

    void set_name(String name){
        _name = name;
    }
    void set_name(){

    }
    String get_name(){
        return _name;
    }
    void set_membership(String membership){
        _membership = membership;
    }
    void set_membership(Membership membership){
        _membership =membership.name();
    }
    public enum Membership{
        Bronze, Silver, Gold
    }
    String get_membership(){
        return _membership;
    }
}