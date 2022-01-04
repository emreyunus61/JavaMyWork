import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList  sayilar = new ArrayList();

        //Obje ile çalıştığımız için string int veriler ekleyebiliriz hata vermez.

        sayilar.add(1);
        sayilar.add(61);
        sayilar.add("Trabzon");


        System.out.println(sayilar.size());
        sayilar.remove(0);
        System.out.println(sayilar.size());
        sayilar.add(65);
        sayilar.set(2,53);

        System.out.println(sayilar.get(2));

        for(Object i: sayilar){

            System.out.print("  "+i);
        }

    }
}
