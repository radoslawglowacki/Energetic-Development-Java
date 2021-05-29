package mines;

import enums.Units;
import interfaces.ProductionInterface;
import resourcesStorage.ResourcesStorageService;

public abstract class Mine implements ProductionInterface {

    private int dailyProductivity;
    private Units unit;


    public void createDailyProduction(ResourcesStorageService service) {
        service.addSingleUnit(getUnit());
    }

    protected int getDailyProductivity() {
        return dailyProductivity;
    }

    protected void setDailyProductivity(int dailyProductivity) {
        this.dailyProductivity = dailyProductivity;
    }

    protected Units getUnit() {
        return unit;
    }

    protected void setUnit(Units unit) {
        this.unit = unit;
    }

}
