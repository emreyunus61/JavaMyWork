public class Main {
    public static void main(String[] args) {

        do{
            System.out.println("dongu ici");
        }while(false);

        System.out.println("**********************************");

        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello");
                break outer;
            }
            System.out.println("outer"); // Never prints
        }
        System.out.println("Good-Bye");

        System.out.println("**********************************");

        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer"); // Never prints
        }
        System.out.println("Good-Bye");

        System.out.println("**********************************");

        int[] ia = { 1, 3, 5, 7, 9 };

        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8)
                    continue;
                System.out.print(" " + x);

                if (j == 1)
                    break;
                continue;
            }
            continue;
        }


    }
}
