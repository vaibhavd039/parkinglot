package Vehicles.builder;

import Vehicles.impl.VehicleImpl;
import Vehicles.base.Vehicle;
import enumPack.VehicleType;

import java.util.UUID;

public final class BikeBuilder {
    private BikeBuilder() {}
    public static Vehicle build() {
        Vehicle car = new VehicleImpl(UUID.randomUUID().toString(), VehicleType.MOTORCYCLE);
        return car;
    }
}
