public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Rifki", 90, 91, 90, 50, 60, 100);

    }

    static void sayCongrats(String nama, int... nilai) {
        var total = 0;
        for (var value : nilai) {
            total += value;
        }

        var ratarata = total / nilai.length;

        if (ratarata >= 75) {
            System.out.println("Selamat " + nama + " Anda Lulus !");
        } else {
            System.out.println("Maaf " + nama + " Anda Tidak Lulus !");
        }
    }
}
