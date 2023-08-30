package parking.utility;

import enumPack.VehicleType;
import parking.ParkingSpot;

import java.util.LinkedList;
import java.util.List;

public final class ParkingSpotBuilder {
    private ParkingSpotBuilder() {

    }

    public static LinkedList<ParkingSpot> buildParkingSpot(Integer numberOfParking, VehicleType vehicleType) {
        LinkedList<ParkingSpot> spots = new LinkedList<>();
        for (int i = 0; i < numberOfParking; i++) {
            ParkingSpot parkingSpot = new ParkingSpot(i, vehicleType);
            spots.add(parkingSpot);
        }
        return spots;
    }
}
