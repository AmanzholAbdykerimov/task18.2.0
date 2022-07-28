package com.company;

public class Main {
    public static void main(String[] args) {
        Farm[][] farm1 ={{new Farm("Bakai-Ata",5,2,3,"Marat")},
                {new Cow(43,4,"m","Marusya1"),
                        new Cow(43,4,"m","Marusya1"),
                        new Cow(43,4,"m","Marusya1"),
                        new Cow(43,4,"m","Marusya1"),
                        new Cow(43,4,"m","Marusya1"),
                        new Horse(56,9,"m","Puchok1"),
                        new Horse(56,9,"m","Puchok1"),
                        new Sheep(39,2,"j","Kesha1"),
                        new Sheep(39,2,"j","Kesha1"),
                        new Sheep(39,2,"j","Kesha1")}};

        Farm[][] farm2 ={{new Farm("Salkyn-Tor",1,1,1,"Samat")},
                {new Cow(43,4,"m","Marusya1"),
                        new Horse(56,9,"m","Puchok1"),
                        new Sheep(39,2,"j","Kesha1")}};
        System.out.println(farm1[0][0].toString());
        for(int i=0;i<10;i++){
            System.out.println(farm1[1][i].toString());
        }
        System.out.println("      ");
        System.out.println(farm2[0][0].toString());
        for(int j=0;j<3;j++){
            System.out.println(farm2[1][j].toString());
        }
    }
}