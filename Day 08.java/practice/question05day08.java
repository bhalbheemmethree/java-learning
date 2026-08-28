public class question05day08 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 34; i++) {

            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even numbers: " + count);
    }
}