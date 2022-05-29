package generics.typeErasure;

import java.util.ArrayList;
import java.util.List;

public class Data<T extends Number> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Data(T data) {
        this.data = data;
    }
}
