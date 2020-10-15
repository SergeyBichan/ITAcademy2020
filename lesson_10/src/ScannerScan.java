import java.util.Scanner;

public class ScannerScan {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number..");
            int num1 = sc.nextInt();
            System.out.println("Enter second number..");
            int num2 = sc.nextInt();
            System.out.println("Sum is :" + (num1 + num2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



//StringSplit
