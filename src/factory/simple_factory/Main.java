package factory.simple_factory;

public class Main {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.anOperation();
    }
}
