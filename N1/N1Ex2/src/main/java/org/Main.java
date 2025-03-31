package org;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker w1 = new Worker("Laurent", "Gaudé", 72);
        OnlineWorker ol1 = new OnlineWorker("Victoria", "Hislop", 80);
        OnsiteWorker os1 = new OnsiteWorker("Mireille", "Sorgues", 100, 50);


        w1.calculateSalary(35);
        ol1.calculateSalary(35);
        os1.calculateSalary(35);

        System.out.println(ol1.calculateInternetPrice(35));
        System.out.println(os1.calculatePetrolcompensation(35));
    }
}