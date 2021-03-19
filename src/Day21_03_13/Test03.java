package Day21_03_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc=new Scanner(System.in);
        System.out.println("输入生日,格式为yyyy-MM-dd");
        String bir=sc.next();
        Date birthday=sdf.parse(bir);
        Date now=new Date();
        long time=now.getTime()-birthday.getTime();
        long week=time/1000/60/60/24/7;
        System.out.println("到现在为止经过了"+week+"周");
    }

}
