package factory.simple_factory;

public abstract class Creator {
    abstract public Product factoryMethod();

    public void anOperation(){
        Product product = factoryMethod();
        System.out.println("do something with product  " + product.toString());
    }
}
