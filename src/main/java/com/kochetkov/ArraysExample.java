package com.kochetkov;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.*;

public class ArraysExample {

    int[] intArray = new int[]{1, 2, 3, 4, 5};
    String[] stringArray = new String[]{"foo", "bar"};

    public static void main(String... args) {
        int[] intArray = new int[5];
//        String[] stringArray;
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

//        for (int i = 0; i < intArray.length  ; i++) {
//            System.out.println(intArray[i]);
//        }

        for (int element : intArray) {
            System.out.println(element);
        }

        System.out.println(Arrays.toString(intArray));

        ElementsCollection selenideElements = Selenide.$$("");

        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.add("bo");
        stringList.add("bo1");
        stringList.add("bo2");
        stringList.remove(0);
        stringList.remove("bo");
        System.out.println(stringList);

        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(10);
        intList.remove(Integer.valueOf(10));
        intList.add(2, 15);
        System.out.println(intList);

//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(intList.get(i));
//        }

//        Integer[] integers = intList.toArray(new Integer[0]);
//        Iterator<Integer> iterator = intList.iterator();
//        while ( iterator.hasNext()) {
//            if (iterator.next().equals(10))
//            iterator.remove();
//        }
//
        Collections.emptyList();
        Collections.emptySet();
        Collections.emptyMap();

        List<String> strings = Arrays.asList("id");
        List<String> strings0 = Collections.singletonList("id");
        List<String> strings1 = new ArrayList<>(List.of("id", "id2"));

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Первый");
        stringSet.add("Второй");
        stringSet.add("Третий");
        System.out.println(stringSet);

        Set<String> linkedStringSet = new LinkedHashSet<>();
        linkedStringSet.add("Первый");
        linkedStringSet.add("Второй");
        linkedStringSet.add("Третий");
        System.out.println(linkedStringSet);

        Set<String> treeStringSet = new TreeSet<>();
        treeStringSet.addAll(linkedStringSet);
        System.out.println(treeStringSet);

        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "foo");
        aMap.put(2, "bar");
        aMap.put(3, "bar2");
        for (int i = 1; i <= aMap.size(); i++) {
            if (aMap.containsKey(i)) {
                System.out.println("содержит значение " + aMap.get(i));
            } else {
                System.out.println("Не содержит такое значение");
            }
        }
        Collection<String> values = aMap.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
        System.out.println(entries);
        Set<Integer> keySet = aMap.keySet();
        System.out.println(keySet);
    }

    static List<Integer> returnListIfArgumentGreaterThen0(int i) {
        if (i > 0) {
            return Arrays.asList(i);
        }
        return Collections.emptyList();
    }
}