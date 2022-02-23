package generics;

import java.util.ArrayList;
import java.util.List;

public class SubType {
    public static void main(String[] args) {
        X x = new Y();
        List<X> list1 = new ArrayList<X>();

        // Так мы не можем написать, не смотря на то
        // что Y поддтип X и ArrayList подтип List
        //List<X> list1 = new ArrayList<Y>();

        //Вот почему не можем еще пример диамически ArrayList присваивается
        //Integer , хотя list имееет Type Number

//        List<Number> list = new ArrayList<Integer>();
//        list.add(18);
//        list.add(3.14);

    }
}

class X {

}

class Y extends X {

}