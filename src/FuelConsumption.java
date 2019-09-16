public class FuelConsumption {

    public double calculateDistanceInKm(double fuelСonsumptionPer100km, double restOfFuelInLiters) {
        int hundredKilometers = 100;
        double distanceWithRestOfFuelInKm = restOfFuelInLiters * hundredKilometers / fuelСonsumptionPer100km;
        return distanceWithRestOfFuelInKm;
    }
}
