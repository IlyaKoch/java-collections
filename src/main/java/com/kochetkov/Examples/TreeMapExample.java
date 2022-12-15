package com.kochetkov.Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
//        Object petr = new Object(1, "Petr", "Petrov");
//        Object vanya = new Object(9, "Ivan", "Ivanov");
//        Object katya = new Object(8, "Katya", "Semenova");
//        Object katya1 = new Object(27, "Katya1", "Semenova1");
//        Object katya2 = new Object(56, "Katya2", "Semenova2");
//        Object katya3 = new Object(45, "Katya3", "Semenova3");
//
//        Map<Integer, Object> map = new TreeMap<>();
//        map.put(petr.getId(), petr);
//        map.put(vanya.getId(), vanya);
//        map.putIfAbsent(katya.getId(), katya);
//        map.putIfAbsent(katya1.getId(), katya1);
//        map.putIfAbsent(katya2.getId(), katya2);
//        map.putIfAbsent(katya3.getId(), katya3);
//        System.out.println(map.get(1));
//
//        for (Map.Entry<Integer, Object> integerObjectsEntry : map.entrySet()) {
//            System.out.println(integerObjectsEntry.getKey() + " = " + integerObjectsEntry.getValue());
//        }

        Map<String, String> map1 = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(map1));
    }

    private static boolean isUnique(Map<String, String> map1) {
        return map1.size() == new HashSet<>(map1.values()).size();
    }
}


