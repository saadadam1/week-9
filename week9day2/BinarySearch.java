import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };

        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (left > right) {
            System.out.println("Element not found");
        }
    }
}
