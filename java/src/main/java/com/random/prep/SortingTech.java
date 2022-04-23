package com.random.prep;


/* implementing comparator for maps */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingTech {

    static class MapSort implements Comparator<Map.Entry<String, String>> {

        public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
            return o2.getValue().length() - o1.getValue().length();
        }
    }

    public static void main(String[] args) {
        Map<String, String> nums = new HashMap<>();
        nums.put("ram79", "aaaaa");
        nums.put("ram2", "aa");
        nums.put("ram3", "aaa");
        nums.put("ram4", "a");
        nums.put("ram4999999", "aaaa");
        nums.put("ram5", "aaaaaaaaaaa");
        Set<Map.Entry<String, String>> val = nums.entrySet();
        System.out.println("outside" + val);
        for(Map.Entry<String, String> deez: val) {
            System.out.println("inLoop:" + deez);
        }

        List<Map.Entry<String, String>> listString = new ArrayList<>(nums.entrySet()); // convert it to a list
        Collections.sort(listString, new MapSort());
        System.out.println(listString);
        for(Map.Entry<String, String> map: listString) {
            System.out.println(map.getKey()+map.getValue());
        }

    }
}
