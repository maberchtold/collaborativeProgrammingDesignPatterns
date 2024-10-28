package flyweight.simple_flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {
    private long allState;

    public UnsharedConcreteFlyweight(long allState) {
        super();
        this.allState = allState;
    }

    @Override
    public void operation(long extrinsicState) {
        System.out.println("Unshared flyweight " + allState + " call operation with extrinsicState " + extrinsicState);
    }
}
