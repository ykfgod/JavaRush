package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

//        list.add ("OK");
//        list.add (5);
//        list.add(new StringBuilder("deeasd"));
//        list.add(new Car());

        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("dasd");

        for (Object o : list) {

            System.out.println(o + " dilina " + ((String)o).length());

        }

    }
}

class Car {

}
