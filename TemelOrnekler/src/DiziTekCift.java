public class DiziTekCift {

    int dizi[] = new int[]{5,8,9,61,55,53,90,4};

    public  void  diziTekSayilarınSayisi(){

        int teksayilarınsayisi=0;

        for (int i =0; i<dizi.length;i++){

            if (dizi[i]%2 == 1 ){
                teksayilarınsayisi++;
            }
        }

        System.out.println(teksayilarınsayisi);

    }


    public  void  diziCiftSayilarınSayisi(){

        int ciftsayilarınsayisi=0;

        for (int i =0; i<dizi.length;i++){

            if (dizi[i]%2 == 0 ){
                ciftsayilarınsayisi++;
            }
        }

        System.out.println(ciftsayilarınsayisi);

    }






}
