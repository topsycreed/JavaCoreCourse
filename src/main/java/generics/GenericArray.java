package generics;

public class GenericArray<T> {
    private T[] items;

    public GenericArray(T[] items) {
        this.items = items;
    }

    public T getItem(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }

    public T getMiddleItem() {
        if (length() > 0) {
            return length() % 2 == 0 ? getItem(length() / 2 - 1) : getItem(length() / 2);
        } else {
            return null;
        }
    }
}
