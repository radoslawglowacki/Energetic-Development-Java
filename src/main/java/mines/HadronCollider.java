package mines;

import enums.Units;
import resourcesStorage.ResourcesStorageService;

public class HadronCollider extends Mine {
    private int dayOfWeek;

    public HadronCollider() {
        this.dayOfWeek = 1;
        this.setDailyProductivity(1 / 7);
        this.setUnit(Units.ANTIMATTER_UNIT);
    }


    @Override
    public void createDailyProduction(ResourcesStorageService service) {
        if (dayOfWeek == 7) {
            dayOfWeek = 1;
            service.addSingleUnit(getUnit());
        } else {
            dayOfWeek += 1;
        }

    }
}
