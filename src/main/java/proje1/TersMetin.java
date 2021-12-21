package proje1;

import java.util.Scanner;

public class TersMetin {

    /*
    Girilen bir metnin tersini ekrana yazdırınız.

    Example 1:  input: Turkiye       output: eyikruT
     */
    public static void main(String[] args) {
         // Kodlarınızı buradan sonra yazınız.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Metin giriniz");
        String text= scanner.nextLine();

        String newText="";
        char ch;
        for (int i = text.length()-1; i >=0 ; i--) {
            ch=text.charAt(i);
            newText+=ch;

        }
        System.out.println(newText);

    }

}
