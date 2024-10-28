package chain_of_responsibility.filteringEmails;

public class Main {
    public static void main(String[] args) {
        final String SPAM_MAIL="SPAM_MAIL";
        final String FAN_MAIL="FAN_MAIL";
        final String COMPLAINT_MAIL="COMPLAINT_MAIL";
        final String NEW_LOC_MAIL="NEW_LOC_MAIL";

        Handler spamHandler = new SpamHandler();
        Handler fanHandler = new FanHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler newLocHandler = new NewLocHandler();

        spamHandler.setSuccessor(fanHandler);
        fanHandler.setSuccessor(complaintHandler);
        complaintHandler.setSuccessor(newLocHandler);

        spamHandler.handleRequest(SPAM_MAIL);
        spamHandler.handleRequest(FAN_MAIL);
        spamHandler.handleRequest(COMPLAINT_MAIL);
        spamHandler.handleRequest(NEW_LOC_MAIL);
        spamHandler.handleRequest("hhhhhh");
    }
}
