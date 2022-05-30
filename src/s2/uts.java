package s2;
import java.util.Scanner; //Memanggil Scanner untuk merekam input user
public class uts {
    public static void main(String[] args) {
        int pArray = 0 ;
        int nNama = 1;
        int nomor = 0;
        Scanner input = new Scanner(System.in); //Membuat Objek Scanner
        System.out.print("Masukkan Jumlah Mahasiswa : "); //Menentukan Panjang Array
        pArray = input.nextInt();
        int[] nilUjian = new int[pArray];
        String[] arrayNama = new String[pArray];
        char[] indeksNilai = new char[pArray];

        for (int i = 0; i < arrayNama.length; i++) {
            System.out.println("Masukkan Mahasiswa Ke "+nNama+" :");
            System.out.print("Nama : "); //Menginput Nama
            arrayNama[i] = input.next();
            System.out.print("Nilai : ");  //Menginput Nilai
            nilUjian[i] = input.nextInt();

            nNama++;

            // Menentukan Indeks Nilai Yang Sesuai 
            if (nilUjian[i]>=80) {
                indeksNilai[i]='A';
            } else if (nilUjian[i]<80 && nilUjian[i]>=70) {
                indeksNilai[i]='B';
            } else if (nilUjian[i]<70 && nilUjian[i]>=55) {
                indeksNilai[i]='C';
            } else if (nilUjian[i]<55 && nilUjian[i]>=45) {
                indeksNilai[i]='D';
            } else {
                indeksNilai[i]='E';
            }
        }

        
        System.out.println();
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=========================");
        System.out.println("No      Nama     Nilai     Indeks");
        // Perulangan Untuk Menampilkan Hasil Data
        for (int i = 0; i < indeksNilai.length; i++) {
            nomor++;
            System.out.println(nomor+"       "+arrayNama[i]+"     "+nilUjian[i]+"          "+indeksNilai[i]);
        }

        
    }
}
