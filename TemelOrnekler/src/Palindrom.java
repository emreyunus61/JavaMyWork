import java.util.Scanner;

public class Palindrom {

    public  void isPalindrom(int input){

        int temp, tersSayi = 0, kalan;
        temp=input;

        while (temp != 0){

            kalan =temp%10;
            tersSayi = tersSayi*10 +kalan;
            temp /= 10;

        }
        if (input == tersSayi)
            System.out.println("Girilen sayı Palindrom sayıdır");
         else
             System.out.println("Girilen sayı Palindrom sayı değildir");

    }


//    Scanner scn = new Scanner(System.in);
//    Palindrom palindrom = new Palindrom();
//
//      System.out.print("Bir Sayı giriniz : ");
//    int sayı= scn.nextInt();
//
//      palindrom.isPalindrom(sayı);


}
