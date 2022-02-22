package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add (10);
        list1.add (15);
        list1.add (20);

        int a = GenMethod.getSecondElement(list1);
        System.out.println(a);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add ("privet");
        list2.add ("Yaroslav");
        list2.add ("Shangin");

        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);
    }
}

class GenMethod {
    public static <T> T getSecondElement (ArrayList<T> al) {
        return al.get(1);
    }
}
