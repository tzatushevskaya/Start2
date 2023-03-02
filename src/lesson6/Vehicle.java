package lesson6;

 class Vehicle {

     int passengers;
     int fuelCap;
     int milesPerGallon;

     void rangeCalculation() {
         System.out.println("Distance is " + fuelCap * milesPerGallon);
     }

     int rangeCalc() {
         return fuelCap * milesPerGallon;
     }

     void rangeCalculationWithName(String name) {
         System.out.println(name + " can take " + passengers + " passengers at a distance of "
                 + fuelCap * milesPerGallon + ".");
     }

     int pricePerPassenger(int price) {
         return rangeCalc()*price/passengers;

     }

}
