import java.util.*;
import java.util.Scanner;

class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 34, 45, 5, 8 };
		System.out.println("Enter number to be searched");
		int s = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("number found");
		} else {
			System.out.println("not found");
		}

	}
}