import java.util.Scanner;

public class FindCommision {
    //WAP input sales id, seller's name, sales amount, salary basic and then find this sales
    //commission
    //sales amount >= 50,000 35%
    //sales amount >= 30,000 20%
    //>= 20,000 10%
    //>= 10,000 5%
    //< 10,000 2%
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter Sales ID");
        int salesID = sc.nextInt();
        System.out.println("Enter Seller's Name");
        String sellerName = sc.next();
        System.out.println("Enter Sales Amount");
        double salesAmount = sc.nextDouble();
        System.out.println("Enter Basic Salary");
        double basicSalary = sc.nextDouble();
        if(salesAmount>=50000){
            System.out.println(salesAmount/100*(35)); }
        else if(salesAmount>=30000){
            System.out.println(salesAmount/100*(20)); }
        else if (salesAmount>=20000){
            System.out.println(salesAmount/100*(10)); }
        else if (salesAmount>=10000){
            System.out.println(salesAmount/100* (5)); }
        else { System.out.println(salesAmount/100*(2));}
    }  }