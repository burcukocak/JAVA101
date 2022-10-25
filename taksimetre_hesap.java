//Taksimetre Programı
//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.


import java.util.Scanner;

public class taksimetre_hesap {
    public static void main(String[]args){
        int mesafe,taksimetre=10;
        double km_t=2.20,odenecek_t;
        Scanner input = new Scanner(System.in);


        System.out.print("gidilen KM miktarini yaziniz = ");

        mesafe = input.nextInt();

        //odenecek_t =input.nextDouble();
        odenecek_t = taksimetre + (km_t * mesafe);
        double inp = odenecek_t < 20  ? 20.0 : odenecek_t;
        System.out.println("odenecek tutar = "+ inp);

    }
}
