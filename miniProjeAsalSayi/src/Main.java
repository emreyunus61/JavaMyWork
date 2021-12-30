import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     Scanner scn = new  Scanner(System.in);

     System.out.println("Bir Sayı Gitriniz : ");
     int sayi=scn.nextInt();
     boolean AsalMı = true;


     if (sayi<2){
         System.out.println("Geçersiz sayı");
     }

     for(int i=2; i<sayi; i++) {

         if (sayi % i == 0) {

             AsalMı = false;

         }
     }
         if (AsalMı){
             System.out.println("Girilen sayı Asaldır." + " : "+ sayi);

         }
         else{
             System.out.println("Girilen sayı Asal değildir. " + ": "+ sayi);
         }
     }



    }

