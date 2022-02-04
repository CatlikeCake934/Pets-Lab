package com.company;

public class Cat extends Pets{
    private boolean indoorCat;
    private String iC;
    private String breed;
    public Cat(String name, int age, String gender, String breed, boolean indoorCat){
        super(name, age, gender);
        this.indoorCat = indoorCat;
        this.breed = breed;

    }
    public String IndoorCat(){
        if(indoorCat){
            return "Yes";
        }else{
            return "No";
        }
    }
    public void setBreed(String b){
        breed = b;
    }
    public String toString(){
        return super.toString() + "\n Breed: " + breed + "\n Indoor Cat?: " + IndoorCat();
    }
}
