package flyweight.simple_flyweight;

import java.util.Random;

public class Main {
    static Random rand = new Random();
    public static void main(String[] args) {
        int rounds = 100;

        FlyweightFactory factory = new FlyweightFactory();
        for (int i = 0; i < rounds; i++) {
            Flyweight flyweight = factory.getFlyweight(rand.nextInt(10));
            flyweight.operation(i);
        }
    }
}
