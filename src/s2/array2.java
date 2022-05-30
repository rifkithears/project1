package s2;

public class array2 {
    public static void main(String[] args) {
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
}
