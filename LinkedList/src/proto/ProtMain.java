package proto;

public class ProtMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        prototype pt = new prototype();
        pt.setName("yunus");
        pt.setSurname("ozturk");
        prototype clone =  pt.cloneMe();
        pt.setName("samet");
        System.out.println(clone.getName());
        System.out.println(pt.getName());
    }
}
