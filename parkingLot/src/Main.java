import Vehicles.base.Vehicle;
import Vehicles.builder.VehicleBuilder;
import enumPack.VehicleType;
import executor.ParkingLot;
import utility.Ticket;

public class Main {
    public static void main(String[] args) {
        // Create and initialize a multi-level parking lot
        ParkingLot parkingLot = new ParkingLot(3, 50, 20, 10);

        // Simulate vehicles entering and exiting the parking lot
        Vehicle car = VehicleBuilder.build(VehicleType.CAR);
        Ticket carTicket = parkingLot.vehicleEnters(car);

        System.out.println("car entered ticket:" +carTicket.toString());
        Vehicle motorcycle = VehicleBuilder.build(VehicleType.MOTORCYCLE);
        Ticket motorcycleTicket = parkingLot.vehicleEnters(motorcycle);
        System.out.println("Bike entered ticket:" +motorcycleTicket.toString());
        // Simulate time passing

        parkingLot.vehicleExits(carTicket);
        System.out.println("car exited ticket:" +carTicket.toString());
        parkingLot.vehicleExits(motorcycleTicket);
        System.out.println("Bike exited ticket:" +motorcycleTicket.toString());
    }
}