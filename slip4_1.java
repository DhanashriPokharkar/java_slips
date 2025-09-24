/* Write a program to print an array after changing the rows and columns of a given
two-dimensional array. */

import java.util.Scanner;

public class slip4_1 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of rows n columns: ");
        n = sc.nextInt();

        int[][] m = new int[n][n];
        int[][] r = new int[n][n];

        // Get matrix from user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for " + i + "x" + j + ": ");
                m[i][j] = sc.nextInt();
            }
        }

        // Display matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println("");
        }

        // flip matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[i][j] = m[j][i];
            }
        }

        // Display reverse matrix
        System.out.println("Reversed matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
