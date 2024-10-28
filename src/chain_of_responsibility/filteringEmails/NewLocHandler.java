package chain_of_responsibility.filteringEmails;

public class NewLocHandler extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals(NEW_LOC_MAIL)){
            System.out.println("New Loc mail handler");
        }else if (successor != null){
            successor.handleRequest(request);
        }else {
            throw new RuntimeException("No suitable handler found");
        }
    }
}
