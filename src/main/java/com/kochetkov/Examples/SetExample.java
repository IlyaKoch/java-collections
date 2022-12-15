package com.kochetkov.Examples;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ddd");
        set.add("ccc");
        set.add("aaa");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
    }
}