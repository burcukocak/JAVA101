//Ödev
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//Formül
//Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//𝑢 = (a+b+c) / 2
//
//Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
import java.util.Scanner;
public class ucgen_alan {
    public static void main(String[]args){
        int a,b,c;
        double alan,x;
        Scanner input = new Scanner(System.in);
        System.out.println("a kenari: ");
        a= input.nextInt();
        System.out.println("b kenari: ");
        b = input.nextInt();
        System.out.println("c kenari: ");
        c = input.nextInt();
        x=((a+b+c)/2);
        alan=Math.sqrt(x*(x-a)*(x-b)*(x-c));
        System.out.println("Alan:"+alan);


    }

}
