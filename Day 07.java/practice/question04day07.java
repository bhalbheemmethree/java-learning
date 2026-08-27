import java.util.Scanner;

public class question04day07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("All three numbers are equal: " + num1);

        } else if (num1 == num2 && num1 > num3) {
            System.out.println("Largest numbers are: " + num1 + " and " + num2);

        } else if (num1 == num3 && num1 > num2) {
            System.out.println("Largest numbers are: " + num1 + " and " + num3);

        } else if (num2 == num3 && num2 > num1) {
             System.out.println("Largest numbers are: " + num2 + " and " + num3);

        } else if (num1 > num2 && num1 > num3) {
            System.out.println("Largest Number is: " + num1);

        } else if (num2 > num3 && num2 > num1) {
            System.out.println("Largest Number is: " + num2);

        } else {
            System.out.println("Largest Number is: " + num3);
        }

        sc.close();

    }
}
