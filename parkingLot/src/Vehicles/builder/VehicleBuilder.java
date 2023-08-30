package Vehicles.builder;

import Vehicles.base.Vehicle;
import enumPack.VehicleType;

public final class VehicleBuilder {
    private VehicleBuilder() {}

    public static Vehicle build(VehicleType vehicleType) {
        Vehicle vehicle = null;
        switch (vehicleType) {
            case CAR:
                vehicle = CarBuilder.build();
                break;
            case MOTORCYCLE:
                vehicle = BikeBuilder.build();
                break;
            case TRUCK:
                vehicle = TruckBuilder.build();
                break;
        }
        return vehicle;
    }
}
