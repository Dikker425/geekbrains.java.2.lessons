package lesson3;

import java.util.HashMap;
import java.util.TreeSet;

public class PhoneBook {

    public static HashMap<String, TreeSet<String>> phbook = new HashMap<>();


    public static void getBook(){
        System.out.println(phbook.entrySet());
    }

    public static void add(String name, String number){
        if (!phbook.containsKey(name)){
            phbook.put(name, new TreeSet<>());
        }phbook.get(name).add(number);
    }

    public static void get(String name){
        System.out.println("Номер " + name + " : " + phbook.get(name));
    }

}
