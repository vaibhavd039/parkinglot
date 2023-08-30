package Vehicles.builder;

import Vehicles.impl.VehicleImpl;
import Vehicles.base.Vehicle;
import enumPack.VehicleType;

import java.util.UUID;

public class TruckBuilder {
    private TruckBuilder() {}

    public static Vehicle build() {
        Vehicle car = new VehicleImpl(UUID.randomUUID().toString(), VehicleType.TRUCK);
        return car;
    }
}
