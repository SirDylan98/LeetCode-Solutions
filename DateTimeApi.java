import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeApi {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");

        Date currentDate= new Date();
        System.out.println("The current date is "+ sdf.format(currentDate));

        Date myDate = sdf.parse("16-10-1977");
        System.out.println(myDate);
        

    }
}
