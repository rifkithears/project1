package s2;
import java.util.Scanner;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MatriksA[][] = new int[3][3];
        int MatriksB[][] = new int[3][3];

        System.out.println("Masukkan Elemen Matriks A : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatriksA[i][j] = input.nextInt();
            }
        }

        System.out.print("\nData Matriks A : \n");
        for (int[] x : MatriksA) {
            for (int y : x) {
                System.out.print(y + "        ");
            }
            System.out.println();
        }

        System.out.println("\nMasukkan Elemen Matriks B : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatriksB[i][j] = input.nextInt();
            }
        }

        System.out.print("\nData Matriks B : \n");
        for (int[] m : MatriksB) {
            for (int n : m) {
                System.out.print(n + "        ");
            }
            System.out.println();
        }

        // creating another matrix to store the multiplication of two matrices
        int c[][] = new int[3][3]; // 3 rows and 3 columns

        // multiplying and printing multiplication of 2 matrices
        System.out.print("\nHasil Penambahan Matriks A dan B : \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += MatriksA[i][k] * MatriksB[k][j];
                } // end of k loop

                System.out.print(c[i][j] + "        "); // printing matrix element
            } // end of j loop
            System.out.println();// new line
        }
    }
}