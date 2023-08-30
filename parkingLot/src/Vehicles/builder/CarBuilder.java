package Vehicles.builder;

import Vehicles.impl.VehicleImpl;
import Vehicles.base.Vehicle;
import enumPack.VehicleType;

import java.util.UUID;

public final class CarBuilder{
    private CarBuilder() {}
    public static Vehicle build() {
        Vehicle car = new VehicleImpl(UUID.randomUUID().toString(), VehicleType.CAR);
        return car;
    }
}
