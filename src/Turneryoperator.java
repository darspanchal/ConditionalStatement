import java.util.Scanner;

public class Turneryoperator {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");

            int num = reader.nextInt();

            String evenOdd = (num % 2 == 0) ? "even" : "odd";

            System.out.print(num + " is " + evenOdd);

        }


}
