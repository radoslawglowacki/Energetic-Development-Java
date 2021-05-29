package energyPlants;

import enums.Units;
import resourcesStorage.ResourcesStorageService;

public class SolarPlant extends Plant {

    public SolarPlant() {
        this.setProduction(2);
        this.setConsumption(0);
    }

    @Override
    public void createDailyProduction(ResourcesStorageService service) {
        service.addMultipleUnit(getProduction(), Units.ENERGY_UNIT);
    }
}
