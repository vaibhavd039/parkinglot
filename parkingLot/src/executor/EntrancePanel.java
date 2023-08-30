package executor;

import Vehicles.base.Vehicle;
import parking.ParkingSpot;
import utility.Ticket;

import java.util.UUID;

public class EntrancePanel {
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Logic to generate and print a ticket
        return new Ticket(UUID.randomUUID(), vehicle, parkingSpot);
    }
}
