import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
     SayiyiTerstenYazdirma a = new SayiyiTerstenYazdirma();

      System.out.print("Bir Sayı giriniz : ");
      int sayı= scn.nextInt();

      a.sayiyiTerstenYazdirma(sayı);




    }
}
