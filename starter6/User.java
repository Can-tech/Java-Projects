package starter6;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String _email;
    private String _password;
    public User(){
        
    }
    public User(String email, String password){
        set_email(email);
        set_password(password);
    }
    public String toString(){
        return get_email() + " " + get_password();
    }
    public boolean equals(User obj2){
        if(obj2.get_email() == get_email() && obj2.get_password() == get_password()){
            return true;
        }else{
            return false;
        }
    }
    public static List<User> admins;
    public static void print_admin_emails(){
        for(User u : admins){
            System.out.println(u.get_email());
        }
    }
    void set_email(String email){
        _email = email;
    }
    String get_email(){
        return _email;
    }
    void set_password(String password){
        _password = password;
    }
    String get_password(){
        return _password;
    }
}
