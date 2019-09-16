public class Main {
    public static void main(String[] args) {

        FuelConsumption restOfFuel = new FuelConsumption();
        double fuelСonsumptionPer100km = 8;
        double restOfFuelInLiters = 45;
        System.out.println(Math.floor(restOfFuel.calculateDistanceInKm(fuelСonsumptionPer100km, restOfFuelInLiters)));
    }
}

