import java.util.Scanner;

public class findcityname  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Letter");
        char city = scanner.next().charAt(0);
        switch (city) {
            case 'A' :
                System.out.println("Australia");
                break;
            case 'B' :
                System.out.println("Banglore");
                break;
            case 'C' :
                System.out.println("Canada");
                break;
            case 'D' :
                System.out.println("Dubai");
                break;
            case 'E' :
                System.out.println("Egypt");
                break;
            case 'F' :
                System.out.println("Fiji");
                break;

            default:
                System.out.println("Invalid Entery");

        }
    }
}