package Vehicles.impl;

import Vehicles.base.Vehicle;
import enumPack.VehicleType;

public class VehicleImpl implements Vehicle {
    private String licensePlate;
    private VehicleType type;

    public VehicleImpl(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }
}
