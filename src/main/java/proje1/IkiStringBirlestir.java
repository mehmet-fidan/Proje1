package proje1;

import java.util.Scanner;

public class IkiStringBirlestir {
        /*
        Kullanıcıdan alınan iki adet Stringi birbirlerine ekle.
        Eger ilk kelimenin son harfi,
            ikinci kelimenin ilk harfi ile aynı ise
        aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                     012 --> 3
                    "abc", "dog"  -->"abcdog"
         */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk kelimeyi girin");
        String ilkKelime= scanner.nextLine();
        System.out.println("ikinci Kelimeyi girin");
        String sonKelime=scanner.nextLine();


        if (ilkKelime.substring(ilkKelime.length()-1).equals(sonKelime.substring(0,1))){
            System.out.println(ilkKelime.concat(sonKelime.substring(1)));

        } else {
            System.out.println(ilkKelime.concat(sonKelime));
        }

    }
}
