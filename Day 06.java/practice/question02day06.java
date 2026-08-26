import java.util.Scanner;

public class question02day06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number:");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("First Number:" + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Sum : " + sum);

        sc.close();


    }
}
