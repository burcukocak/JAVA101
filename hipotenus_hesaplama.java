import java.util.Scanner;
public class hipotenus_hesaplama {
   public static void main(String[]args){
       int a ,b;
       double hipotenus;
       Scanner input = new Scanner(System.in);
       System.out.println("a kenarini giriniz: ");
       a = input.nextInt();
       System.out.println("b kenarini giriniz: ");

       b =input.nextInt();

       hipotenus = Math.sqrt(a*a + b*b );
       System.out.println("hipotenus:  "+ hipotenus);
       hipotenus = input.nextDouble();

   }
}
