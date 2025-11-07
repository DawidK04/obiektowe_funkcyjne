import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;

public class Kalendarz {
    public static void main(String[] args) {
        Date dur = new Date(125,Calendar.NOVEMBER,8);
        Calendar cdur = Calendar.getInstance();
        System.out.println(cdur.getTime());
        cdur.set(2025,10,8);
        System.out.println(cdur.getTime());
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(dur));
        DateTimeFormatter dtf = new DateTimeFormatter.ofPattern("dd-MM");
        System.out.println();
    }
}
