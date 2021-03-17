package day03;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        Date date = sdf.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,a);
        cal.add(Calendar.DATE,-14);
        cal.set(Calendar.DAY_OF_WEEK,3);
        date =cal.getTime();
        System.out.println(date);
    }
}
