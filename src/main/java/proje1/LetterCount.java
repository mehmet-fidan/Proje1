package proje1;


import java.util.Scanner;

public class LetterCount {

    /*
      Girilen bir stringdeki harf sayısı tek ise true, değilse false yazdırınız.
     */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("metin giriniz");
        String myStr= scanner.nextLine();
        String newStr;
        newStr=myStr.replace(" ", "");

        if ((newStr.length()%2)==0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
