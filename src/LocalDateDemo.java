import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAmount;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(2023,1,10);
        LocalDate localDate2 = LocalDate.of(2023,1,17);

//        for(LocalDate loc1 = localDate1;localDate1>localDate2;localDate1.plusDays(1)){
//            System.out.println(loc1);
//        }
        for (LocalDate time = localDate1, nextTime; time.isBefore(localDate2); time = nextTime) {
            nextTime = time.plusDays(1);
            System.out.println(nextTime);
        }

        String s = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s);
    }
}
