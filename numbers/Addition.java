import java.io.Console;

      public class DoubleIt {
        public static void main(String[] args) {
          Console myConsole = System.console();

          System.out.println("Give me a number, and I will add it for you!");
          System.out.println("Give me second number!");
          String stringNumber = myConsole.readLine();

          Integer yourNumber = Integer.parseInt(stringNumber);
          Integer yourNumber2 = Integer.parseInt(stringNumber2);
          Integer yourAddedNumber = yourNumber + yourNumber2;

          String stringAddedNumber = Integer.toString(yourAddedNumber);
          System.out.println("I added your number for you: " + stringAddedNumber);
        }
      }
    