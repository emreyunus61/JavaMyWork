import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi1=16;
        int sayi2=61;
        int sayi3=550;
        int enbuyuk=sayi1;

        if (enbuyuk<sayi2){

            enbuyuk=sayi2;
        }
        if (enbuyuk<sayi3){

            enbuyuk=sayi3;
        }
        System.out.println("En Büyük : "+ enbuyuk);


        Scanner scn= new Scanner(System.in);

        System.out.println("Sınav notunuzu giriniz : ");
        int not=scn.nextInt();


        if (not<50){
            System.out.println("Kaldınız notunuz : "+ not);
        }
        else if (not<60 ){
            System.out.println("Orta geçtiniz notunuz : "+ not);
        }
       else  if (not<80){
            System.out.println("İyi geçtiniz notunuz : "+ not);
        }
       else if (not<90){
            System.out.println("Pekiyi geçtiniz notunuz : "+ not);
        }


    }
}
