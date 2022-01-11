import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        List myArrayList = new ArrayList();
        //ArrayList

        //DİZİYİ ARRAYLİSTE ÇEVİRME

//        String[] namesArray = { "names1", "names2", "names3", "names4" };
//
//        List namesList = Arrays.asList(namesArray);




        boolean isEmpty = myArrayList.isEmpty();
        int size = myArrayList.size();

        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);

     //System.out.println("Size : " +myArrayList.size());

        myArrayList.add(20);
        myArrayList.add(20);
        myArrayList.add("10");

        // eleman ekledikten sonra tekrar test edelim.
        isEmpty = myArrayList.isEmpty();
        size = myArrayList.size();

        System.out.println("isEmpty:" + isEmpty);
        System.out.println("size:" + size);


        boolean contains = myArrayList.contains(20);
        boolean contains2 = myArrayList.contains("10");

        System.out.println("contains:" + contains);
        System.out.println("contains:" + contains2);


    }
}
