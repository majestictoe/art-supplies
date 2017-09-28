package edu.sla;

class Kit {
    private void getMarkers() {
        Markers pitt = new Markers("Faber Castell PITT Artist Pens",48,38,"brush tip","coloring and outlining",1);
        Markers tombow = new Markers("Tombow Acid Free Markers",10,9,"brush and nib tip","coloring in grayscale",0);
        Markers micron = new Markers("Micron Pens",7,0,"nib tip","outlining",1);
        micron.list();
        tombow.list();
        pitt.list();
    }
    private void getPaints(){
        Paints folkArt = new Paints("Folkart Paints",4,4,"cylinders");
        Paints apple = new Paints("Apple Barrel Paints",4,4,"cylinders");
        Paints basics = new Paints("Liquitex Acrylic Color Basics Paints",5,5,"triangles");
        Paints newton = new Paints("Winsor and Newton Galeria Acrylic Paints",1,1,"triangles");
        folkArt.list();
        apple.list();
        basics.list();
        newton.list();
    }
    private void getPencils(){
        Pencils koh = new Pencils("Koh-I-Noor Woodless Coloured Pencils",24,24,"woodless",2);
        Pencils fan = new Pencils("Fantasia Watercolor Pencils Premium",24,24,"watercolors",0);
        koh.list();
        fan.list();
    }
    void retFull(){
        Kit eleanors = new Kit();
        System.out.println("Markers:");
        eleanors.getMarkers();
        System.out.println("Paints:");
        eleanors.getPaints();
        System.out.println("Pencils:");
        eleanors.getPencils();
    }
}
