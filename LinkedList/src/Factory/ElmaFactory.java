package Factory;

public class ElmaFactory {

 public static Elma createElma(String tip) {
        Elma elma = null;
        if ("yesil".equals(tip))
            elma = new YesilElma();
        else if ("kirmizi".equals(tip))
            elma = new KirmiziElma();
        return elma;
    }
}
