package javastuff.ray.com;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // add keys
        capitalCities.put("USA", "Washington");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities);

        capitalCities.remove("USA");
        System.out.println("USA is removed, " + capitalCities);

        capitalCities.clear();
        System.out.println("everything as been cleared: " + capitalCities);

        capitalCities.put("USA", "Washington");
        capitalCities.put("Russia", "Moscow");
        capitalCities.put("Norway", "Oslo");

        // loop through hashmap, print keyset
        for (String k : capitalCities.keySet()){
            System.out.println("Print key: " + k);
        }

        // loop through hashmap, print values
        for (String v : capitalCities.values()){
            System.out.println("Print values: " + v);
        }
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }
}

