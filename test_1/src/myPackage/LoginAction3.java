package myPackage;
import beans.users;

public class LoginAction3 {
    private users users;

    public users getUsers() {
        return users;
    }

    public void setUsers(users users){
        this.users=users;
    }

    public String execute(){
        System.out.println("LoginAction3: "+users.getName());
        return "ok";
    }
}
