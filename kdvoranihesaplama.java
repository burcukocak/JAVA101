
import java.util.Scanner;
public class kdvoranihesaplama {
    public static void main(String[]args){
        double tutar,kdvOrani,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ürünün tutarını giriniz:");
        tutar = input.nextDouble();

        kdvOrani = tutar<1000 ? tutar*0.18 : tutar*0.08;
        kdvliTutar = tutar +kdvOrani ;
        System.out.println("tutar: "+tutar);
        System.out.println("kdv oranı: "+kdvOrani);
        System.out.println("kdvli tutar: "+kdvliTutar);





    }
}
