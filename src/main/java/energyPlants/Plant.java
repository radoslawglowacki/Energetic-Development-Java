package energyPlants;

import enums.Units;
import interfaces.ProductionInterface;
import resourcesStorage.ResourcesStorageService;

public abstract class Plant implements ProductionInterface {

    private int production;
    private int consumption;
    private Units consumptionUnit;


    public void createDailyProduction(ResourcesStorageService service) {
        try {
            service.removeUnits(getConsumption(), getConsumptionUnit());
            service.addMultipleUnit(getProduction(), Units.ENERGY_UNIT);
        } catch (RuntimeException e) {
//            System.out.println("You do not have enough " + consumptionUnit.getUnit() + " to produce energy in : "
//            + this.getClass().getSimpleName());
        }
    }

    protected int getProduction() {
        return production;
    }

    protected void setProduction(int production) {
        this.production = production;
    }

    protected int getConsumption() {
        return consumption;
    }

    protected void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    protected Units getConsumptionUnit() {
        return consumptionUnit;
    }

    protected void setConsumptionUnit(Units consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }
}
