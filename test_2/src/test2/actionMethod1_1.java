package test2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.Validate;

import java.util.regex.Pattern;

public class actionMethod1_1 extends ActionSupport {
    private String name;
    private String identify;


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

    public void validate(){
        if(name.equals("")){
            this.addFieldError("name","Name is not allowed to be empty!");
        }
        if(!Pattern.matches("admin", identify)){
            this.addFieldError("identify","Only admin can login!");
        }
    }

    public String execute(){
        System.out.println("actionMethod-execute: "+name);
        System.out.println("actionMethod-execute: "+identify);
        return "ok";
    }
}
