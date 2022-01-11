public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());//İSTEEDİĞİMİZ LOGGERI ÇAĞIRABİLİRİZ
        customerManager.Add();


    }
}
