package energyPlants;

import enums.Units;

public class AnnihilationPlant extends Plant {

    public AnnihilationPlant() {
        this.setProduction(25000);
        this.setConsumption(1);
        this.setConsumptionUnit(Units.ANTIMATTER_UNIT);
    }

}
