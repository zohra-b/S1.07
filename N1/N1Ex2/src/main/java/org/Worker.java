package org;

public class Worker {
    private String name;
    private String surname;
    private int pricePerHour;

    public Worker(String name , String surname, int pricePerHour){
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    public void calculateSalary(int workedHours){
        System.out.println("This is the worker's salary : " + workedHours*this.pricePerHour);
    }

}
