package dateTo;

import ognl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;

import javax.xml.bind.TypeConstraintException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

public class MyDateConvter extends StrutsTypeConverter {
    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日");

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        if (strings == null) {
            return null;
        }
        //判断是否是日期类型的
        if (Date.class != aClass) {
            return null;
        }

        try {
            return format.parse(strings[0]);
        } catch (ParseException e) {
            System.out.println("error!");
            return null;
        }
    }

    @Override
    public String convertToString(Map map, Object o) {
        Date date=(Date) o;
        System.out.println("convertToString方法");
        return new SimpleDateFormat("MM-dd-yyyy").format(date);
    }
}
