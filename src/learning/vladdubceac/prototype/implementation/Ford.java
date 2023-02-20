package learning.vladdubceac.prototype.implementation;

import learning.vladdubceac.prototype.BasicCar;

import java.math.BigDecimal;

public class Ford extends BasicCar {

    public Ford(String modelName) {
        name = modelName;
    }

    @Override
    public void getInfo() {
        System.out.println("Car is: "+name+" , and it's price is Rs. "+price.doubleValue());
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
       BasicCar car = super.clone();
       Ford ford = new Ford(car.getName());
       ford.setName(car.getName());
       ford.setPrice(car.getPrice());
       return ford;
    }
}
