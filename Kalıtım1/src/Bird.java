
class Bird extends Animal {

    int height=3;
    static int size=5;

    @Override
    public void eat() {
        System.out.println("Bird-Eat");
    }

    static void breathe() {
        System.out.println("Bird- Breath");
    }

    public void fly() {
        System.out.println("Bird-fly");
    }
}