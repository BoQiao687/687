package day03;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String birth = sc.nextLine();
        Date birthday = sdf .parse(birth);
        Date now = new Date();
        long time = now.getTime() - birthday.getTime();
        time = time/(7*24*60*60*1000);
        System.out.println("经过了"+time+"周");
    }
}
