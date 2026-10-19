import java.util.*;
public class Palindrome {
    public static boolean Palindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }
    public static boolean helper(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return helper(s, start + 1, end - 1);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (Palindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}
