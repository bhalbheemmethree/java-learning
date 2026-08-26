import java.util.Scanner;

public class question05day06 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Your Height: ");
        double height = sc.nextDouble();

        System.out.print("Enter Your Marks: ");
        int marks = sc.nextInt();
        
        double percentage = (marks / 500.0) * 100;

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Marks: " + marks);
        System.out.println("Percanatage: " + percentage);



    }
}
