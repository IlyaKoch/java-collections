package guru.qa;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArraysExample {

    int[] intArray = new int[]{1, 2, 3, 4 ,5};
    String[] stringArray = new String[]{"foo", "bar"};

    public static void main(String... args) {
        int[] intArray = new int[5];
//        String[] stringArray;
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        ElementsCollection selenideElements = Selenide.$$("");

        List<String> stringList = new ArrayList<>();
        stringList.add("foo");
        stringList.remove(0);
        stringList.remove("foo");

        List<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(10);

        Collections.emptyList();

        List<String> strings = Arrays.asList("id");
        List<String> strings0 = Collections.singletonList("id");
        List<String> strings1 = new ArrayList<>(List.of("id", "id2"));

        Set<String> stringSet = new HashSet<>();
        Set<String> linkedStringSet = new LinkedHashSet<>();
        Set<String> treeStringSet = new TreeSet<>();

        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "foo");
        aMap.put(2, "bar");

        Collection<String> values = aMap.values();
        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
        Set<Integer> keySet = aMap.keySet();



        for (int i = 0; i < intArray.length  ; i++) {
            System.out.println(intArray[i]);
        }

        for (int element : intArray) {
            System.out.println(element);
        }
    }

    static List<Integer> returnListIfArgumentGreaterThen0(int i) {
        if (i > 0) {
            return Arrays.asList(i);
        }
        return Collections.emptyList();
    }
}
