package chain_of_responsibility.simple_chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler firstHandler = new ConcreteHandler1();
        Handler secondHandler = new ConcreteHandler2();
        Handler thirdHandler = new ConcreteHandler3();

        firstHandler.setSuccessor(secondHandler);
        secondHandler.setSuccessor(thirdHandler);

        Request request = new Request("dog");
        firstHandler.handleRequest(request);

        request = new Request("car");
        firstHandler.handleRequest(request);
    }
}
