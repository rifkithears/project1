package s2;

public class tugasprocedure {
    public static void main(String[] args) {
        System.out.println("Program Mencari Rata Rata :");
        ratarata();
        System.out.println();
        System.out.println("Program Mencari Nilai Min dan Max :");
        minmax();
        System.out.println();
        System.out.println("Program Mencari Angka Ganjil :");
        ganjil();
    }

    private static void ratarata() {
        double jumlah = 0;
        double ratarata;
        int[] array = { 21, 8, 17, 35, 12, 18 };

        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }
        ratarata = (jumlah / 6);
        System.out.println("Rata Ratanya adalah : " + ratarata);
    }

    private static void minmax() {
        int[] array = { 21, 8, 17, 35, 12, 18 };
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Nilai minimal = " + min);
        System.out.println("Nilai maksimal = " + max);
    }

    private static void ganjil() {
        int ganjil;
        int[] array = { 21, 8, 17, 35, 12, 18 };

        for (int i = 0; i < array.length; i++) {
            ganjil = array[i] % 2;
            if (ganjil != 0) {
                System.out.println(array[i]);

            }
        }
    }
}
