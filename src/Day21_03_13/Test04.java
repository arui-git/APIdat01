package Day21_03_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc=new Scanner(System.in);
        System.out.println("输一个生产日期,格式为yyyy-MM-dd");
        String mday=sc.next();
        System.out.println("请输入保质期(天数)");
        int pday=sc.nextInt();
        Date mday1=sdf.parse(mday);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(mday1);
        calendar.add(Calendar.DAY_OF_YEAR,pday);
        calendar.add(Calendar.DAY_OF_YEAR,-14);
        calendar.set(Calendar.DAY_OF_WEEK,4);
        Date goodDate=calendar.getTime();
        System.out.println(goodDate);


    }

}
