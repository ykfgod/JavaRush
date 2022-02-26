package collections;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(31);
        arrayList.add(-4);
        arrayList.add(-9);
        arrayList.add(16);
        arrayList.add(150);
        arrayList.add(-23);
        arrayList.add(-432);

        Collections.sort(arrayList);
        int index = Collections.binarySearch(arrayList, -3);
        System.out.println(index);
    }
}
