package s2;

import java.util.Scanner;

public class testarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Deklarasi Variable
        int MatriksA[][] = new int[3][3]; // 3 Kolom Dan Baris
        int MatriksB[][] = new int[3][3]; // 3 Kolom Dan Baris
        char menu = 'Y';
        int pilihan;

        System.out.println("Masukkan Elemen Matriks A : ");
        // Menginput nilai nilai matriks dari User
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatriksA[i][j] = input.nextInt();
            }
        }
        // Menampilkan hasil inputan dari user dalam bentuk Matriks
        System.out.print("\nData Matriks A : \n");
        for (int i = 0; i < MatriksA.length; i++) {
            for (int j = 0; j < MatriksA[i].length; j++) {
                System.out.print(MatriksA[i][j] + "     ");
            }
            System.out.println();
        }

        System.out.println("\nMasukkan Elemen Matriks B : ");
        // Menginput nilai nilai matriks dari User
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MatriksB[i][j] = input.nextInt();
            }
        }
        // Menampilkan hasil inputan dari user dalam bentuk Matriks
        System.out.print("\nData Matriks B : \n");
        for (int i = 0; i < MatriksB.length; i++) {
            for (int j = 0; j < MatriksB[i].length; j++) {
                System.out.print(MatriksB[i][j] + "     ");
            }
            System.out.println();
        }
        // Membuat menu pilihan untuk user
        while (menu == 'Y' || menu == 'y') {
            System.out
                    .print("\n----------------\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Keluar\nSilahkan Pilih : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nHasil Penjumlahan Matriks A dan B :\n");
                    int c[][] = new int[3][3]; // Membuat variable array baru untuk menyimpan hasil

                    // Proses penambahan dan menampilkan hasil
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            c[i][j] = MatriksA[i][j] + MatriksB[i][j];
                            System.out.print(c[i][j] + "     ");
                        }
                        System.out.println();

                    }

                    break;
                case 2:
                    System.out.print("\nHasil Pengurangan Matriks A dan B :\n");
                    int d[][] = new int[3][3]; // Membuat variable array baru untuk menyimpan hasil

                    // Proses pengurangan dan menampilkan hasil
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            d[i][j] = MatriksA[i][j] - MatriksB[i][j];
                            System.out.print(d[i][j] + "     ");
                        }
                        System.out.println();

                    }
                    break;
                case 3:
                    System.out.print("\nHasil Perkalian Matriks A dan B : \n");
                    int e[][] = new int[3][3]; // Membuat variable array baru untuk menyimpan hasil

                    // Proses perkalian dan menampilkan hasil
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            e[i][j] = 0;
                            for (int k = 0; k < 3; k++) {
                                e[i][j] += MatriksA[i][k] * MatriksB[k][j];
                            } 
                            System.out.print(e[i][j] + "        ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    menu = 'n';
                    break;

                default:
                    System.out.println("Mohon pilih menu yang benar");//Jika user salah menginput nomor
                    break;
            }

        }

    }

}
