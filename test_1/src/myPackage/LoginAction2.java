package myPackage;

public class LoginAction2 {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String res(){
        if(name.equals("")){
            return "fail";
        }
        System.out.println("获取的值为"+name);
        return "success";
    }
}
