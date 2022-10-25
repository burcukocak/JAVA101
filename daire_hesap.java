//Dairenin Alanını ve Çevresini Hesaplayan Program
  //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
   //Alan Formülü : π * r * r;
  //Çevre Formülü : 2 * π * r;

          // Ödev
  //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
  // 𝜋 sayısını = 3.14 alınız.
  // Formül : (𝜋 * (r*r) * 𝛼) / 360

import java.util.Scanner;
public class daire_hesap {
  public static void main(String[]args){

   double yaricap ,pi=3.14, alan,cevre,merkez_aci,dilim_alan;
   Scanner input = new Scanner(System.in);

   System.out.print("Yaricapi giriniz:  ");
   yaricap = input.nextDouble();
   System.out.print("Merkez aci olcusunu giriniz:  ");
   merkez_aci = input.nextDouble();


   dilim_alan = (pi * ( yaricap*yaricap) * merkez_aci) / 360;
   System.out.println("Daire dilimin alani : "+dilim_alan);

   alan = pi * yaricap * yaricap;
   System.out.println("Dairenin alani : "+alan);

   cevre = 2 * pi * yaricap;
   System.out.println("Dairenin cevresi : "+cevre);
   



  }
}
