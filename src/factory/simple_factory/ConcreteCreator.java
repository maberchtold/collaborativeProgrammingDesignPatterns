package factory.simple_factory;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct("car");
    }
}
