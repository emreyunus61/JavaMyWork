public class Main {

    public static void main(String[] args) {

        //  Clasları Static yapınca nesne oluşturmadan clas isimleriyle sınıflara ve metotlara ulaşabiliyoruz.

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Crud.Update();



    }
}
