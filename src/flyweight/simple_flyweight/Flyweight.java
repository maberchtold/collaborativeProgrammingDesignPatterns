package flyweight.simple_flyweight;

import java.util.Arrays;

public abstract class Flyweight {
    private long[] internalStorage = new long[1000000];

    public Flyweight() {
        Arrays.fill(internalStorage,1);
    }

    public abstract void operation(long extrinsicState);
}
