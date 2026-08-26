import java.util.Scanner;

public class question01day06 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Your Age:");
            int Age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter your college name: ");
            String college = sc.nextLine();
            
            
            System.out.println("Name: " + name);
            System.out.println("Age: " + Age);
            System.out.println("College: " + college);
        }


    }
// Taking Basic User Input