package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTests {

    @Test
    void immutableToMutable() {
        List<String> immutableList = Arrays.asList("one", "two", "three");
        List<String> mutableList = new ArrayList<>(immutableList);

        //immutableList.add("four");//java.lang.UnsupportedOperationException -> immutable
        mutableList.add("four");//could be added, mutableList is mutable
        print(mutableList);
    }

    void arrayListClass() {
        ArrayList<String> arrayList = new ArrayList<>();//default capacity is 10
        arrayList.ensureCapacity(15);//have a method to manual increasing the capacity

        List<String> list = new ArrayList<>();
        //list.ensureCapacity(15);//List doesn't have a such method!

        ArrayList<String> arrayList2 = new ArrayList<>(15);//changed default capacity to 15
    }

    private void print(List<?> list) {//<?> wildcard allow us to have the same method for all types
        System.out.println("--------begin---------");
        for (Object listElement : list) {
            System.out.println(listElement);
        }
        System.out.println("---------end----------");
    }

    //use for-each if you just need to print all data
    //use for loop with list.size() if you need to skip some elements
    private void secondPrint(List<?> list) {
        for (int i = 0; i < list.size(); i += 2) {
            System.out.println(list.get(i));
        }
    }
}
