package com.enigmacamp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // TODO: Membuat sebuah HashSet untuk menyimpan usernames
        Set<String> username  = new HashSet<>();

                //TODO: Menambahkan element HashSet
        username.add("Radit");
        username.add("Ahmad");
        username.add("Joko");
        username.add("Anwar");
        username.add("Radit"); // Elemen duplikat, tidak akan di tambahkan
        username.add("Al");

        //TODO: Menampilkan elemen" pada HashSet

        System.out.println("Daftar Username: "+username);

        //TODO: Menghapus element HashSet
        System.out.println(username.remove("Joko"));
        System.out.println("Daftar Username: "+username);

        //TODO: Memeriksa apaka HashSet mengandung element tertentu
        boolean containResult = username.contains("Radit");
        System.out.println("Apakah HashSet mengandung nama Radit? "+ containResult);

        //TODO: check size
        int sizeResult = username.size();
        System.out.println("Ukuran dari HashSet: "+sizeResult);

        //TODO: clear HashSet
        username.clear();
        System.out.println("Daftar Username: "+username);

        // Iterate HashSet
        Set<String> days = new HashSet<>();

        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");


        //TODO: Iterate element menggunakan for-each
        System.out.println("Iterate element menggunakan for-each: ");
        for (String day : days) {
            System.out.println(day);
        }

        //TODO: Iterate element menggunakan Iterator
        System.out.println("Iterate element menggunakan Iterator: ");
        Iterator<String> iterator = days.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // TODO: Menggabungkan 2 HashSet
        Set<String> set1 = new HashSet<>();
        set1.add("Tanto");
        set1.add("Yatno");

        Set<String> set2 = new HashSet<>();
        set2.add("Radit");
        set2.add("Ahmad");

        Set<String> mergeSet = new HashSet<>();
        mergeSet.addAll(set2);

        System.out.println("Merge Set: " + set2);

    }
}
