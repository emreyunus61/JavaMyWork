public class SingletonClass {

    private static final SingletonClass sg = new SingletonClass();

    private SingletonClass(){

    }

    public static  SingletonClass getSingleton(){
        return sg;
    }
}
