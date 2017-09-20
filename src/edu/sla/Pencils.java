package edu.sla;

public class Pencils {
    int number;
    int colors;
    String feature;
    int broken;
    String name;
    void list(){
        System.out.println("I own " + number + " " + name + " in " + colors + " different colors.");
        System.out.println("They are "+ feature + " and " + broken + " are broken.");
    }
}
