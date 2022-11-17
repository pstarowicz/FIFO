package FIFOPriority;

public class FIFOElement {
    private String value;
    private int priority;

    public FIFOElement(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }
}
