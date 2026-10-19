import java.util.Scanner;
public class Arr_MinElement {
    static int min(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int minElem = min(arr, i + 1);
        if (arr[i] < minElem) {
            return arr[i];
        }
        return minElem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(min(arr, 0));
    }
}
