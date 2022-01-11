public class Main {

    public static void main(String[] args) {
	// write your code heresayi

        try {
            int dizi [] = new int[] {1,5,6};
            System.out.println(dizi[3]);
        }catch (Exception exception)
        {
            System.out.println("Hata Oluştu : " + exception);
        }
        finally {
            System.out.println("Her türlü çalışan blok");
        }

    }
}
