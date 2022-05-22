package generics.generics;

import generics.generics.Data;

public class NumberData extends Data<Number> {
    public void setData(Number number) {
        System.out.println("NumberData set");
        super.setData(number);
    }
}
