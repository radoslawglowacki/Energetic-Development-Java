package energyPlants;

import enums.Units;

public class NuclearPlant extends Plant {

    public NuclearPlant() {
        this.setProduction(10000);
        this.setConsumption(1);
        this.setConsumptionUnit(Units.URANIUM_UNIT);
    }


}
