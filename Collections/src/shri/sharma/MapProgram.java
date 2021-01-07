package shri.sharma;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        if (language.containsKey("Java")){
            System.out.println("Java already exists.");
        } else {
            language.put("Java", "A compiled high level lang.");
            System.out.println("Java added successfully");
        }

        language.put("Python", "Algorijthmic language");
        System.out.println(language.put("Lisp", "Lisp is a programming lang"));

//        System.out.println(language.get("Java"));
//        System.out.println(language.put("Java", "A compiled high  lang."));
//        System.out.println(language.get("Java"));

        if (language.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            language.put("Java", "this is course of java");
        }

//        language.remove("Lisp");
        language.replace("Lisp", "Hold my Milk", "hey bitch");
        language.replace("Lisp", "Hold my Milk");
        System.out.println("============================================");

        for (String key: language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }
    }
}
