package parking;

import enumPack.VehicleType;

public class ParkingSpot {
    private int spotNumber;
    private boolean occupied;
    // As of now It is assumed that only one type of vehicle is allowed
    private VehicleType allowedVehicleType;

    public ParkingSpot(int spotNumber, VehicleType allowedVehicleType) {
        this.spotNumber = spotNumber;
        this.allowedVehicleType = allowedVehicleType;
        this.occupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isVehicleTypeAllowed(VehicleType vehicleType) {
        return allowedVehicleType == vehicleType;
    }

    public VehicleType getAllowedVehicleType(){
        return allowedVehicleType;
    }
    public void occupy() {
        occupied = true;
    }

    public void vacate() {
        occupied = false;
    }
}
