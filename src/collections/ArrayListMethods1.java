package collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("yarik");
        list1.add("ivan");
        list1.add("anna");
        list1.add(1, "Misha");

        for (String s : list1) {

            System.out.print(s + " ");

        }

        System.out.println();

        System.out.println(list1.get(2));

//        for (int i = 0; i < list1.size(); i++) {
//
//            System.out.println(list1.get(i));
//
//        }

        list1.set(1, "Valera");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);
    }
}
