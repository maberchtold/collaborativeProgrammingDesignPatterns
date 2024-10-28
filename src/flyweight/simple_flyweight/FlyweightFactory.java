package flyweight.simple_flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int key) {

        Flyweight flyweight = flyweights.get(key);

        if(flyweights.get(key) == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }

        return flyweight;
    }
}
