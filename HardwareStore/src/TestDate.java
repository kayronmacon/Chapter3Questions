import com.hardwareStore.Date;
import com.hardwareStore.exceptions.wrongNumberException;
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        date.setDay(5);
        date.setMonth(12);
        date.setYear(1995);
        System.out.println(date.displayDate());
    }


}
