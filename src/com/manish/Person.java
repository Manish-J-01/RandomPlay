package com.manish;

import java.util.*;

public class Person implements Voter {
    private String name;
    private int age;
    private String address;
    private double zipCode;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person(double zipCode) {
        this.zipCode = zipCode;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public Person() {

    }

    public double getZipCode() {
        return zipCode;
    }

    public void setZipCode(double zipCode) {
        this.zipCode = zipCode;
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
        if (this.age < 18) {
            System.out.println(" Not qualify");
        } else {
            System.out.println(" Make great again!");
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public List<String> name() {
        List<String> names = new ArrayList<String>();
        names.add(0, this.name);
        names.add(1, this.address);
        return names;
    }

    @Override
    public void age() {
        if (age <= 18) {
            System.out.println("not qualify");
        } else {
            System.out.println("Good to go.");
        }
    }
}
//        @Override
//        public String toString() {
//            return "Person{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    ", address='" + address + '\'' +
//                    ", zipCode=" + zipCode +
//                    '}';
//        }
//
//    }
//    @Override
//    public String name() {
//        return name;
//    }
//
//    @Override
//    public int age() {
//       // for(age = 0 ; age <=100 ; age++){
//            if(age < 18){
//                System.out.println("The person is UnderAge for voting.");
//            }else{
//                System.out.println("Welcome to voting and make a difference.");
//            }
//       // }
//        return age;
//    }

