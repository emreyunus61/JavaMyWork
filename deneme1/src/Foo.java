public class Foo {

    String name = "yunus";

    void bar() {
        Foo f = new Foo();
        System.out.println(f.name);
        doStuff(f);
        System.out.println(f.name);
    }

    void doStuff(Foo g) {
        System.out.println(g.name);
        g.name = "öztürk";
        System.out.println(g.name);
        g = new Foo();
        g = null;

    }
}
