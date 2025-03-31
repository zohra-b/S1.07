package org;

public class OnlineWorker extends Worker {
    private final int INTERNET = 65;
    public OnlineWorker(String name, String surname, int pricePerHour){
        super(name, surname, pricePerHour);
    }

    @Override
    public void calculateSalary(int workedHours){
        int salary = workedHours*super.getPricePerHour() + INTERNET;
        System.out.println("This is the online worker's salary : " + salary);
    }

    /*
    *@deprecated
    * we do not use the workedHours index to calculate internet compensation since we use the constant INTERNET
     */
    @Deprecated
    public double calculateInternetPrice(int workedHours){
        return workedHours*0.35;
    }
}
