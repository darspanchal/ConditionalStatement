import java.util.Scanner;

public class StudentDetail {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Student Name :");
                String name = scanner.next();
                System.out.println("Enter Roll Number :");
                String RollNumber = scanner.next();
                System.out.println("Enter Maths Mark :");
                int Maths = scanner.nextInt();
                System.out.println("Enter English Marks :");
                int English = scanner.nextInt();
                System.out.println("Enter Science Marks :");
                int Science = scanner.nextInt();
                System.out.println("Total Marks");
                System.out.println(Maths + English + Science);
                System.out.println("Percentage");
                int Subject = (Maths + English + Science) / 3;
                System.out.println(Subject + "%");
                if (Maths < 35 || Science < 35 || English < 35) {
                        System.out.println("Fail");
                } else {
                        System.out.println("Pass");
                }
                if (Subject >= 80) {
                        System.out.println("Grade Is A+");
                } else if (Subject >= 60) {
                        System.out.println("Grade Is A");
                } else if (Subject >= 50) {
                        System.out.println("Grade Is B");
                } else if (Subject >= 35) {
                        System.out.println("Grade Is C");
                }
}       }