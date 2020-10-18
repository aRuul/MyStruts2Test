package myPackage;

import java.util.Date;

public class LoginAction4 {
    private Date testDate;

    public Date getTestDate(){
        return testDate;
    }

    public void setTestDate(Date testDate){
        this.testDate=testDate;
    }

    public String execute(){
        System.out.println("LoginAction4: "+testDate);
        return "ok";
    }
}
