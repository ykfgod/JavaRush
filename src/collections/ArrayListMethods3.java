package collections;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("yarik");
        list1.add("ivan");
        list1.add("anna");

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("anna");
        list2.add("TTTT");

        System.out.println(list2);

        list1.addAll(1, list2);
        System.out.println(list1);

//        list1.clear();
//        System.out.println(list1);

        System.out.println(list1.indexOf("anna"));
        System.out.println(list1.lastIndexOf("anna"));

        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("Kolya"));
    }
}
