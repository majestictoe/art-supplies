package edu.sla;

public class Main {

    public static void main(String[] args) {

	Markers PITT = new Markers();
	PITT.name = "Faber Castell PITT Artist Pens";
	PITT.number = 48;
	PITT.colors = 38;
	PITT.tip = "brush tip";
	PITT.purpose = "coloring and outlining";
	PITT.samesize = 1;

	Markers tombow = new Markers();
	tombow.name = "Tombow Acid Free Markers";
	tombow.number = 10;
	tombow.colors = 9;
	tombow.tip = "brush and nib tip";
	tombow.purpose = "coloring in grayscale";
	tombow.samesize = 0;

	Markers micron = new Markers();
	micron.name = "Micron Pens";
	micron.number = 7;
	micron.colors = 0;
	micron.tip = "nib tip";
	micron.purpose = "outlining";
	micron.samesize = 1;

	Pencils koh = new Pencils();
	koh.name = "Koh-I-Noor Woodless Coloured Pencils";
	koh.number = 24;
	koh.colors = 24;
	koh.feature = "woodless";
	koh.broken = 2;

	//finish
	Pencils fan = new Pencils();
	fan.name = "Fantasia Watercolor Pencils Premium";
	fan.number = 24;
	fan.colors = 24;
	fan.feature = "watercolors";
	fan.broken = 0;

	micron.list();
	tombow.list();
	PITT.list();
	koh.list();
	fan.list();
    }
}
