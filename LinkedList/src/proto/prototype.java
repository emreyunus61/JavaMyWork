package proto;

public class prototype {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

   public prototype cloneMe(){
       prototype prototype = new prototype();
       prototype.setName(name);
       prototype.setSurname(surname);
       return prototype;
   }

}
