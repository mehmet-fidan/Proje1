package proje1;

import java.util.Scanner;

public class TamKare {
    /*
       Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       tamkare ise true  değilse false yazdırınız.

        Not: sqrt gibi fonksiyonları  kullanmayın.

        Örnek 1:    Input: 16   ise     Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:  Input: 25   ise     Output: true
        Note: bu sayı tamkare çünkü 5*5=25

        Example 3:  Input: 14   ise     Output: false
        Note: herhangi aynı iki tamsayının çarpımı 14 etmez

     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        int carpim=0;


        for (int i = 0; i*i <=num; i++) {
            carpim=i*i;
            }  boolean sonuc=carpim==num;

                 System.out.println(sonuc);
             }


      /*  int num1=(int) (Math.sqrt(num));

        if (Math.pow(num1,2)==num) {
            System.out.println("true");

        } else {

            System.out.println("false");
        }
       */

        }

