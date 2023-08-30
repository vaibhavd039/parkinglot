package parking.utility;

import parking.ParkingLevel;

import java.util.List;

public final class ParkingLevelBuilder {
    private  ParkingLevelBuilder(){}

    public static ParkingLevel buildParkingLevel( int numCarSpotsPerLevel, int numMotorcycleSpotsPerLevel, int numTruckSpotsPerLevel){
      return   new ParkingLevel(numCarSpotsPerLevel, numMotorcycleSpotsPerLevel, numTruckSpotsPerLevel);
    }
}
