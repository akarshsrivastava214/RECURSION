import java.util.Scanner;
public class Str_ReplaceChr {
    static String replace(String s, char oldChar, char newChar, int i) {
        if (i == s.length()) {
            return "";
        }
        if (s.charAt(i) == oldChar) {
            return newChar + replace(s, oldChar, newChar, i + 1);
        }
        return s.charAt(i) + replace(s, oldChar, newChar, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);
        System.out.println(replace(s, oldChar, newChar, 0));
        sc.close();
    }
}
