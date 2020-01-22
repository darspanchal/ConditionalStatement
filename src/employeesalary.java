import java.util.Scanner;

public class employeesalary {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String name;
            float bs, nets, HRA, DA, TA, PF;
            System.out.println("Enter Employee Name :");

            name = sc.next();
            System.out.println("Enter Basic Salery :");

            bs = sc.nextInt();
            HRA = 10 * bs;
            DA =  8 * bs;
            TA =  9 * bs;
            PF = 20 * bs;
            nets = bs + HRA + DA + TA - PF;
            System.out.println("THE NET SALERY IS = " + nets);

        }


}
