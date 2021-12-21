package proje1;

import java.util.Scanner;

public class GetSubstring {

        /*
              Kullanıcıdan bir metin alınız, daha sonra iki adet integer sayı alınız.
              Kullanıcının girdiği girdiği metni ve sayıları parametre olarak alan
              ve bu sayılar dahil arasındaki metni return eden
              getSubString adinda bir method yazın
              Negatif ya da metin uzunluğundan fazla ya da önce büyük sonra küçük index
              girilme durumları için programınız düzenleme yapabilsin
              Bu işlemi yapmak için
              Örnek:
              Metin : Java dünyası
              int i = 9;  int j = 2;  ise (girilen sayılar index değil harfin bulunma sırası olmalıdır)
              Burada gırıs sırası ters olsa da ve siz 2 (dahil) ile 9 (dahil) arası substring'i yazdırmalısınız
              ekrana "ava düny" yazmalıdır

         */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.
        Scanner scannerS=new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String metin= scannerS.nextLine();
        System.out.println("birinci sayiyi giriniz ");
        int num1= scannerS.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int num2=scannerS.nextInt();

     System.out.println(getSubString(metin,num1,num2));


    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static String getSubString(String str, int num1, int num2){

        int ind1 = Math.min(num1,num2);
        int ind2= Math.max(num1,num2);
        if (ind1<1) ind1=1;
        if (ind2>str.length()) ind2=str.length();

        return str.substring(ind1-1, ind2);
   }

    }




