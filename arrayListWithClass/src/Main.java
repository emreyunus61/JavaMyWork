import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer ebru= new Customer(1,"Ebru","ÖZTÜRK"); // silmek istiyorsak bu şekilde yapmalıyız.
        customers.remove(ebru);

        customers.add(new Customer(2,"Yunus", "ÖZTÜRK"));
        customers.add(new Customer(3,"Nuray", "ÖZTÜRK"));

     //   customers.remove(new Customer(3,"Nuray", "ÖZTÜRK"); bellekten silmez çünkü referans tip olduğundan new lediğimiz için bellekte yeni alan oluşturuyor.

        for (Customer i: customers){

            System.out.println(i.firsName);
        }



    }
}
