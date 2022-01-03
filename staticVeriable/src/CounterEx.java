public class CounterEx {


    static int count =0;

    CounterEx() {
        count++;
    }


    public static void main(String[] args) {
        new CounterEx();
        new CounterEx();
        new CounterEx();
        System.out.println("counter value:"+count); //3

        SuperClass sc1 = new SuperClass();
        SubClass sc2 = new SubClass();
        SuperClass sc3 = new SuperClass();

        sc1.foo(); // i am SuperClass
        sc2.foo(); // i am SubClass
        sc3.foo(); // i am SuperClass


    }

}
class SuperClass {
    static void foo() {
        System.out.println("i am SuperClass");
    }

}

class SubClass extends SuperClass {
    static void foo() {
        System.out.println("I am SubClass");
    }
}