package proje1;

import java.util.Locale;
import java.util.Scanner;

public class SesliHarfSayisi {

    /*
      Girilen bir stringdeki sesli harf sayısını return eden
      parametre olarak bir String alacak ve int olarak sesli harf sayısını
      return edecek getSesliSayisi() isimli bir method yazın.
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("icinde sesli harf olan cumle yazin");
        String metin = scanner.nextLine();


       System.out.println(getSesliSayisi(metin));

    }
    
    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static int getSesliSayisi(String str) {
        
        String strSesli="aeoöuüiı";
        int count=0;

        for (int i = 0; i <str.length() ; i++) {

            if (strSesli.indexOf(str.charAt(i))>-1)
            count++;

            
        }return count;

        }
}