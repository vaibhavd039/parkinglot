package utility;

import Vehicles.base.Vehicle;
import parking.ParkingSpot;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Date entryTime;

    public Ticket(UUID ticketNumber, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = new Date();
    }

    public UUID getTicketNumber() {
        return ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {

    }
    public Date getEntryTime() {
        return entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", vehicle number=" + vehicle.getLicensePlate() +
                ", parkingSpot number=" + parkingSpot.getSpotNumber() +
                ", entryTime=" + entryTime +
                '}';
    }
}
