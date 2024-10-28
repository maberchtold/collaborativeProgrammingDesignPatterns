package builder.simple_builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();
        director.setBuilder(builder);

        director.construct();
        Product finalProduct = builder.getResult();

        System.out.println(finalProduct);
    }
}
