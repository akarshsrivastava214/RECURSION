import java.util.Scanner;
public class Arr_MaxElement {
    static int max(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        int maxElem = max(arr, i + 1);
        if (arr[i] > maxElem) {
            return arr[i];
        }
        return maxElem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr, 0));
    }
}

