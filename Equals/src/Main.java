public class Main {

    public static void main(String[] args) {
        // write your code here

        String str1 = new String("sdds");

        String str2 = new String("sdds");

        if (str1 == str2) {

            System.out.println("String 1 == String 2 is true");

        } else {

            System.out.println("String 1 == String 2 is false");

            String Str3 = str2;

            if (str2 == Str3) {

                System.out.println("String 2 == String 3 is true");

            } else {

                System.out.println("String 2 == String 3 is false");

            }

            if (str1.equals(str2)) {

                System.out.println("String 1 equals string 2 is true");

            } else {

                System.out.println("String 1 equals string 2 is false");

            }

        }
    }
}