package com.company;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable
 */
public class Black {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();
        list.add("Yarik");
        list.add("Anna");
        list.add("Marina");

        System.out.println("Bilo");
        System.out.println(list);

        System.out.println("Stalo");
        Collections.sort(list);
        System.out.println(list);
    }
}
