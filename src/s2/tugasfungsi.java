package s2;
public class tugasfungsi {

    public static void main(String[] args) {
        cekpy(3, 4, 5); 
        cekpy(5, 12, 13);
        cekpy(6, 8, 10);
        cekpy(8, 15, 17);

    }

    private static double cekpy(double a, double b, double c) {
        double aK = Math.pow(a, 2); //deklarasi nilai A ke nilai kuadrat
        double bK = Math.pow(b, 2); // deklarasi nilai B ke nilai kuadrat
        double cK = Math.pow(c, 2); //deklarasi nilai C ke nilai kuadrat
        double total = aK + bK; //rumus triple phytagoras
        
        // mengkonversi nilai a,b,c menjadi integer agar mudah di baca
        int vA = (int)a;
        int vB = (int)b;
        int vC = (int)c;

        // pengecekan apakah nilai yang diinput triple phytagoras
        if (total == cK) {
           System.out.println("Ya, nilai : "+vA+" "+vB+" "+vC+" , Merupakan Triple Phytagoras");
        } else {
            System.out.println("Tidak, nilai : "+vA+" "+vB+" "+vC+" , Bukan Triple Phytagoras");
        }
        //mengembalikan nilai total
        return total;
    }
}
