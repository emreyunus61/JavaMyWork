public class Main {
    public static void main(String[] args) {



        int x = 3;
        if (x == 1) {

            System.out.println("x esittir 1");
        } else if (x == 2) {
            System.out.println("x esittir 2");
        } else if (x == 3) {
            System.out.println("x esittir 3");
        } else {
            System.out.println("x hakkinda bilgim yok!");
        }

        switch (x) {
            case 1:
                System.out.println("x esittir 1");
                break;
            case 2:
                System.out.println("x esittir 2");
                break;
            case 3:
                System.out.println("x esittir 3");
                break;
            default:
                System.out.println("x hakkinda bilgim yok!");
        }


        int y = 7;
        switch (y) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: {
                System.out.println("y cift sayidir");
                break;
            }
            default:
                System.out.println("y tek sayidir");
        }



    }
}
