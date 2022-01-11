interface Z {
}

class A implements Z {
}

class B extends A {
}

class C extends B {

    public static void main(String[] args) {




        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            if (i == 7) {
                break;
            }

            System.out.println("i:" + i);
        }


        int x1 = 5;
        int y1 = 10;

        if (x1 > 3)
            if (y1 > 10)
                System.out.println("y>5");
            else
                System.out.println("else");


//        Z z1 = new A();
//        Z z2 = new B();
//        Z z3 = new C();
//
//        A a0 = new A();
//        A a1 = new B();
//        A a2 = new C();
//
//        B b0 = new B();
//        B b1 = new C();
//
//        C c1 = new C();
//
//        // z1 referans degiskeni A sinifi turunde bir objeye refarans
//        // etmektedir.
//        // IS-A kuralini dikkate alarak sonuclari dusunelim.
//        System.out.println("z1 instanceof test");
//        System.out.println(z1 instanceof A); // true
//        System.out.println(z1 instanceof B); // false
//        System.out.println(z1 instanceof C); // false
//
//        System.out.println("ao instanceof test");
//        System.out.println(a0 instanceof Z);
//        System.out.println(a0 instanceof A);
//        System.out.println(a0 instanceof B);
//        System.out.println(a0 instanceof C);
//
//        System.out.println("c1 instanceof test");
//        System.out.println(c1 instanceof Z);
//        System.out.println(c1 instanceof A);
//        System.out.println(c1 instanceof B);
//        System.out.println(c1 instanceof C);

        int x =5*3;
        int y =x-4;
        System.out.println(x);
        System.out.println(y);

        int z =13%5;
        System.out.println(z);


        String a = "java";
        int b = 10;
        int c = 5;
        System.out.println(a + b + c);


        int zz=5;
        System.out.println(""+zz+3);
        System.out.println(zz+3);


        int point = 25;
        String result = point < 50 ? "Fail" : "Success";
        System.out.println(result);




        byte b1=6&8;

        //0110 --->6
        //1000 --->8
        //----- & ve islemi
        //0000
        System.out.println(b1);

        byte b2=5|9;
        //0101 --->5
        //1001 --->9
        //----- | veya islemi
        //1101

        System.out.println(b2);

        byte b3=7^5;

        //0111 --->7
        //0101 --->5
        //----- ^ xor islemi
        //0010

        System.out.println(b3);



    }
}