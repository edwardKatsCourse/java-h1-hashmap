package com.company;

import java.util.*;

public class MapOperations_2 {

    public static void main(String[] args) {
        //Ключ для HashMap требует реализации equals и hashCode, как и для HashSet
        //Ключ для TreeMap требует имплементировать Comparable, как и для TreeSet

        Map<String, Person> map = new HashMap<>();
        map.put("peter@site.com", new Person("peter@site.com", "Peter", 41)); //Entry<String, Person>
        map.put("david@site.com", new Person("david@site.com", "David", 51)); //Entry<String, Person>
        map.put("sarah@site.com", new Person("sarah@site.com", "Sarah", 22)); //Entry<String, Person>
        map.put("maria@site.com", new Person("maria@site.com", "Maria", 33)); //Entry<String, Person>
        //                                                                                   Set<Entry<String, Person>>

        Set<String> emails = map.keySet();


        map.keySet(); //получить HashSet из ключей map

        Person person = map.get("peter@site.com");

//        for (String email /*, Person p*/ : emails) {
//        }

        map.entrySet(); //Entry<Key, Value>: getKey(), getValue()

        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int currentElement: array) {
        }

        for (Map.Entry<String, Person> pair         :               map.entrySet()) {

            System.out.println(pair.getKey() + "\t\t" + pair.getValue());
        }


        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");


    }


}

class Person {
    private String email;
    private String name;
    private Integer age;

    //constructors
    //getters
    //setters
    //toString


    public Person(String email, String name, Integer age) {
        this.email = email;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Email: %s | Age: %s",
                this.name,
                this.email,
                this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}












