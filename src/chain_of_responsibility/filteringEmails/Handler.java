package chain_of_responsibility.filteringEmails;

public abstract class Handler {
    protected Handler successor = null;

    protected final String SPAM_MAIL="SPAM_MAIL";
    protected final String FAN_MAIL="FAN_MAIL";
    protected final String COMPLAINT_MAIL="COMPLAINT_MAIL";
    protected final String NEW_LOC_MAIL="NEW_LOC_MAIL";

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}