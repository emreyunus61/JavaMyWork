import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car {

    public Car(String hp, String brand, Integer price) {
        super();
        this.hp = hp;
        this.brand = brand;
        this.price = price;
    }

    private String hp;
    private String brand;
    private Integer price;

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [hp=" + hp + ", brand=" + brand + ", price=" + price + "]";
    }

}