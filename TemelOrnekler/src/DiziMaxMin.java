public class DiziMaxMin {


    int dizi[] = new int[]{5,8,9,61,55,53,90,4};

    public void  enBuyukEleman(){

       int eb = dizi[0];

       for (int i =0;  i< dizi.length;i++ ){

           if (dizi[i]>eb){

               eb = dizi[i];
           }

       }

       System.out.println(eb);


    }

    public void  enKucukEleman(){

        int ek = dizi[0];

        for (int i =0;  i< dizi.length;i++ ){

            if (dizi[i]<ek){

                ek = dizi[i];
            }

        }

        System.out.println(ek);


    }



//    DiziMaxMin eb = new DiziMaxMin();
//        eb.enBuyukEleman();
//
//    DiziMaxMin ek = new DiziMaxMin();
//        ek.enKucukEleman();

}
