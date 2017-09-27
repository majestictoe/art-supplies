package edu.sla;

class Pencils extends Pack{
    String feature;
    int broken;

    Pencils(String na, int nu, int co, String fe, int br) {
        super(na, nu, co);
        feature = fe;
        broken = br;
    }

    void list(){
        super.slist();
        System.out.println("They are "+ feature + " and " + broken + " are broken.");
        System.out.println("");
    }
}
