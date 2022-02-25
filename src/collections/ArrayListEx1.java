package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("yarik");
        list1.add("ivan");
        list1.add("anna");

        //Вариант офармления ArrayList определенной длинны
        ArrayList<String> list2 = new ArrayList<>(30);
        list2.add("Zaur");
        list2.add("Anton");

        // Еще вариант инициализации ArrayList
        List<String> list3 = new ArrayList<>(30);

        // Еще вариант инциализации с параметром другого ArrayList
        // который создает НОВЫЙ объект, а НЕ ссылается на существующий
        List<String> list4 = new ArrayList<>(list1);


        System.out.println(list1);
        System.out.println(list4);
        System.out.println(list4 == list1);
        System.out.println(list4 == list1);

    }
}
