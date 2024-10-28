package flyweight.simple_flyweight;

public class ConcreteFlyweight extends Flyweight {
    private long intrinsicState;

    public ConcreteFlyweight(long intrinsicState) {
        super();
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(long extrinsicState) {
        System.out.println("Flyweight " + intrinsicState + " Calling operation with extrinsicState " + extrinsicState);
    }
}
