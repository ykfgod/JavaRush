package generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        Так записать мы не можем
//        List<Number> list = new ArrayList<Integer>();
//        List<Object> list = new ArrayList<Integer>();

        // а вот так можем ? - знак WildCard
        List<?> list = new ArrayList<Integer>();

        // bounded (ограниченый wildCard), Integer extends Number
        // поэтому запись корркетна
        // а так нет
        // List<Number> list = new ArrayList<Integer>();

        List<? extends  Number> list30 = new ArrayList<Integer>();



        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.24);
        list1.add(3.34);

        showListInfo(list1);

        ArrayList<Double> al = new ArrayList<>();
        al.add(3.14);
        al.add(3.24);
        al.add(3.34);
        System.out.println(summ(al));


        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("privet");
        list2.add("poka");

        showListInfo(list2);

    }
    static void showListInfo (List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public  static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
