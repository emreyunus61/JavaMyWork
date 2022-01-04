import java.util.Scanner;

public class RakamlarıToplamı {

    public  int rakamlarıToplamı(int n){

       int toplam = 0;
       int rakam = 0;

       while (n>0){

           rakam = n%10;
           toplam+=rakam;
           n= n/10;
       }

       return  toplam;

    }


//    RakamlarıToplamı rt= new RakamlarıToplamı();
//
//    Scanner scn= new Scanner(System.in);
//
//        System.out.print("Bir sayı giriniz : ");
//
//    int sayi=scn.nextInt();
//
//        System.out.println("Girilen sayının rakamları toplamı : " + rt.rakamlarıToplamı(sayi) );


}
