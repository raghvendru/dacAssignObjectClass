package Extras;
import java.time.*;
public class Dat {
public static void main(String[] args) {
	LocalDate d  = LocalDate.now();
	System.out.println(d);
	LocalDateTime t = LocalDateTime.now();
	System.out.println(t);
	LocalTime t1 = LocalTime.now();
	System.out.println(t1);
//	LocalTimeFormatter t2 = LocalTimeFormatter.now();
//	System.out.println(t1);

}
}
