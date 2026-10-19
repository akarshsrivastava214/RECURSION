import java.util.Scanner;
public class ProductOfDigits {
    public static int prod(int n) {
        if (n == 0)
            return 1;
        return n % 10 * prod(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prod(n));
        sc.close();
    }   
}
