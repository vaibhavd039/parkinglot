package parking;

import enumPack.VehicleType;
import parking.utility.ParkingSpotBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ParkingLevel {
    private List<ParkingSpot> spots;
    private Map<VehicleType, Queue<ParkingSpot>> availableSpots;


    public ParkingLevel(int numCarSpots, int numMotorcycleSpots, int numTruckSpots) {
        availableSpots = new HashMap<>();
        availableSpots.put(VehicleType.CAR, ParkingSpotBuilder.buildParkingSpot(numCarSpots, VehicleType.CAR));
        availableSpots.put(VehicleType.MOTORCYCLE, ParkingSpotBuilder.buildParkingSpot(numMotorcycleSpots,
                VehicleType.MOTORCYCLE));
        availableSpots.put(VehicleType.TRUCK, ParkingSpotBuilder.buildParkingSpot(numTruckSpots, VehicleType.TRUCK));
    }

    public ParkingSpot getSlot(VehicleType vehicleType) {
        if (!availableSpots.containsKey(vehicleType) || availableSpots.get(vehicleType).isEmpty()) {
            return null; // No available spot for this vehicle type
        }

        ParkingSpot spot = availableSpots.get(vehicleType).poll(); spot.occupy(); return spot;
    }

    public void vacateSpot(ParkingSpot spot) {
        spot.vacate(); availableSpots.get(spot.getAllowedVehicleType()).offer(spot);
    }
}
