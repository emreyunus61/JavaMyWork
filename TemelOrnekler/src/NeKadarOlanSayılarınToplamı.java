import java.util.Scanner;

public class NeKadarOlanSayılarınToplamı {

    public int neKadarOlanSayılarınToplamı(int n) {

        int toplam = 0;

        for (int i = 0; i <= n; i++) {

            toplam += i;
        }
        return toplam;

    }

    public  int neKadarCiftSayılarınToplamı(int n){

        int toplam = 0;

        for (int i = 1; i <=n; i++)
        {
            if (i % 2 == 0)
                toplam = toplam + i;
        }
        return toplam;
    }



//    NeKadarOlanSayılarınToplamı A= new NeKadarOlanSayılarınToplamı();
//
//    Scanner scn= new Scanner(System.in);
//
//    System.out.print("Bir sayı giriniz : ");
//
//    int sayi=scn.nextInt();
//
//    System.out.println(" Ne kadar Girilen sayıların toplamı : " + A.neKadarOlanSayılarınToplamı(sayi) );


}
