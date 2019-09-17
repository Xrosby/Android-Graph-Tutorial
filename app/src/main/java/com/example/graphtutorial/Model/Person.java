package com.example.graphtutorial.Model;

public class Person {

    private String name;
    private int age;
    private double annualSallary;

    public Person(String name, int age, double annualSallary) {
        this.name = name;
        this.age = age;
        this.annualSallary = annualSallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAnnualSallary() {
        return annualSallary;
    }

    public void setAnnualSallary(double annualSallary) {
        this.annualSallary = annualSallary;
    }

    @Override
    public String toString() {
        int nameLength = name.length();
        int tSize = 30 - nameLength;
        String format = "%s %" + tSize + "d %20.0f";
        return String.format(format, name, age, annualSallary);
    }
}