package generics;

public class GenericType<T> {

    /**
     * A field of "some type"
     */
    private T t;

    public GenericType(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
