package s2;
import java.text.DecimalFormat;

public class Bisection2 {
     static double fx(double x){
          double f_x;
          f_x = (Math.pow(x,2))-12;                                        //deklarasi soal x^2-12
          return f_x;
     }
public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("-                                       Kelompok 1                                       -");
        System.out.println("-                   Penyelesaian menghitung akar x^2-12 dengan metoda bagi dua           -");
        System.out.println("------------------------------------------------------------------------------------------");
        int i;                                                             //untuk menghitung banyaknya iterasi
        DecimalFormat df1=new DecimalFormat("##0.000000");
        double e1=0.04;                                                    //batas selang setelah iterasi
        double e2=0.04;                                                    //batas nilai f(x) mendekati nol
        double fa,fb,fc;
        fc=1000;                                                           //nilai fungsi f(x) pada titik a,b,c
        double a,b,c;                                                      //variabel untuk selang a,b dan c sebagai titik tengah
        a=2;b=4;c=0;                                                       //nilai selang awal a dan b
        i=1;                                                               //penomoran iterasi
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("i\ta\t\t\tb\t\t\tc\t\tf(c)");
        System.out.println("------------------------------------------------------------------------------------------");
        while((Math.abs(a-b)>e1)||(fc>e2)){
             c=(a+b)/2;                                                     //rumus umum bisection methood
             fa=fx(a);fx(b);fc=fx(c);
             System.out.println(i+"  "+df1.format(a)+"\t\t"+ df1.format(b)+"\t\t" + df1.format(c)+"\t\t"+df1.format(fc));
                 if((fa*fc)<0){
                     b=c;                                                  //selang baru a-c
                 }
                 else{
                    a=c;                                                   //selang baru b-c
                 }
                 i++;
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Hampiran akar = " + df1.format(c));
    }
}