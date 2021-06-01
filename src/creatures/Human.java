package creatures;


import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone mobilePhone;
    public Car car;
    Date date = new Date();
    private double salary;
    public double cash;

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

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (salary > car.cost) {
            System.out.println("Udalo sie kupic samochod!");
            this.car = car;
        } else if (salary > car.cost / 12) {
            System.out.println("Udalo sie kupic na kredyt (no trudno)");
            this.car = car;
        } else {
            System.out.println("Nie ma mozliwosci kupic samochod!");
        }
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

