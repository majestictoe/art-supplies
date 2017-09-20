package edu.sla;

public class Markers {
    String name;
    int number;
    int colors;
    String tip;
    String purpose;
    int samesize;
    void list(){
        System.out.println("I own " + number + " " + name + " in " + colors + " different colors.");
        System.out.println("They are " + tip + " and I use them for " + purpose + ".");
        if (samesize==0) {
            System.out.println("They are all the same size.");
        }
        if (samesize==1) {
            System.out.println("They vary in size.");
        }
        System.out.println("");
        }
    }
