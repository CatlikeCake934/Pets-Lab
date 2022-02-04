package com.company;

public class Pets {
    private String name;
    private int age;
    private String gender;

    public Pets(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public void good(){
        System.out.println("Good " + gender);
    }
    public String getGender(){
        return gender;
    }
    public String toString() {
        return "Name: " + name + "\n Age: " + age + "\n Gender:" + gender;
    }
}
