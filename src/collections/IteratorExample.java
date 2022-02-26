package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Yarik");
        list1.add("Ivan");
        list1.add("Anna");
        list1.add("Igor");
        list1.add("Elena");

        Iterator<String> iterator = list1.iterator();
//        while(iterator.hasNext())
//            System.out.println(iterator.next());
//
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(list1);
    }
}
