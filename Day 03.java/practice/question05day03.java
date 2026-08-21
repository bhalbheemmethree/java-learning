public class question05day03 {

    public static void main(String[] args) {

        String name;
        name = "BHALBHEEM";

        byte age;
        age = 20;

        short admissionNumber;
        admissionNumber = 12345;

        int rollNumber;
        rollNumber = 123456789;
        
        long phoneNumber;
        phoneNumber = 9100020163L;

        float attendancePercentage;
        attendancePercentage = 75.5f;

        double CGPA;
        CGPA = 8.5;

        char grade = 'A';
        grade = 'B';

        final boolean isPassed = true;
        // isPassed = false; // This line will cause a compilation error because isPassed is declared as final.

        System.out.println("Student Record");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Admission Number: " + admissionNumber);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("CGPA: " + CGPA);
        System.out.println("Grade: " + grade);
        System.out.println("Is Passed: " + isPassed);

    }



}