package learning.vladdubceac.prototype;

public class PrototypePatternEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");

        BasicCarCache.loadCache();
        BasicCar basicCar = BasicCarCache.getCar("Ford");
        basicCar.setPrice( basicCar.getPrice().add(BasicCar.getDefaultPrice()));
        basicCar.getInfo();

        BasicCar basicCar1 = BasicCarCache.getCar("Nano");
        basicCar1.setPrice(basicCar1.getPrice().add(BasicCar.getDefaultPrice()));
        basicCar1.getInfo();
    }
}
