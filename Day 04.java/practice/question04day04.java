public class question04day04 {

    public static void main(String[] args) {

        char grade = 'B';
        int value = grade; // Casting char to int to get the ASCII value

        System.out.println(grade);
        System.out.println(value);
    }
    
}
// without explicitly casting, the char 'B' is automatically promoted to its corresponding 
// ASCII value when assigned to an int variable. The ASCII value of 'B' is 66