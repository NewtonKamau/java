import java.io.Console;
	public class LeapYear{
		public static void main(String[] args) {
			Console console = system.console();
			System.out.println("What year were you born in?");
			String stringBirhtyear=console.readline();
			Integer birthYear = integer.parseInt(stringBirhtyear);
			System.out.println("You were alive during these leap years");
			// impelementing a for loop
			for (Integer year =birthYear; year<2016 ; year++);
				if ( year % 4 ==0) {
					System.out.println(year);
				}


		}
	}