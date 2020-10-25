package test3;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class fileUpload extends ActionSupport {
    private File photo;
    private String photoFileName;

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
        System.out.println("set-photo: "+photo);
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
        System.out.println("set-photoFileName: "+photoFileName);
    }

    public String execute(){
        System.out.println("文件名称："+photoFileName);
        if(photo!=null){
            try {

                //设置日期格式
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                // new Date()为获取当前系统时间，也可使用当前时间戳
                String date = df.format(new Date());
                String ReName= date+".png";
                photoFileName=ReName;
                System.out.println("重命名后："+photoFileName);

                String realpath = ServletActionContext.getServletContext().getRealPath("/image");
                File destFile=new File(realpath,photoFileName);
                //File destFile=new File(realpath,ReName);
                FileUtils.copyFile(photo,destFile);
            }
            catch (IOException e){
                System.out.println("error");
            }
            return "ok";
        }
        return "fail";
    }

}
