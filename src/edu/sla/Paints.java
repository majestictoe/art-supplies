package edu.sla;

class Paints extends Pack{
    String shape;

    Paints(String na, int nu, int co, String sh) {
        super(na, nu, co);
        shape = sh;
    }

    void list() {
        System.out.println("I own " + getNumber() + " " + getName() + " in " + getColors() + " different colors.");
        System.out.println("They are shaped like " + shape + ".");
        System.out.println(" ");
    }
}
