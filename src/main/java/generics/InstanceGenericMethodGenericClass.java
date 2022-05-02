package generics;

public class InstanceGenericMethodGenericClass<T> {

    public <U> T getParameterizedObject(T t, U u) {
        return (T) (t.toString() + u.toString());
    }
}
