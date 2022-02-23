package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Yarik");
        list1.add("Ivan");
        list1.add("Anna");
        list1.add("Igor");
        list1.add("Elena");

        //Этот объект созданый с помощью subList не является отдельно сущностью, он зависит от
        //list1 и манипуляции с myList тоже самое будет с list1
        System.out.println(list1);
        List<String> myList = list1.subList(0, 4);
        System.out.println(myList);

        myList.add("Galanov");
        System.out.println(list1);
        System.out.println(myList);

        Object[] array = list1.toArray();
        String[] array1 = list1.toArray(new String[5]);

        for (String s : array1)
            System.out.println(s);


        //используется полсле JDK >8 и создает СТАТИЧНЫЙ list, который нельзя изменять
        // но можно быстро создатьс объявлением объектов
//        List<Integer> list2 = List.of(3, 7 ,13);


//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Yarik");
//        list2.add("Anna");
//        list2.add("Igor");

        //Удаление из list1 всех объектов типа list2
//        list1.removeAll(list2);
//        System.out.println(list1);

        //Оставляет только все объекты из list2 в list1
//        list1.retainAll(list2);
//        System.out.println(list1);

        //Содержит ли list1 все объекты list2, выводит boolean
//        System.out.println(list1.containsAll(list2));
    }
}
