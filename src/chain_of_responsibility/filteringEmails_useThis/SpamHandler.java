package chain_of_responsibility.filteringEmails_useThis;

public class SpamHandler extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals(SPAM_MAIL)){
            System.out.println("Spam mail handler");
        }else if (successor != null){
            successor.handleRequest(request);
        }else {
            throw new RuntimeException("No suitable handler found");
        }
    }
}
