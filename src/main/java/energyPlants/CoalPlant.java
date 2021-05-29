package energyPlants;

import enums.Units;

public class CoalPlant extends Plant {

    public CoalPlant() {
        this.setProduction(7);
        this.setConsumption(100);
        this.setConsumptionUnit(Units.COAL_UNIT);
    }

}
