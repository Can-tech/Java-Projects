package encapsulation;

public class User{
    private String _name;//use underscore _ to prevent naming contradict
    private String _membership="Bronze";//otherwise use "this" keyword

    public String toString(){
        return get_name() + " " + get_membership();
    }

    public User(){
        //Overloaded constructors
    }

    public User(String name, String membership){
        //_name = name This is not the proper way use methods!
        set_name(name);
        set_membership(membership);
    }
    
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
    void set_membership(Membership membership){//!Method Overloading
        _membership = membership.name();
    }
    public enum Membership{
        Bronze, Silver, Gold
    }
    String get_membership(){
        return _membership;
    }
}