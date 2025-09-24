/* Write a menu driven program to perform the following operations on multidimensional array
ie matrices :
▪ Addition
▪ Multiplication
▪ Exit */

import java.util.Scanner;

public class slip5_2 {
    public static void main(String args[]) {
        int n, ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimention of matrix: ");
        n = sc.nextInt();

        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] addn = new int[n][n];
        int[][] muln = new int[n][n];

        // Accept matrix A
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for position " + i + "x" + j + " :");
                m1[i][j] = sc.nextInt();
            }
        }
        // Accept matrix B
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element for position " + i + "x" + j + " :");
                m2[i][j] = sc.nextInt();
            }
        }

        while (true) {
            System.out.print("Menu\n1) Add matrix A and B\n2)Multiply Matrix A and B\nExit\n\nEnter your selection: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Addition of matrix A and B");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            addn[i][j] = m1[i][j] + m2[i][j];
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(addn[i][j] + "\t");
                        }
                        System.out.println("");
                    }
                    break;

                case 2:
                    System.out.println("Multiplication of matrix A and B");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            for (int k = 0; k < n; k++) {
                                muln[i][j] += m1[i][k] * m2[k][j];
                            }
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(muln[i][j] + "\t");
                        }
                        System.out.println("");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!!");
                    break;
            }
        }
    }
}
