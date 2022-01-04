import java.util.Scanner;

public class AsalMı {


    public boolean AsalMı(int n) {

        if (n <= 1) {

            System.out.println("E n küçük asal sayı 2 dir.");
        }

        boolean kontrol = true;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                kontrol = false;
                break;
            }
            return kontrol;

        }


        return false;
    }




//    Scanner scn= new Scanner(System.in);
//
//    AsalMı a= new AsalMı();
//
//        System.out.println("Bir sayı giriniz");
//
//    int sayi=scn.nextInt();
//
//        if (a.AsalMı(sayi)== true){
//
//        System.out.println("girilen sayı Asaldır : " + sayi);
//
//    }else {
//        System.out.println("girilen sayı Asal değildir : " + sayi);
//    }



}
