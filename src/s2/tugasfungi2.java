package s2;
import java.util.Scanner;
public class tugasfungi2 {
    private static int[] inputarray = new int[10];
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("Fungsi Pertama --> Menginput Data");
        inputuser();
        System.out.println("----------------------------------");
        System.out.println("Fungsi Kedua --> Mecari Rata-Rata");
        ratarata();
        System.out.println("----------------------------------");
        System.out.println("Fungsi Ketiga --> Mecari Nilai Minimal");
        min();
        System.out.println("----------------------------------");
        System.out.println("Fungsi Keempat --> Mecari Nilai Maximal");
        max();
    }
   // Fungsi Pertama
    private static void inputuser() {
        Scanner input = new Scanner(System.in);
        int nomor = 1;

        for (int i = 0; i < inputarray.length; i++) {
            System.out.print("Masukkan Nilai ke -" +nomor+ " : ");
            inputarray[i] = input.nextInt();
            nomor++;
        }
        input.close();
    }
    // Fungsi Kedua 
     private static double ratarata() {
        double jumlah = 0;
        double ratarata;

        for (int i = 0; i < inputarray.length; i++) {
            jumlah += inputarray[i];
        }
        ratarata = (jumlah / 10);
        System.out.println("Rata Ratanya adalah : " + ratarata);
        return ratarata;
     }
     //Fungsi Ketiga 
     private static int min(){
        int min = inputarray[0];

        for (int i = 0; i < inputarray.length; i++) {

            if (min > inputarray[i]) {
                min = inputarray[i];
            } 
        }
        System.out.println("Nilai minimal = " + min);
        return min;
     }
     // Fungsi Keempat 
    private static int max() {
        int max = inputarray[0];

        for (int i = 0; i < inputarray.length; i++) {

            if (max < inputarray[i]) {
                max = inputarray[i];
            } 
        }
        System.out.println("Nilai maximal = " + max);
        return max;
    }

}
