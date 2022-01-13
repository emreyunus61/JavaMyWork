import java.util.Scanner;

public class DizidekiElemanOrt {






    public float hesapla(){

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        int [] dizi = new int[10];

        for (int i= 0; i<dizi.length;i++){

            System.out.println("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i]= scan.nextInt();
            toplam+=dizi[i];
        }
        float ort=toplam/ dizi.length;

        return  ort;

    }








}
