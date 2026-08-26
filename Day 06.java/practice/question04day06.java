import java.util.Scanner;

public class question04day06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number :");
        int num1 = sc.nextInt();
        
        System.out.print("Enter Second Number :");
        int num2 = sc.nextInt();
        
        System.out.print("Enter Third Number :");
        double num3 = sc.nextDouble();

        double sum = num1 + num2 + num3;
        double difference = num1 - num2;
        double product = num1 * num2 * num3 ;
        double average = (num1 + num2 + num3) / 3 ;

        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
        System.out.println("Third number is: " + num3);

        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Difference of numbers is: " + difference);
        System.out.println("Product of numbers is: " + product);
        System.out.println("Average of numbers is: " + average);

        sc.close();

    }
}
// Taking numbers and using arthemetic operators