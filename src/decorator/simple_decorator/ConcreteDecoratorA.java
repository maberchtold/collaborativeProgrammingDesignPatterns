package decorator.simple_decorator;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("I am adding some new responsibilities here.");
        super.operation();
    }
}
