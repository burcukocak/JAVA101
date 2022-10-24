/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız./*




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
