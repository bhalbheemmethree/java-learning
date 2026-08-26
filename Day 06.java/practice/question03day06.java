import java.util.Scanner;

public class question03day06 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name :");
        String name = sc.nextLine();

        System.out.print("Enter your age :");
        int age = sc.nextInt();

        System.out.print("Enter Your CGPA :");
        double cgpa = sc.nextDouble();

        System.out.print("Enter Your Grade :");
        char grade = sc.next().charAt(0);

        System.out.print("Are You Passed :");
        boolean isPassed = sc.nextBoolean();

        System.out.println("Student Details :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);

        sc.close();
    }
}
// Building a student profile 


