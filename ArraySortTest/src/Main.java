import jdk.jfr.DataAmount;

import java.util.*;

public class Main implements Comparator<Car> {

    public static void main(String[] args) {



        Car ford = new Car("50","Ford",100);
        Car fiat = new Car("20", "fiat", 50);
        Car subaru = new Car("500", "subaru", 5000);
        Car bmw = new Car("200", "bmv", 1000);

        List<Car> carList = new ArrayList<Car>();
        carList.add(ford);
        carList.add(fiat);
        carList.add(subaru);
        carList.add(bmw);

        System.out.println(carList+" ");
        System.out.println("");




        Integer[] numbers = { 10, 20, 50, 25, 35, 80, -20, -30, 0, 10 };

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Sorting Numbers");
        Arrays.sort(numbers);

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\n");



        String[] stringArray = { "de", "", "da", "De", "DE", "a", "A", "1", "Z" };

        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("Sorting Strings");

        Arrays.sort(stringArray);

        for (String str : stringArray) {
            System.out.print(str + " ");
        }




    }

    @Override
    public int compare(Car o1, Car o2) {
            return 0;
    }
}
