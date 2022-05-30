package s2;

public class MethodReturn {
    public static void main(String[] args) {
        System.out.println(sum(50, 60));

        System.out.println(ngitung(100, "kurangi", 20));
    }

    static int sum(int angka1, int angka2){
        var total = angka1 + angka2;
        return total; }

    static int ngitung(int ongko1, String operasi, int ongko2){
        switch (operasi) {
            case "tambah":
            return ongko1 + ongko2;
            
            case "kurangi":
            return ongko1 - ongko2;

            default:
            return 0;
        }
        

    }

}
