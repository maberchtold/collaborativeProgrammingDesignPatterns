package decorator.simple_decorator;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
        component.operation();
    }
}
