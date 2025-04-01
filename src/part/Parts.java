package part;

public class Parts {
    protected StringBuilder description;

    public Parts() {
        description = new StringBuilder("Piaon Trio");
    }

    public String getDescription() {
        return description.toString();
    }
}
