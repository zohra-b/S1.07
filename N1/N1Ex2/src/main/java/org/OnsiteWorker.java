package org;

public class OnsiteWorker extends Worker{
    static int petrol;

    public OnsiteWorker(String name, String surname, int pricePerHour, int petrol){
        super(name, surname, pricePerHour);
        OnsiteWorker.petrol = petrol;
    }

    @Override
    public void calculateSalary(int workedHours){
        int salary = workedHours*super.getPricePerHour() + petrol;
        System.out.println("This is the online worker's salary : " + salary );
    }


    /*
     *@deprecated
     * we do not use the workedHours index to calculate internet compensation since we use the static variable petrol
     */
    @Deprecated
    public double calculatePetrolcompensation(int workedHours){
        return workedHours*0.12;
    }
}
