import java.io.Console;
	public class EvenOdd{
		public static void main(String[] args) {
			Console console = System.console();
			System.out.println("Please enter a number ");
			String Number1 = console.readLine();
			Integer number = integer.parseInt(Number1);
			System.out.println("These are the odd and even numbers from one to the number you entered.");
			for(Integer even = 0; even<number; even++ );
				if(even / 2) {
					System.out.println("even");
				}
				else {
					System.out.println("odd");
				}
		}
	}