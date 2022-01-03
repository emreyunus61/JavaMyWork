public class Main {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Bird();
        Bird c = new Bird();
        //Bird d = new Animal();

        a.eat();
        b.eat();
        c.eat();

        a.breathe();
        b.breathe();
        c.breathe();

        //a.fly();
        //b.fly();
        c.fly();

        System.out.println(a.height + " "+ a.size);
        System.out.println(b.height + " "+ b.size);
        System.out.println(c.height + " "+ c.size);
    }

    }

