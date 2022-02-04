package com.company;

public class Dog extends Pets{
    private String breed;
    private boolean seeingEyeDog;
    private String sED;

    public Dog(String name, int age, String breed, String gender, boolean seeingEyeDog){
        super(name, age, gender);
        this.breed = breed;
        this.seeingEyeDog = seeingEyeDog;
    }
    public String SeeingEye(){
        if(seeingEyeDog){
            return "Yes";
        }else{
            return "No";
        }
    }
    public void setBreed(String b){
        breed = b;
    }
    public String toString(){
        return super.toString() + "\n Breed: " + breed + "\n Seeing Eye Dog?: " + SeeingEye();
    }
}
