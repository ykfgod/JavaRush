package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "MADAM";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversiterator = list.listIterator(list.size());

        boolean isPalindrom = true;
        while (iterator.hasNext() && reversiterator.hasPrevious()) {
            if (iterator.next() != reversiterator.previous()) {
                isPalindrom = false;
                break;
            }
        }

        if (isPalindrom)
            System.out.println("Palindrom");
        else
            System.out.println("Ne Palindrom");
    }
}
