public class question03day04 {
    
    public static void main(String[] args) {

        double price = 134.22;
        int value = (int) price;

        System.out.println(price);
        System.out.println(value);

    }
}
// Data loss: In this example, we are converting a double variable (price) to an int type. 
// This is known as narrowing conversion because we are converting a larger data type (double) to a smaller data type (int). 
// Narrowing conversions can result in data loss, as the decimal part of the double value will be truncated when converting to int.