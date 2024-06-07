package com.enigmacamp;

import java.util.*;

public class IterateArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Joko");
        names.add("Santo");
        names.add("Budi");
        names.add("Joko");
        names.add("Jocko");
        names.add("10");
        names.add("joko");
        names.add("adit");

        //Iterasi element menggunakan standar loop
        System.out.println("Iterasi element menggunakan standar loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Iterasi element menggunakan For Each
        System.out.println("Iterasi element menggunakan For Each:");
        for (String name : names) {
            System.out.println(name);
        }

        // Iterasi element menggunakan While
        System.out.println("Iterasi element menggunakan While:");
        int i = 0;
        while (i < names.size()){
            System.out.println(names.get(i));
            i++;
        }


        // Iterasi element menggunakan Iterator
        System.out.println("Iterasi element menggunakan Iterator:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Data sebelum di sort: "+ names);
        Collections.sort(names); //fungsi sort akan mensortir dengan menggunakan metode ASCII
        System.out.println("Data Setelah di Sort: "+ names);
    }
}
