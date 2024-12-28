package OOP; 
import java.time.*;


public class DateTime {
   
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());
        
        LocalDate date1 = LocalDate.of(2024, 12, 18);
        LocalDate date2 = LocalDate.of(2013, Month.JULY, 20);
        LocalTime time1 = LocalTime.of(12, 40, 11,21);

        System.out.println(time1);
        System.out.println(date1);
        System.out.println(date2);


    }

}
