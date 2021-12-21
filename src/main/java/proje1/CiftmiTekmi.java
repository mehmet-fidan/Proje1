package proje1;

import java.util.Scanner;

public class CiftmiTekmi {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi= scanner.nextInt();

        if (sayi%2==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
  }

}
