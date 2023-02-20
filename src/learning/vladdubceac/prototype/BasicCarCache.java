package learning.vladdubceac.prototype;


import learning.vladdubceac.prototype.implementation.Ford;
import learning.vladdubceac.prototype.implementation.Nano;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> carMap = new Hashtable<String, BasicCar>();

    public static BasicCar getCar(String name) throws CloneNotSupportedException {
        BasicCar cachedCar = carMap.get(name);
        return (BasicCar) cachedCar.clone();
    }

    public static void loadCache(){
        Ford ford = new Ford("Ford");
        ford.setPrice(BigDecimal.valueOf(500000));

        Nano nano =new Nano("Nano");
        nano.setPrice(BigDecimal.valueOf(100000));

        carMap.put(ford.getName(), ford);
        carMap.put(nano.getName(), nano);
    }
}
