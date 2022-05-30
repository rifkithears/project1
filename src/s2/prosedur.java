package s2;

public class prosedur {
    public static void main(String[] args) {
        ratarata();
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

    private static void name() {
        
    }
}
