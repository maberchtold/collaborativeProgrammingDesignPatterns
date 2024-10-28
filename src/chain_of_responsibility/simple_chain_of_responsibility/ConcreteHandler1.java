package chain_of_responsibility.simple_chain_of_responsibility;

import java.util.Arrays;
import java.util.List;

public class ConcreteHandler1 extends Handler{
    private List<String> myAnimals = Arrays.asList("cat", "dog", "horse");

    @Override
    public void handleRequest(Request request) {
        if (myAnimals.contains(request.getValue()))
            System.out.println("Request handled for " + request.getValue() +" by "+ this);
        else
            successor.handleRequest(request);
    }
}
