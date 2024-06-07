package com.enigmacamp;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayListExample {
    public static void main(String[] args) {
        System.out.println("Basic ArrayList");
        //CRUD Style

        // TODO: Membuat ArrayList nama-nama trainee Gosling 3
        List<String> names = new ArrayList<>();

        // TODO: Menambahkan data ke dalam ArrayList
        //Create
        names.add("Radit");// 0
        names.add("Ahmad");// 1
        names.add("Joko");// 2
        names.add("Anwar");// 3
        names.add("Tanto");// 4
        names.add("Tanto");// 5


        //View
        viewAllData("Nama", names);
        // TODO: Mengakses data pada index tertentu
        System.out.println(names.size() + "");
        System.out.println("Name: " + names.get(1));

        // TODO: Mengubah elemen pada index tertentu
        System.out.println("Nama " + names.set(1, "Jamet") + " Berhasil Di Ubah");
        System.out.println("Name: " + names);

        // TODO: Menghapus elemen pada index tertentu
        System.out.println("Nama " + names.remove(1) + " Berhasil Di Hapus"); // menghapus menggunakan index, jadi harus tau data yang akan di hapus berada di index ke berapa!
        System.out.println("Name: " + names);
        names.removeIf("Tanto"::equals); //menghapus nama yang double seperti looping mencari nama yang sama.
        if (names.remove("Tanto")) { //menghapus menggunakan Objek(nama langsung tanpa perlu tau berada di index ke berapa)
            System.out.println("Nama Berhasil Di Hapus");
        } else {
            System.out.println("Data tidak di temukan!");
        }
        System.out.println("Name: " + names);

        // TODO: Join Collection
        List<String> teachers = new ArrayList<>();
        teachers.add("Tanto");
        teachers.add("Yatno");
        viewAllData("teachers", teachers);

        teachers.addAll(names);
        teachers.add(2, "Wati");
        viewAllData("teachers", teachers);

        System.out.println(teachers.contains("Tanto"));
    }

    static void viewAllData(String title, List<String> list) {
        System.out.println("Daftar " + title + " " + list);
    }
}

