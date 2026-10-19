import java.util.Scanner;
public class Str_RemoveChr {
    static String remove(String s, char ch, int i) {
        if (i == s.length()) {
            return "";
        }
        if (s.charAt(i) == ch) {
            return remove(s, ch, i + 1);
        }
        return s.charAt(i) + remove(s, ch, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(remove(s, ch, 0));
        sc.close();
    }
}
