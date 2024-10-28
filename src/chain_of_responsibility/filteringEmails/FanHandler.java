package chain_of_responsibility.filteringEmails;

public class FanHandler extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals(FAN_MAIL)){
            System.out.println("Fan mail handler");
        }else if (successor != null){
            successor.handleRequest(request);
        }else {
            throw new RuntimeException("No suitable handler found");
        }
    }
}
