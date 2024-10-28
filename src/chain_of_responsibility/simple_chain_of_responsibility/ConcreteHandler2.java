package chain_of_responsibility.simple_chain_of_responsibility;

import java.util.Arrays;
import java.util.List;

public class ConcreteHandler2 extends Handler {
    private List<String> myColors = Arrays.asList("red", "green", "blue");

    @Override
    public void handleRequest(Request request) {
        if (myColors.contains(request.getValue()))
            System.out.println("Request is handled for "+request.getValue() + " by " + this);
        else
            successor.handleRequest(request);
    }
}
