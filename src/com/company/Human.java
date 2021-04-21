package com.company;


import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    Car car;
    Date date = new Date();
    private double salary;

    public double getSalary() {
        System.out.println("Data pobierania wartosci:");
        System.out.println(date);
        System.out.println("Wartosc:");
        System.out.println(salary);
        return this.salary;
    }

    public void setSalary(double Salary) throws Exception {
        if (Salary < 0) throw new IllegalArgumentException();
        System.out.println("Nowe dane zostały wysłane do systemu księgowego");
        System.out.println("Koniecznosc odebrania aneksu do umowy od pani Hani z kadr");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        this.salary = Salary;
    }
}

