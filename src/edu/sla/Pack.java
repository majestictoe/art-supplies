package edu.sla;

class Pack {
    private String name;
    private int number;
    private int colors;

    Pack(String na, int nu, int co){
        name = na;
        number = nu;
        colors = co;
    }
    String getName(){return name;}
    int getNumber(){return number;}
    int getColors(){return colors;}
}
