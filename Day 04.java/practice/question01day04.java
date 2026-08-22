public class question01day04 {
    public static void main(String[] args) {

        int salary = 50000;

        double value = salary;
        float value1 = salary;
        long value2 = salary;

        System.out.println("Salary: " + salary);
        System.out.println("Value (double): " + value);
        System.out.println("Value (float): " + value1);
        System.out.println("Value (long): " + value2);

    }
}
// Widening Conversion: In this example, we are converting an int variable (salary) to double, float, and long types. This is known as widening conversion because we are converting a smaller data type (int) to larger data types (double, float, long). Widening conversions are safe and do not result in data loss.