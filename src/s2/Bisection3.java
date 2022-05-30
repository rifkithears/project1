package s2;
import java.text.DecimalFormat;
public class Bisection3 {

                /*menghitung akar f(x)=3e^x-2x^2 + 5 dengan metoda bagi dua
                 */
                 static double fx(double x)
                 {
                                double f_x;
                                double e=2.718281828459;
                                f_x = (3*Math.pow(e,x))-(2*Math.pow(x,2))+5;
                                return f_x;
                 }
                 public static void main(String args[])
                 {
                                int i; //untuk menghitung banyaknya iterasi
                                DecimalFormat df1=new DecimalFormat("##0.000000");
                                double e1=0.000001; //batas selang setelah iterasi
                                double e2=0.0000001; //batas nilai f(x) mendekati nol
                                double fa,fb,fc;
                                fc=1000;//nilai fungsi f(x) pada titik a,b,c
                                double a,b,c;//variabel untuk selang a,b dan c sebagai titik tengah
                                a=-1.7;b=-1.6;c=0;//nilai selang awal a dan b
                                i=0;
                                System.out.println("----------------------------------");
                                System.out.println("i\t\ta\t\t\t\tb\t\t\tc\t\t\tf(c)");
                                System.out.println("----------------------------------");
                                while((Math.abs(a-b)>e1)||(fc>e2))
                                {
                                                c=(a+b)/2;
                                                fa=fx(a);fx(b);fc=fx(c);
                                                System.out.println(i+"  "+df1.format(a)+"\t\t"+ df1.format(b)+"\t\t" + df1.format(c)+"\t\t"+df1.format(fc));
                                                if((fa*fc)<0)
                                                {
                                                                //selang baru a-c
                                                                b=c;
                                                }
                                                else
                                                {
                                                                //selang baru b-c
                                                                a=c;
                                                }
                                                i++;
                                }
                                System.out.println("----------------------------------");
                                System.out.println("Hampiran akar = " + df1.format(c));
}
}
