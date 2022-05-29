package generics;

public class Three<T, U, V> {
    private T t;
    private U u;
    private V v;

    public Three(T t, U u, V v) {
        this.t = t;
        this.u = u;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    public V getV() {
        return v;
    }
}
