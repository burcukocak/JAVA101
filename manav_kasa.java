//Manav Kasa Programı
//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
import java.util.Scanner;
public class manav_kasa {
    public static void main(String[]args){
        double Armut = 2.14,Elma = 3.67 ,Domates = 1.11 ,Muz = 0.95 ,Patlıcan = 5.00,tutar ,a, d,m,p,e;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ?  ");
        a = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? ");
        e = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? ");
        d = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? ");
        m = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? ");
        p = input.nextDouble();

        tutar = (Armut*a) + (Elma*e) + (Domates*d) + (Muz*m) + (Patlıcan*p);
        System.out.print("Toplam Tutar :  "+ tutar);




    }
}
