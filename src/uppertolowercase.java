import java.util.Scanner;

public class uppertolowercase {

            //Input any alphabet in uppercase and print it in lowercase
            public static void main(String[] args) {
                Scanner sc = new Scanner( System.in );

                char ch;
                int temp;

                System.out.println("Enter any character in UPPERCASE");
                ch=sc.next().charAt( 0 );

                temp=(int)ch;
                temp=temp+32;
                ch=(char)temp;

                System.out.println("Lower case is:" +ch);
            }
}