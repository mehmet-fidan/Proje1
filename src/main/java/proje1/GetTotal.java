package proje1;

import java.util.Scanner;

public class GetTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

        Ornek:
        String num1 = "$15";    String num2 = "$20";    String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";    String num2 = "$-80";   String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("bosluk bırakarak tutar giriniz");
        String str = scanner.nextLine();
        System.out.println(toplamMetodu(str));
    }
     public static int toplamMetodu(String str) {

    String newStr = str.replaceAll("\\$", "");

    String[] str2 = newStr.split(" ");
    int[] intStr = new int[str2.length];
    int toplam = 0;

        for(
    int i = 0;
    i<str2.length;i++)

    {
        intStr[i] = Integer.parseInt(str2[i]);
        toplam += intStr[i];

        if (toplam >= 0) {

            toplam=toplam ;
        } else {
           toplam = -1;
        }

    }return toplam;
    }
}
