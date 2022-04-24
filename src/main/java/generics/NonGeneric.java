package generics;

public class NonGeneric {
    private Object val;

    public NonGeneric(Object val) {
        this.val = val;
    }

    public Object get() {
        return val;
    }
}
