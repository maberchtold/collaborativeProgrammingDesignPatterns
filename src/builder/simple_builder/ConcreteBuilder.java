package builder.simple_builder;

public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        System.out.println("Building part A");
        product.setPartA("material 1");
    }

    @Override
    public void buildPartB() {
        System.out.println("Building part B");
        product.setPartB("material 2");
    }

    @Override
    public void buildPartC() {
        System.out.println("Building part C");
        product.setPartC("Color 5");
    }
}
