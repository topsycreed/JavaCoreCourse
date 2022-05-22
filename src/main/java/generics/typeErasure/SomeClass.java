package generics.typeErasure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SomeClass<T extends Number> {
    public Map<String, Integer> map;
    public List<? extends Number> getData(T t) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(t);
        return arrayList;
    }
}
