package chain_of_responsibility.simple_chain_of_responsibility;

public class Request {
    private String value;

    public Request(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
