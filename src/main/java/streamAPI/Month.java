package streamAPI;

public class Month {
    private String name;
    private int order;

    public Month(int order) {
        this.order = order;
        this.name = String.valueOf(order);
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
