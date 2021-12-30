public class Main {

    public static void main(String[] args) {

        int[] sayilar= new int[] {8,2,9,51,45,21,61};

        int aranacakSayi=8;
        boolean varMi=false;

        for (int i=0; i<sayilar.length; i++ ){

            if (i == aranacakSayi){
                varMi = true;
                break;

            }
        }

        if (varMi){

            System.out.println("Aranacak Sayi mevcuttur ");

        }else {
            System.out.println("Aranacak Sayi mevcuttur Değildir ");

        }







    }
}
