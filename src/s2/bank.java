package s2;
import java.util.Scanner;

public class bank {
  public static void main(String[] args) {

    // Deklrasi Variable
    int saldo, pilihan, pilihan2, tf1, tf2, ambil, balik1, balik2, balik3, balik4, lagi, ambillagi, jt;
    String namatf;
    String[] stringArray = new String[10];
    int[] stringjt = new int[10];

    ambillagi = 'P';
    saldo = 100000;
    lagi = 'Y';
    tf1 = 50000;
    tf2 = 100000;
    int i = 9;

    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    while (lagi == 'y' || lagi == 'Y') {
      System.out.println("--------------------------------------------");
      System.out.println();
      System.out.println("Saldo : " + saldo);
      System.out.println("Menu Transaksi : ");
      System.out.println("1. Setor Tabungan");
      System.out.println("2. Ambil Tabungan");
      System.out.println("3. Transfer Antar Rekening");
      System.out.println("4. Mutasi Transfer");
      System.out.println("5. Keluar");
      System.out.println();
      System.out.print("Pilihan Menu Transaksi : ");
      pilihan = input.nextInt();
      switch (pilihan) {

        case 1:

          System.out.println();
          System.out.println("1. 50000");
          System.out.println("2. 100000");
          System.out.println();
          System.out.print("Pilih Nominal Yang Ingin Di Setor (1/2) : ");
          pilihan2 = input.nextInt();

          switch (pilihan2) {
            case 1:
              saldo += tf1;

              break;

            case 2:
              saldo += tf2;

              break;
            default:
              System.out.println("Mohon Masukkan Nomor Yang Benar");

          }

          break;
        case 2:

          System.out.println();
          System.out.println("1. 50000");
          System.out.println("2. 100000");
          System.out.println();
          System.out.print("Pilih Nominal Yang Ingin Di Ambil (1/2) : ");
          ambil = input.nextInt();

          balik2 = 1;
          if (ambil == 1) {
            balik1 = 50000;
            saldo -= balik1;
            balik2 = (saldo) + (balik1);
          } else if (ambil == 2) {
            balik3 = 100000;
            saldo -= balik3;
            balik2 = (saldo) + (balik3);

          } else {
            System.out.println("Mohon Masukkan Nomor Yang Benar");
          }

          if (saldo >= 50000) {
            continue;
          } else {
            saldo += balik2;
            System.out.println("Gagal, Harus Menyisakan 50000");
            System.out.println();
          }

          break;
        case 3:

          System.out.print("Masukkan Nama Rekening Tujuan : ");
          stringArray[i] = input.next();
          System.out.print("Masukkan Nominal Uang : ");
          stringjt[i] = input.nextInt();

          saldo -= stringjt[i];

          if (saldo >= 50000) {
            System.out.println("Sukses Transfer ke " + stringArray[i] + ", Jumlah : " + stringjt[i]);
          } else {
            saldo += stringjt[i];
            System.out.println("Gagal!, Harus Menyisakan 50000");
            stringArray[i] = null;
          }

          i--;

          break;
        case 4:
          System.out.println();
          System.out.println("Mutasi Transfer : ");

          for (int j = 0; j <= 9; j++) {

            if (stringArray[j] == null) {
              continue;
            } else {
              System.out.println("Transfer Ke " + stringArray[j] + " Sukses, Jumlah : " + stringjt[j]);
            }
          }

          break;
        case 5:

          lagi = 't';
          System.out.println("Progam Selesai");

          break;
        default:
          System.out.println("Mohon Masukkan Nomor Yang Benar");

      }
    }
  }
}
