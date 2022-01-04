public class ScopeError {

    public static void main(String[] args) {


        int[] coolArray = new int[6];

        byte b = 10;
        char c = 'c';
        short s = 20;
        long l = 50;
        float x = 10;
        double d = 100;

        coolArray[0] = b;
        coolArray[1] = c;
        coolArray[2] = s;
        // coolArray[3] = l; // compiler error
        // coolArray[4] =f //compiler error
        //coolArray[5] = d;  //compiler error

        for (int i : coolArray) {
            System.out.print(i + " ");
        }




        int [] ages2 ;
        ages2 = new int[]{20,30,40,50};

        int[] number = new int[5];

        System.out.println(number.length);
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 2;
            System.out.print(number[i]);

        }
        System.out.println();
        System.out.println(number.length);


        System.out.println("*************************");

        int dizi [] = new int[5];

        int dizi1 [] = new int[] {1,8,9,5,6,7};

        for (int i = 0; i<dizi1.length; i++){

            System.out.println(dizi1[i]);
        }




        Foo f = new Foo();
        f.bar();



        ScopeError se = new ScopeError();
        se.method1();
        se.method2();
        se.method3();

        String str = null;
        if(str==null) {
            System.out.println("HelloWorld");
        }

        int [] array2=new int[10];
        double [] array3= new double[2];
        String [] array4 = new String[3];

        for(int i: array2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(double i: array3) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(String i: array4) {
            System.out.print(i + " ");
        }

        //0 0 0 0 0 0 0 0 0 0
        //0.0 0.0 0.0 0.0 0.0
        //null null null null null

    }


    void method1() {
        int y=10;
        System.out.println(y);
        y++;
        System.out.println(y);
        //method2();
    }

    void method2(){
        //y++;  // derleme hatasi
        System.out.println("ddfsdsfd");
    }


    void method3() {
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        // System.out.println(i); //compile error //derleme hatasi

 
    }
}
