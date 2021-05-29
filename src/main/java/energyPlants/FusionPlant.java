package energyPlants;

import enums.Units;

public class FusionPlant extends Plant {
    public FusionPlant() {
        this.setProduction(20000);
        this.setConsumption(1);
        this.setConsumptionUnit(Units.HELIUM_UNIT);
    }


}
