package com.lambton;

//import java.lang.reflect.Array;

import java.util.*;

public class MyMainClass {

    public static void main(String[] args) {
        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("Canada");
        countryList.add("India");

        System.out.println(countryList.get(1));

        for (String name : countryList) {
            System.out.println(name);
        }

        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i));
        }

        HashSet<String>c=new HashSet<>();
        c.add("A");
        c.add("B");

        c.add("A");
        c.add("B");
        c.add("b");
        c.add("C");
        c.add("D");

        for(String s:c){
            System.out.println(c);
        }
        HashMap<String, String>hashMap=new HashMap<>();

        hashMap.put("IND","India");
        hashMap.put("AUS","Australia");
        hashMap.put("IND","Canada");
        hashMap.put(null,null);
        for(Map.Entry<String,String>entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());

            HashMap<String,>
        }
    }

}
