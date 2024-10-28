package factory.simple_factory;

public class ConcreteProduct implements Product {
    private String category;

    public ConcreteProduct(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "category='" + category + '\'' +
                '}';
    }
}
