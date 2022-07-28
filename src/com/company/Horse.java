package com.company;
public class Horse extends Farm {
    int weight;
    int age;
    String gender;
    String nickName;
    @Override
    public String toString() {
        return nickName+" "+gender+" "+age+" "+weight;}

    public Horse(int weight, int age, String gender, String nickName) {
        super(null,0,0,0,null);
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
}
