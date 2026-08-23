public class question05day05 {
    public static void main(String[] args) {
        
        int x = 5;

        int a = x++;
        int b = ++x;
        int c = x--;

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
// Expression Tracking