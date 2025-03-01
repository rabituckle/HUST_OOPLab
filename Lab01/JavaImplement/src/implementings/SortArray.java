package implementings;

import java.util.*;

public class SortArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[] numbers;
        System.out.print("Manually? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("yes")) {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            numbers = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
        } else {
            numbers = new int[]{1789, 2035, 1899, 1456, 2013};
            System.out.println("Default array: " + Arrays.toString(numbers));
        }

        scanner.close();

        Arrays.sort(numbers);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
  
	}
}
