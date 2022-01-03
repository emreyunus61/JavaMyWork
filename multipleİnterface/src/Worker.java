
//Bzim çalışan
public class Worker implements  IWorkable ,IEtable,IPayable {


    @Override
    public void work() {

        System.out.println("Çalış çalış");
    }

    @Override
    public void eat() {

        System.out.println("Yemeğini iyi ye balım");
    }

    @Override
    public void Pay() {

        System.out.println("Para  yok sana aq");
    }
}
