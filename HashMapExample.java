package com.enigmacamp;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // TODO: Inisiasi HashMap
        Map<String, Integer> fruitMap = new HashMap<>();

        // TODO: Menambahkakn data ke HashMap
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 5);
        fruitMap.put("Orange", 7);
        fruitMap.put("Apple", 15); // Mengganti nilai dari key "Apple"

        // TODO: Menampilkan pasangan key-value dalam HashMap
        System.out.println("Map: " + fruitMap);
        System.out.println("Harga Orange: "+fruitMap.get("Orange")); //sensitive case, harus sama dengan yang di cari

        //TODO: Mengubah value dari key dalam HashMap
        fruitMap.put("Banana", 100);
        System.out.println("Harga Banana: "+fruitMap.get("Orange"));
        fruitMap.replace("Banana", 700);
        System.out.println("Harga Banana: "+fruitMap.get("Orange"));

        //Change key "Banana" to "Cerry"
        int oldValue = fruitMap.get("Banana");
        //TODO: Mengganti value "Banana" menjadi "Cerry" dalam HashMap
        fruitMap.put("Cerry", oldValue);
        System.out.println("Harga Cerry: "+fruitMap.get("Cerry"));

        //TODO: Menghapus key-value dari HashMap
        fruitMap.remove("Apple");
        System.out.println("Map: " + fruitMap);
    }
}
