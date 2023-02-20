package learning.vladdubceac.prototype;

import java.math.BigDecimal;
import java.util.Random;

public abstract class BasicCar implements Cloneable{
    protected String name;
    protected BigDecimal price;

    public abstract void getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static BigDecimal getDefaultPrice() {
        Random r = new Random();
        int price = r.nextInt(100000);
        return BigDecimal.valueOf(price);
    }

    public BasicCar clone() throws CloneNotSupportedException{
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (BasicCar)clone;
    }
}
