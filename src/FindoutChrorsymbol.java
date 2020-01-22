import java.util.Scanner;

public class FindoutChrorsymbol {   //main class

    public static void main(String args[]) // main method
    {
        Scanner scanner=new Scanner(System.in); //method to get input from user
        char char1 =scanner.next().charAt(0); // statement asking user to input
        if((char1>=48 && char1<=57) || char1 == 45) //store valuse for users input
        {
            System.out.print("char is Digit"); // print result if inout is digit

        }
        else if((char1>='a' && char1<='z')||(char1>='A' && char1<='Z')) // condition if input is alphabet
        {
            System.out.print("char is Alphabet"); //print result if input is alphbet
        }
        else
        {
            System.out.print("char is special character"); //print result if input is special character

        }
    }
}
