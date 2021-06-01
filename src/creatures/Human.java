package creatures;


import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone mobilePhone;
    public Car[] garage;
    public int garageAmount;
    Date date = new Date();
    private double salary;
    public double cash;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garageAmount = 1;
        this.garage = new Car[1];
    }

    public Human(String firstName, String lastName, int garageAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garageAmount = garageAmount;
        this.garage = new Car[garageAmount];
    }

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

    public Car getCar(int id) {
        if (id < this.garageAmount)
            return garage[id];
        else
            return null;
    }

    public void setCar(Car car, int id) {
        if (id < this.garageAmount) {
            if (car == null) {
                System.out.println("car deleted");
                this.garage[id] = null;
                return;
            }
            double salary = getSalary();
            if (salary > car.cost) {
                System.out.println("Udalo sie kupic za gotuwke");
                this.garage[id] = car;
                return;
            }
            if (salary > car.cost / 12) {
                System.out.println("Udalo sie kupic na kredyt");
                this.garage[id] = car;
                return;
            }
            System.out.println("Nie udalo sie kupic...");
        }
        System.out.println("Nie ma takiego miejsca w garazu");
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public double totalCost() {
        double totalCost = 0;
        for (int i = 0; i < this.garage.length; i++) {
            totalCost += garage[i].cost;
        }
        return totalCost;
    }

    public void sortCars() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i].yearOfProduction > this.garage[i + 1].yearOfProduction) {
                Car tmp = this.garage[i + 1];
                this.garage[i + 1] = this.garage[i];
                this.garage[i] = tmp;
            }
        }
    }

    public boolean hasCar(Car car) {
        for (Car value : this.garage) {
            if (value == car)
                return true;
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (Car car : this.garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void addCar(Car car) {
        car.addOwner(this);
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                garage[i] = car;
                return;
            }
        }
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                garage[i] = null;
                return;
            }
        }
    }

    public void printCarsfromGarage() {
        for (Car car : this.garage) {
            System.out.println(car);
        }
    }

    public String firstAndLastName() {
        return this.firstName + " " + this.lastName;
    }
}

