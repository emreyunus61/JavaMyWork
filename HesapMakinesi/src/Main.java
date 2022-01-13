import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz : ");
        int sayi1= scn.nextInt();
        System.out.println("2. Sayıyı Giriniz");
        int sayi2=scn.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");


        System.out.print("Secimininizi giriniz: ");
        int secim = scn.nextInt();

        switch (secim){

            case 1:
                System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);



        }



    }
}
