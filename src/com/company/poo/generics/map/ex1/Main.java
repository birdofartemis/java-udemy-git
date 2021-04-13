package com.company.poo.generics.map.ex1;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "Maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "91111111"); //overWrite

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); //null
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies:");

        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
