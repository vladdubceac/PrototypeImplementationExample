package learning.vladdubceac.prototype.implementation;

import learning.vladdubceac.prototype.BasicCar;

import java.math.BigDecimal;

public class Nano extends BasicCar {
    public Nano(String name){
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.println("Car is: "+name+" , and it's price is Rs. "+price.doubleValue());
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        BasicCar car = super.clone();
        Nano nano = new Nano(car.getName());
        nano.setPrice(car.getPrice());
        return nano;
    }
}
