import java.util.Scanner;
public class BinarySearch {
    static int BinarySearch(int arr[], int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] > target)
            return BinarySearch(arr, start, mid - 1, target);
        else
            return BinarySearch(arr, mid + 1, end, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = BinarySearch(arr, 0, n - 1, target);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
        sc.close();
    }
}
