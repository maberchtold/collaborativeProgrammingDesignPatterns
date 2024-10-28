package chain_of_responsibility.simple_chain_of_responsibility;

import java.util.Arrays;
import java.util.List;

public class ConcreteHandler3 extends Handler {
    private List<String> myNumbers = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

    @Override
    public void handleRequest(Request request) {
        if (myNumbers.contains(request.getValue()))
            System.out.println("Request is handled for "+request.getValue() + " by " + this);
        else
            throw new RuntimeException("Request could not be handled");
    }
}
