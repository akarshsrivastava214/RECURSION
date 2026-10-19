import java.util.Scanner; 
public class Str_CountOccOfChr {
    static int count(String s, char ch, int i) {
        if (i == s.length()) {
            return 0;
        }
        if (s.charAt(i) == ch) {
            return 1 + count(s, ch, i + 1);
        }
        return count(s, ch, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println(count(s, ch, 0));
        sc.close();
    }
}

