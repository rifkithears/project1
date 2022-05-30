package s2;

public class array1 {
    public static void main(String[] args) {
        double jumlah = 0;
        double ratarata;
        int[] array = { 21, 8, 17, 35, 12, 18 };

        for (int i = 0; i < array.length; i++) {
            jumlah += array[i];
        }
        ratarata = (jumlah / 6);
        System.out.println("Rata Ratanya adalah : " + ratarata);
    }
}
