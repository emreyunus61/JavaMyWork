import java.util.Scanner;

public class SayiyiTerstenYazdirma {


    public void  sayiyiTerstenYazdirma(int input){

        int temp , tersSayi=0 , kalan ;
        temp = input;

        while (temp !=0){

            kalan = temp%10;
            tersSayi = tersSayi*10 +kalan;
            temp = temp/10;
        }

        System.out.println("Girilen Sayının Tersi : " + tersSayi);

    }


//    Scanner scn = new Scanner(System.in);
//    SayiyiTerstenYazdirma a = new SayiyiTerstenYazdirma();
//
//      System.out.print("Bir Sayı giriniz : ");
//    int sayı= scn.nextInt();
//
//      a.sayiyiTerstenYazdirma(sayı);


}
