package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class date1 {

	public static void main(String[] args) {

		
		LocalDate today =LocalDate.now();
		System.out.println(today);
		
		LocalDate har =LocalDate.of(2015,Month.DECEMBER, 23);
		System.out.println(har);
		
//	 In java 7 
		
		Calendar c =  Calendar.getInstance();
		c.add(Calendar.DATE, 6);
		Date dc = c.getTime();
		System.out.println(dc);
		
		
//   IN java 8 
		
		LocalDate har2 =LocalDate.now().plusDays(4);
		System.out.println(har2);
		
//		Predefine Adjuster
		LocalDate har3 =LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(har3);
		
//	 Creating own Adjusters
		
		System.out.println("This is my own adjuster ");
		
		TemporalAdjuster NEXT_WORKDAY = w->{
			LocalDate result = (LocalDate) w;
			System.out.println(result.getDayOfWeek().getValue()>=6);
			return result  ;		
		};
		
		LocalDate backtowork = today.with(NEXT_WORKDAY);
		System.out.println(backtowork);
		
	}

}
