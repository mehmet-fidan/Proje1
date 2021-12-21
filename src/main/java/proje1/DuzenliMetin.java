package proje1;

import java.util.Locale;
import java.util.Scanner;

public class DuzenliMetin {

    /*
    Girilen bir metnin kelimelerinin ilk harfini büyük diğer harflerini küçük yapan
    ve düzenlenmiş bu metni return eden metinDuzenle() isimli bir method yazın.

    Example 1:  input: " jAva  öGRENEbildiniz MI? "      output: "Java Ögrenebildiniz Mi?"
     */
    public static void main(String[] args) {
        // Kodlarınızı buradan sonra yazınız. Scanner classı da burada tanımlayınız

        Scanner scanner=new Scanner(System.in);
        System.out.println("metin girin");
        String metin= scanner.nextLine();

        System.out.println(metinDuzenle(metin));

    }

    // bu methodun parametre ve return typelarını doğru yapılandırın
    public static String metinDuzenle(String str){

        String[] metinNew=str.split(" ");
         String yenihal="";

        for (int i = 0; i <metinNew.length ; i++) {
            yenihal+=metinNew[i].substring(0,1).toUpperCase()+metinNew[i].substring(1).toLowerCase()+ " ";
        }
        return yenihal;
    }
}
