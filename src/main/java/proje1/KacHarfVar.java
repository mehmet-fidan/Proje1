package proje1;

import java.util.Scanner;

public class KacHarfVar {

    /*
        Kullanıcıdan önce bir cümle, daha sonra bir harf isteyiniz.
        Parametresi bir String ve bir char olan ve kullanıcının girdilerini alıp
        String içinde kaç adet char olduğunu return eden bir method yazınız ve ekrana yazdırınız.
    */

    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız.

        Scanner scannerS=new Scanner(System.in);

        System.out.println("cumle giriniz");
        String cumle= scannerS.nextLine();
        Scanner scannerC=new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf=scannerC.next().charAt(0);

        System.out.println(getCharNumber(cumle,harf));


    }
    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static int getCharNumber(String str, char ch){

        int count=0;

        for (int i = 0; i <str.length(); i++) {
           if (str.charAt(i)==ch)
            count++;
        }

        return count;
    }
}


