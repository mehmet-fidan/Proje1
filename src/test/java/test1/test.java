package test1;


import org.apache.tools.ant.taskdefs.Get;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.DataProvider;
import proje1.*;

public class test extends Parent{


    @Test
    public void benzerleriSil1() {
        final String testString = "1 2 1 5 3 1 4 4 2 2 3 3 3 4 4 4 5 5 5";
        provideInput(testString);

        BenzerleriSil.main(new String[0]);

        String result = "[1, 2, 3, 4, 5]";
        boolean actual = getOutput().contains(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }

    @Test
    public void benzerleriSil2() {
        final String testString = "9 9 1 6 2 1 5 3 1 4 4 2 2 3 3 3 4 4 4 5 5 5 12 12 21 21 1";
        provideInput(testString);

        BenzerleriSil.main(new String[0]);

        String result = "[1, 2, 3, 4, 5, 6, 9, 12, 21]";
        boolean actual = getOutput().contains(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void ciftmiTekmi1() {
        final String testString = "2";
        provideInput(testString);

        CiftmiTekmi.main(new String[0]);

        String result = "true";
        boolean actual = getOutput().contains(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }

    @Test
    public void checkNumberEven2() {
        final String testString = "5";
        provideInput(testString);

        CiftmiTekmi.main(new String[0]);

        String result = "false";
        boolean actual = getOutput().contains(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void del1() {
        final String testString = "adela";
        provideInput(testString);

        Del.main(new String[0]);

        String result = "aa";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void del2() {
        final String testString = "delaa";
        provideInput(testString);

        Del.main(new String[0]);

        String result = "aa";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }



    @Test
    public void del3() {
        final String testString = "aadel";
        provideInput(testString);

        Del.main(new String[0]);

        String result = "aa";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }



    @Test
    public void duzenliMetin1() {
        final String testString = " jAva  öGRENEbildiniz MI? ";
        provideInput(testString);

        DuzenliMetin.main(new String[0]);

        String result = "Java Ögrenebildiniz Mi?";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void factoriyel1() {
        final String testString = "-1";
        provideInput(testString);

        Factoriyel.main(new String[0]);

        String result = "0";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void factoriyel2() {
        final String testString = "0";
        provideInput(testString);

        Factoriyel.main(new String[0]);

        String result = "1";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void factoriyel3() {
        final String testString = "5";
        provideInput(testString);

        Factoriyel.main(new String[0]);

        String result = "120";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void factoriyel4() {
        final String testString = "20";
        provideInput(testString);

        Factoriyel.main(new String[0]);

        String result = "2432902008176640000";
        boolean actual = getOutput().replaceAll("[\\n\\r]","").equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void getSubstring1() {
        String testString = GetSubstring.getSubString("Java dünyası", 9, 2);
        String result = "ava düny";
        boolean actual = testString.equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }


    @Test
    public void getSubstring2() {
        String testString = GetSubstring.getSubString("Java dünyası", -2, 100);
        String result = "Java dünyası";
        boolean actual = testString.equals(result);
        Assert.assertTrue("output " + result + " olmalı ama sizin output " + getOutput() , actual);
    }

    @Test
    public void getTotal1() {
        final String testString = "$10 $13 $12";
        provideInput(testString);
        GetTotal.main(new String[0]);

        String actual = getOutput().replaceAll("[^\\d.-]", "");
        String expected = "35";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }

    @Test
    public void getTotal2() {
        final String testString = "$-20 $0 $0";
        provideInput(testString);
        GetTotal.main(new String[0]);

        String actual = getOutput().replaceAll("[^\\d.-]", "");
        String expected = "-1";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void getTotal3() {
        final String testString = "$0 $0 $0";
        provideInput(testString);
        GetTotal.main(new String[0]);

        String actual = getOutput().replaceAll("[^\\d.-]", "");
        String expected = "0";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }



    @Test
    public void ikiStringBirlestir1() {
        final String testString = "cat tac";
        provideInput(testString);
        IkiStringBirlestir.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "catac";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }

    @Test
    public void ikiStringBirlestir() {
        final String testString = "cat dog";
        provideInput(testString);
        IkiStringBirlestir.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "catdog";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);
    }




    @Test
    public void kacHarfVar1() {
        final String testString = "one barber to other barber";

        int actual = KacHarfVar.getCharNumber(testString, 'a');
        int expected = 2;
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }

    @Test
    public void kacHarfVar2() {
        final String testString = "one barber to other barber";

        int actual = KacHarfVar.getCharNumber(testString, 'j');
        int expected = 0;
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void kacHarfVar3() {
        final String testString = "one barber to other barber";

        int actual = KacHarfVar.getCharNumber(testString, 'b');
        int expected = 4;
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }




    @Test
    public void letterCount1() {
        final String testString = "Editor";
        provideInput(testString);

        LetterCount.main(new String[0]);
        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = String.valueOf(testString.length() % 2 == 1);
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);
    }

    @Test
    public void letterCount2() {
        final String testString = "consist";
        provideInput(testString);

        LetterCount.main(new String[0]);
        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = String.valueOf(testString.length() % 2 == 1);
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);
    }


    @Test
    public void randomSayi1() {
        final String testString = "1 3";
        provideInput(testString);

        RandomNum.main(new String[0]);
        int actual = Integer.parseInt(getOutput().replaceAll("[\\n\\r]",""));
        System.out.println(actual);
        boolean result = 1 <= actual && actual <= 20 ;
        Assert.assertTrue("output " + testString + " arasinda olmalı ama sizin output " + getOutput(), result);
    }


    @Test
    public void randomSayi2() {
        final String testString = "-5 5";
        provideInput(testString);

        RandomNum.main(new String[0]);
        int actual = Integer.parseInt(getOutput().replaceAll("[\\n\\r]",""));
        System.out.println(actual);
        boolean result = -5 <= actual && actual <= 5 ;
        Assert.assertTrue("output " + testString + " arasinda olmalı ama sizin output " + getOutput(), result);
    }


    @Test
    public void randomSayi3() {
        final String testString = "5 -5";
        provideInput(testString);

        RandomNum.main(new String[0]);
        int actual = Integer.parseInt(getOutput().replaceAll("[\\n\\r]",""));
        System.out.println(actual);
        boolean result = -5 <= actual && actual <= 5 ;
        Assert.assertTrue("output " + testString + " arasinda olmalı ama sizin output " + getOutput(), result);
    }


    @Test
    public void sesliHarfSayisi1() {
        final String testString = "aba";
        provideInput(testString);
        SesliHarfSayisi.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "2";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }



    @Test
    public void sesliHarfSayisi2() {
        final String testString = "bbbbbb  ";
        provideInput(testString);
        SesliHarfSayisi.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "0";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void sesliHarfSayisi3() {
        final String testString = "aeiou";
        provideInput(testString);
        SesliHarfSayisi.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "5";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void tersMetin1() {
        final String testString = "a";
        provideInput(testString);
        TersMetin.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "a";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void tersMetin2() {
        final String testString = "abc";
        provideInput(testString);
        TersMetin.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = "cba";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void tersMetin3() {
        final String testString = " ";
        provideInput(testString);
        TersMetin.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");
        String expected = " ";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void tamKare1() {
        final String testString = "100";
        provideInput(testString);
        TamKare.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");

        String expected = "true";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }



    @Test
    public void tamKare2() {
        final String testString = "50";
        provideInput(testString);
        TamKare.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");

        String expected = "false";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }


    @Test
    public void tamKare3() {
        final String testString = "-100";
        provideInput(testString);
        TamKare.main(new String[0]);

        String actual = getOutput().replaceAll("[\\n\\r]","");

        String expected = "false";
        Assert.assertEquals("output " + expected + " olmalı ama sizin output " + getOutput(), expected, actual);

    }



}