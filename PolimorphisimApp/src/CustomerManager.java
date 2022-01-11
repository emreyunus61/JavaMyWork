public class CustomerManager {

 private BaseLoger logger;

 public CustomerManager(BaseLoger logger){

     this.logger=logger;

 }


   public void Add(){

     System.out.println("Müşteri Eklendi");
     this.logger.Log("Log Mesajı");
   }



}
