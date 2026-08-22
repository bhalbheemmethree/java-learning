public class question02day04 {
    
    public static void main(String[] args) {

        double number = 99.93;
        int value = (int) number;

        System.out.println(number);
        System.out.println(value);
    
    }
    
}
// Narrowing Conversion: In this example, we are converting a double variable (number) to an int type. This is known as narrowing conversion because we are converting a larger data type (double) to a smaller data type (int). Narrowing conversions can result in data loss, as the decimal part of the double value will be truncated when converting to int.