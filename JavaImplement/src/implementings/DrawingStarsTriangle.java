package implementings;

import java.util.*;

public class DrawingStarsTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the size of the stars triangle: ");
		int size = sc.nextInt();
		int numSpace, numStars;
		sc.close();
		System.out.println("Your stars triangle: ");
		for (int i = 1; i <= size; ++i) {
			numStars = 2 * i - 1;
			numSpace = ((2 * size - 1) - numStars)/2;
			for (int j = 0; j < numSpace; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < numStars; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < numSpace; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
