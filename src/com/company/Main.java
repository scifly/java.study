package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.push("Caleb");
        names.push("Sue");
        names.push("Sally");

        ListIterator<String> it = names.listIterator();
        it.next();
        it.next();
        it.add("Susan");

        for (String name : names) {
            System.out.println(name);
        }

    }
}
