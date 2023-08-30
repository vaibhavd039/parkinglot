package executor;

import Vehicles.base.Vehicle;
import parking.ParkingLevel;
import parking.ParkingSpot;
import parking.utility.ParkingLevelBuilder;
import utility.Ticket;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingLevel> levels;
    private EntrancePanel entrancePanel;
    private ExitPanel exitPanel;

    public ParkingLot(int numLevels, int numCarSpotsPerLevel, int numMotorcycleSpotsPerLevel,
                      int numTruckSpotsPerLevel) {
        levels = new ArrayList<>();

        for (int i = 0; i < numLevels; i++) {
            ParkingLevel level = ParkingLevelBuilder.buildParkingLevel(numCarSpotsPerLevel,
                    numMotorcycleSpotsPerLevel, numTruckSpotsPerLevel);
            levels.add(level);
        }

        entrancePanel = new EntrancePanel();
        exitPanel = new ExitPanel();
    }

    public Ticket vehicleEnters(Vehicle vehicle) {
        // Logic for vehicle entry
        ParkingLevel level = levels.get(0); // Selecting the first level for simplicity
        ParkingSpot spot = level.getSlot(vehicle.getType());
        if (spot == null) {
            return null; // No available spot for this vehicle type
        }
        Ticket ticket = entrancePanel.generateTicket(vehicle, spot);
        return ticket;
    }

    public void vehicleExits(Ticket ticket) {
        // Logic for vehicle exit
        exitPanel.processPayment(ticket, calculateParkingFee(ticket));
        ticket.getParkingSpot().vacate();
    }

    private double calculateParkingFee(Ticket ticket) {
        // Logic to calculate parking fee based on entry time, vehicle type, etc.
        return 0.0;
    }
}
