package s2;
public class array3 {
    public static void main(String[] args) {

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
