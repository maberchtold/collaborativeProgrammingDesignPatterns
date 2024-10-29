package chain_of_responsibility.filteringEmails_useThis;

public class ComplaintHandler extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals(COMPLAINT_MAIL)){
            System.out.println("Complaint mail handler");
        }else if (successor != null){
            successor.handleRequest(request);
        }else {
            throw new RuntimeException("No suitable handler found");
        }
    }
}
