import java.util.Scanner;

public class question03day07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0 ) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
