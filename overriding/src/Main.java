
public class Main {

 
    public static void main(String[] args) {
	// write your code here

       BaseKrediManager[] krediManagers = new BaseKrediManager[]{
               new OgrenciManager(), new OgretmenKrediManager(), new TarimKrediManager()
       };

       for (BaseKrediManager krediManager:krediManagers){

          System.out.println(krediManager.hesapla(1000));
       }




    }
}
