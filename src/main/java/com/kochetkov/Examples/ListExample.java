package com.kochetkov.Examples;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
/*        List<String> list = new ArrayList<>();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        list.add("b1");
//        list.add("b2");
////        list.sort(Comparator.comparing(String::toString));
//        for (String values : list) {
//            System.out.println(values);
//        }
//
//        List<String> linkedList = new LinkedList<>();
//        linkedList.add("a1");
//        linkedList.add("a3");
//        linkedList.add("a2");
//        linkedList.add("a4");
//
//        for (String values : linkedList) {
//            System.out.println(values);
//        }
//
//        List<String> strings = Arrays.asList("123", "87", "3412" , "543", "987");
//        Collections.sort(strings);
//        strings.sort(Comparator.comparing(String::toString));
*/
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 6, 8, 9, 13, 20));
        List<Integer> result = removeEven(list1);
        System.out.println(result);

        List<Integer> list2 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        System.out.println(countUnique(list2));

    }

    private static List<Integer> removeEven(List<Integer> list1) {
        List<Integer> uneven = new ArrayList<>();
        for (Integer value : list1) {
            if (value % 2 != 0) {
                uneven.add(value);
            }
        }
        return uneven;
    }

    private static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
}