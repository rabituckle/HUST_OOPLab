package implementings;

import java.util.*;

public class SolveEquation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nEquation Solver Menu:");
            System.out.println("1. Solve first-degree equation (ax + b = 0)");
            System.out.println("2. Solve system of first-degree equations");
            System.out.println("3. Solve second-degree equation (ax^2 + bx + c = 0)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveLinearSystem(scanner);
                    break;
                case 3:
                    solveQuadraticEquation(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void solveLinearEquation(Scanner scanner) {
        System.out.print("Enter a (coefficient of x): ");
        double a = scanner.nextDouble();
        System.out.print("Enter b (constant term): ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }
    }

    private static void solveLinearSystem(Scanner scanner) {
        System.out.println("Enter coefficients for the system:");
        System.out.print("Enter a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter c2: ");
        double c2 = scanner.nextDouble();

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Solution: x = " + x + ", y = " + y);
        }
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Enter a (coefficient of x^2): ");
        double a = scanner.nextDouble();
        System.out.print("Enter b (coefficient of x): ");
        double b = scanner.nextDouble();
        System.out.print("Enter c (constant term): ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation. Switching to linear equation...");
            solveLinearEquation(scanner);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two distinct solutions: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Double root: x = " + x);
        } else {
            System.out.println("No real solution.");
        }
    }
}
