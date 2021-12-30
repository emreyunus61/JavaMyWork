import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(" A B C D F Notları Üzerinden Değerlendirininiz!");
        Scanner scn=new Scanner(System.in);
        System.out.println("Harf Notunuzu Giriniz : ");
        char Harfnotu=scn.next().charAt(0);

        switch (Harfnotu){

            case 'A' :
                System.out.println("Mükemmel : Geçtiniz");
            break;

            case 'B' :
                System.out.println("Çok Güzel : Geçtiniz");
                break;

            case 'C' :
                System.out.println("İyi : Geçtiniz");
                break;

            case 'D' :
                System.out.println("Fena değil : Geçtiniz");
                break;

            case 'F' :
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }




    }
}
