package edu.sla;

class Markers extends Pack{
    String tip;
    String purpose;
    int samesize;

    Markers(String na, int nu, int co, String ti, String pu, int sasi) {
        super(na, nu, co);
        tip = ti;
        purpose = pu;
        samesize = sasi;
    }

    void list(){
       super.slist();
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
