package proje1;

import java.util.Scanner;

public class Factoriyel {

    /*
        Girilen pozitif bir sayının faktöriyel değerini bulmak için bir program yazın.
        Sayı negatif girilirse 0 yazsın

        number : 5     ise  (factorial : 1*2*3*4*5=120)
        output : 120

    */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi= scanner.nextInt();

        int faktoryel=1;

       if (sayi>0) {

        for (int i = 1; i <=sayi ; i++) {
            faktoryel*=i;
        }
           System.out.println("Faktöryel Sonuç ="+ faktoryel);

        } else {
           System.out.println("Faktöryel Sonuc= 0 ");
       }
   }
}
