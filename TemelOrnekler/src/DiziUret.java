import java.util.Random;
import java.util.Scanner;

public class DiziUret {


    public void randomDiziDoldur(int sayi){

        int [] dizi= new int[sayi];

        Random r = new Random();



        for (int i=0; i<dizi.length;i ++){

            dizi[i]=r.nextInt(20)+1;
            System.out.print(dizi[i] + " ");
        }





    }

//    Scanner scn = new Scanner(System.in);
//   System.out.println("Dizimiz kaç elemanlı olsun");
//    int eleman =scn.nextInt();
//
//    DiziUret diziUret= new DiziUret();
//   diziUret.randomDiziDoldur(eleman);



}
