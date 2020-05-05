package com.manish;

public class Main {

    public static void main(String[] args) {
	Person person = new Person("Ram", 34);
	person.setAddress("1321 Meadow Creak Drive ");
        System.out.println("My Name and address is: " + person.getName()
                +" ,Age is " + person.getAge() + " ,\nAddress " + person.getAddress());
        person.setZipCode(75038);
        System.out.println("" + person.getZipCode());
        person = new Person ("Shayam",16);
        System.out.println(" Person is " + person.getName() + " , " + person.getAge());

        Voter restriction = new Person("Gopal", 14);
        System.out.println("name: " + restriction.name());


    }
}
