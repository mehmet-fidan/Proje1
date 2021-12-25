package proje2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KayitIslemleri2 {

    /**
     * Key olarak ögrencinin adini ve
     * value olarak notlari kaydetmek icin bir Integer Arraylist
     * property"si olan bir HashMap tanimlayin
     * do loop icinde switch case kullanarak menüler icinde gezinin ve islemleri yapin
     */

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        HashMap<String, ArrayList<Integer>> list = new HashMap<>();

        int islem;
        do {
            islem=menu();
            switch (islem) {
                case 1:
                    ogrenciKayit();
                    break;
                /*methodundan dönen Ögrenci ismini kullanicidan alip map"e ekleyin*/
                // Kodlarinizi buradan sonra yazin

                case 2:
                    ogrenciNotGirisi(ogrenciKayit(),list); break;
                // list mapini println ile yazdirin
                // Listelenen ögrenci isimlerinden kullanicinin isim isteyin.
                // Kullanicinin girdigi isim icin ogrenciNotGirisi() methodunu kullanin ve
                // ogrenci notlarini kaydedin
                // hatali isim girilirse "Aranan Ogrenci Bulunamadi" uyarisi verin
                // Kodlarinizi buradan sonra yazin

                case 3: listeleNotlar(list);break;
                // notlari listele methodunu kullanarak tüm ögrencilerin notlarini listeletin
                // Kodlarinizi buradan sonra yazin
                case 4: listeleOrtalamalar(list);break;
                default:
                    // Kodlarinizi buradan sonra yazin

            }
        } while (islem != 0);
    }


    /**
     * Bu method parametre almayacak
     * Ekran görüntüsü asagidaki gibi olmali
     * Yapilacak islemin sira numarasini secin:
     * 1 : Yeni Ögrenci Kayit
     * 2 : Not Girisi
     * 3 : Ögrenci Notlari
     * 4 : Not Ortalamalari
     * 0 : Cikis
     * Seciminiz :
     */
    public static int menu() {
        // Kodlarinizi buradan sonra yazin
        Scanner scan = new Scanner(System.in);

        System.out.println("1: Ogrenci Kayit");
        System.out.println("2: Not Girisi");
        System.out.println("3: Ogrenci Notlari");
        System.out.println("4: Not ortalamalrı");
        System.out.println("0: Cikis");
        System.out.println("yapilacak islem seciniz");
        int secim = scan.nextInt();
        return secim;
    }

    /**
     * Bu method parametre almayacak
     * scanner"dan girilen ogrenci ismini okuyacak.
     * isimDuzenle(String name); methodunu kullanarak ismi düzenleyecek
     * düzenlenmis ismi return edecek
     */
    public static String ogrenciKayit() {
        // Kodlarinizi buradan sonra yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("Ogrenci ismi girin");
        String name = scan.nextLine();
        isimDuzenle(name);

        return name;
    }

    /**
     * Bu method bir String parametre alacak
     * aldigi Stringi düzenleyip return edecek.
     * Isim kac kelime ise her kelimenin ilk harfi büyük diger harfleri kücük ve
     * aralarinda bir bosluk olacak sekilde düzenleyecek.
     * str.trim().replaceAll("[ ]+"," ");  ifadesi
     * baştaki ve sondaki boşlukları siler, birden fayla bosluk da olsa yerine tek bosluk yazar.
     * Örnek:
     * name = "  jaVa    dunYA  " olarak methoda girse de
     * return "Java Dunya" seklinde olacak.
     */
    public static String isimDuzenle(String name) {
        // Kodlarinizi buradan sonra yazin
        String[] str = name.trim().replaceAll("[ ]+", " ").split(" ");
        String newStr = "";
        for (int i = 0; i < str.length; i++) {
            newStr += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1).toLowerCase() + " ";
        }

        return newStr;
    }

    /**
     * Bu method bir String ve mainde tanimli HashMap'i parametre alacak
     * [0-100] arasi girilen tüm notlari bir ArrayList"e kaydedecek
     * [0-100] araligi disinda sayi girilirse bu sayiyi ArrayList"e kaydetmeyecek
     * ve döngüden cikacak. Sonra ismi gelen öğrenci hanesine map'a (list) ekleyecek (put methodu).
     * main'deki list HashMap'i bu methoda gönderirseniz, main'deki list'i güncellemiş olursunuz
     */
    public static void ogrenciNotGirisi(String ogrenciAdi, HashMap<String, ArrayList<Integer>> list) {
        // Kodlarinizi buradan sonra yazin
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> notList = new ArrayList<>();
        int not=0;

        do {
            not = scan.nextInt();
            if (not >= 0 && not <= 100)
                notList.add(not);
        }
        while (not >=0 && not <= 100) ;
        list.put(ogrenciAdi, notList);

      /*  while(true) {
            int n =scan.nextInt();
            if (not < 0 || not > 100) break;
            notList.add(n);
              */
    }


    /**
     * Bu method mainde tanimli HashMap'i (list) parametre alacak
     * kaydedilen tüm ögrencileri, notlari ile birlikte ekrana yazdiracak
     * Cikti asagidaki gibi olmali
     * Ogrenci Notlari
     * Ogrenci 1       50	60	 70	  60
     * Ogrenci 2       80	70	 60
     * İsim (map"in key"i) icin System.out.printf("%-20s", entry.getKey());
     * kullanırsanız, isim alanı için 20 karakterlik yer ayırır ve satır sonunda bekler
     * (System.out.printf()) kullanımın internetten araştırınız.
     * Loop ile ArrayList notlarini yazdirmak icin System.out.print(val + "\t");
     * kullanabilirsiniz. "\t" değer sonuna tab atmak için kullanabilirsiniz.
     */
    public static void listeleNotlar (HashMap < String, ArrayList < Integer >> list){
        // Kodlarinizi buradan sonra yazin
            /*for (Map.Entry<String, ArrayList<Integer>> mapEntry:list.entrySet())
                 System.out.println(mapEntry.getKey());
            for (Map.Entry<String, ArrayList<Integer>> mapEnrty: list.entrySet())
                System.out.println(mapEnrty.getValue());
             */
        for (Map.Entry<String,ArrayList<Integer>> keyAndValues: list.entrySet())
            System.out.println(keyAndValues);

    }


    /**
     * Bu method mainde tanimli HashMap'i (list) parametre alacak
     * kaydedilen tüm ögrencileri ve not ortalamalarini ekrana yazdiracak
     * Cikti asagidaki gibi olmali (System.out.printf("%.2f", val);  kullanarak yapin)
     * Ogrenci Not Ortalamalari
     * Ogrenci 1       55.43
     * Ogrenci 2       62.74
     * Output virgülden sonra 2 basamak olmali.
     */
    public static void listeleOrtalamalar (HashMap < String, ArrayList < Integer >> list){
        // Kodlarinizi buradan sonra yazin
        Scanner scan = new Scanner(System.in);
        double ortalama;
        int toplam =0;
        int count =0;
        for (ArrayList<Integer> notlar:list.values()) {
            for (int not : notlar) {
                toplam += not;
                count++;

            }
            ortalama = toplam / count;

            System.out.println(" notlarin ortalamasi: " + ogrenciKayit() + ": " + ortalama);

        }
    }

    }

