public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(FileLogger logger){


        this.logger= logger;

    }

    public  void Add(){

        System.out.println("Müşteri Eklendi");
        this.logger.Log("Log Mesajı");
    }

}
