package starter6;

public class User {
    private String _email;
    private String _password;
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
