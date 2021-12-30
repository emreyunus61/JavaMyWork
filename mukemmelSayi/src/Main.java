import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner  scn =  new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz : ");
        int  sayi= scn.nextInt();

        int toplam=0;

        for (int i=1; i<sayi;i++){

              if (sayi % i==0){

                  toplam=toplam+i;
              }
        }

        if (sayi==toplam){
            System.out.println("Sayı Mükemmel Sayıdır");
        }
        else{
            System.out.println("Sayı Mükemmel Sayı Değildir");
        }

    }
}
