//Vücut Kitle İndeksi Hesaplama
//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//
//Formül
//Kilo (kg) / Boy(m) * Boy(m)
import java.util.Scanner;
public class vucut_kitle_e {
    public static void main(String[]args){
        double boy, kilo,v_k_i;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :  ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        v_k_i = kilo / ( boy * boy );
        System.out.print("Vücut Kitle İndeksiniz : "+v_k_i);

    }
}
