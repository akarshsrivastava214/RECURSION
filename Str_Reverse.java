import java.util.*;
public class RevStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverse(s, s.length() - 1);
        sc.close();
    }
    static void reverse(String s, int i) {
        if (i < 0)
            return;
        System.out.print(s.charAt(i));
        reverse(s, i - 1);
        System.out.println();
    }
}
