import java.io.Console;

      public class subtract {
        public static void main(String[] args) {
          Console myConsole = System.console();

          System.out.println("Give me a number, and I will subtract it for you!");
          System.out.println("Give me second number!");
          String stringNumber = myConsole.readLine();

          Integer yourNumber = Integer.parseInt(stringNumber);
          Integer yourNumber2 = Integer.parseInt(stringNumber2);
          Integer yourSubtractedNumber = yourNumber - yourNumber2;

          String stringSubtractedNumber = Integer.toString(yourSubtractedNumber);
          System.out.println("I subtract your number for you: " + stringSubractedNumber);
        }
      }
    