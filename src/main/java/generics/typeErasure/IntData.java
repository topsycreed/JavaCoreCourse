package generics.typeErasure;

public class IntData extends Data<Integer> {
    public IntData(Object data) {
        super((Integer) data);
    }

    public IntData(Integer data) {
        super(data);
    }
}
