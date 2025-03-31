package org;

public class OnsiteWorker extends Worker{
    static int petrol;

    public OnsiteWorker(String name, String surname, int pricePerHour, int petrol){
        super(name, surname, pricePerHour);
        petrol = petrol;
    }

    @Override
    public void calculateSalary(int workedHours){
        int salary = workedHours*super.getPricePerHour() + petrol;
        System.out.println("This is the online worker's salary : " + salary );
    }

}
