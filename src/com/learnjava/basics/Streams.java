package com.learnjava.basics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
         Thread t = new Thread(Streams::actionForThread);
         t.start();
    }

    private static void actionForThread() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(System.out::println);
    }
}

