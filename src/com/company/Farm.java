package com.company;

public class Farm {
    String adress;
    int cows;
    int horses;
    int sheeps;
    String ownerName;

    @Override
    public String toString() {
        return "Fermanyn adressi "+adress+"  eesi  "+ownerName+"  Fermada "+cows+" ui, "+horses+" at, "+sheeps+" koiy bar   Tizme:";
    }

    public Farm(String adress, int cows, int horses, int sheeps, String ownerName) {
        this.adress = adress;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }
}
