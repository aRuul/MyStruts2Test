package test2;

import com.opensymphony.xwork2.ActionSupport;

public class xmlMethod extends ActionSupport {
    private  String name;
    private  String identify;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public String execute(){
        System.out.println("xmlMethod-execute: "+name);
        System.out.println("xmlMethod-execute: "+identify);
        return "ok";
    }
}
