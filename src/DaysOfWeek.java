
public class DaysOfWeek {
	public  enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	private static final DaysOfWeek THURSDAY = null;
	private static final DaysOfWeek SUNDAY = null;
	private static final DaysOfWeek MONDAY = null;
	private static final DaysOfWeek TUESDAY = null;
	private static final DaysOfWeek WEDNESDAY = null;
	private static final DaysOfWeek FRIDAY = null;
	private static final DaysOfWeek SATURDAY = null;
	
	public static void main(String args[]){

		DaysOfWeek day= DaysOfWeek.THURSDAY;  
		if(day == DaysOfWeek.SUNDAY) {
			System.out.println("Today is: SUNDAY");
		} else if(day == DaysOfWeek.MONDAY) {
			System.out.println("Today is: MONDAY");
		} else if(day == DaysOfWeek.TUESDAY) {
			System.out.println("Today is: TUESDAY");
		} else if(day == DaysOfWeek.WEDNESDAY) {
			System.out.println("Today is: WEDNESDAY");
		} else if(day == DaysOfWeek.THURSDAY) {
			System.out.println("Today is: THURSDAY");
		} else if(day == DaysOfWeek.FRIDAY) {
			System.out.println("Today is: FRIDAY");
		} else if(day == DaysOfWeek.SATURDAY) {
			System.out.println("Today is : SATURDAY");

		} else {
			System.out.println("Today is: THURSDAY");
		}
	}
}


