import java.util.Scanner;

public class Arithmeticoperator {

        public static void main(String[] args) { //main method
            Scanner reader = new Scanner(System.in); //method to get input from user
            System.out.print("Enter two numbers: "); //print result enter two number
            // nextDouble() reads the next double from the keyboard
            double first = reader.nextDouble(); //store first input from user
            double second = reader.nextDouble(); //store second input from user
            System.out.print("Enter an operator (+, -, *, /): "); //message for user to enter symbol
            char operator = reader.next().charAt(0); //
            double result;
            switch(operator)
            {
                case '+': //method for  addition
                    result = first + second;
                    break;
                case '-':   //method for substraction
                    result = first - second;
                    break;
                case '*':   //method from multiplication
                    result = first * second;
                    break;
                case '/': //method from division
                    result = first / second;
                    break;
                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.print("Error! operator is not correct");
                    return;
            }
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result); //message for invalid entry
        }


}
