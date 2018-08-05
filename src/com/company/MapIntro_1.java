package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapIntro_1 {

    public static void main(String[] args) {
        //Map intro
        //HashMap

        //LIST              SET             MAP
        //ArrayList     HashSet           HashMap
        //LinkedList    TreeSet           TreeMap
        //              LinkedHashSet     LinkedHashMap

        //  brand      count
        //Map<String, Integer> wordCount = new HashMap<>();
        //Mazda     - 2
        //Honda     - 0
        //Hyundai   - 2


        //     email    person object
        //Map<String, Person>


        //    ключ от машины    сама машина
        //Map<String,               Car>


        Map<String, Integer> map = new HashMap<>();
        map.put("window", 1);
        map.put("phone", 1);
        map.put("phone", 1);
        //map.size() = 2


        System.out.println(map);

        System.out.println("Contains: " + map.containsKey("phone"));

        System.out.println("Get: " + map.get("phone"));
        System.out.println("Get (not exists): " + map.get("car"));

        Integer oldValue = map.remove("phone");
        System.out.println(oldValue);

        System.out.println(map.getOrDefault("car", 15));

        System.out.println(map.size());


//        map.get("car").toString();
        //if else

//        if (true) {
//
//        } else ;
//

        //code code code
//        if (1 == 1) {
//
//        } else {
//
//        }

//        if (2==2) {
//
//        } else {
//
//        }

        //map.get("car")/*.intValue()*/; //NullPointerException


    }
}
