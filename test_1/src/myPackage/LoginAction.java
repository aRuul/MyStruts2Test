package myPackage;

public class LoginAction {
    private String account;
    public String getAccount(){
        return account;
    }
    public void setAccount(String account){
        this.account=account;
    }

    private String password;
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    public String adminLogin(){
        if(account.equals(password)){
            return "admin";
        }
        return "fail";
    }

    public String userLogin(){
        if(account.equals(password)){
            return "user";
        }
        return "fail";
    }
}
