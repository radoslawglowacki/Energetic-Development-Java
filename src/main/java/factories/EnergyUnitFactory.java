package factories;

import enums.Units;
import units.*;

public class EnergyUnitFactory {

    public Unit getUnit(Units energyUnitType){
        if(energyUnitType.equals(Units.ENERGY_UNIT)){
            return new EnergyUnit();
        }
        else if(energyUnitType.equals(Units.ANTIMATTER_UNIT)){
            return new AntimatterUnit();
        }
        else if(energyUnitType.equals(Units.COAL_UNIT)){
            return new CoalUnit();
        }
        else if(energyUnitType.equals(Units.HELIUM_UNIT)){
            return new HeliumUnit();
        }
        else if(energyUnitType.equals(Units.URANIUM_UNIT)){
            return new UraniumUnit();
        }else {
            return null;
        }
    }
}
