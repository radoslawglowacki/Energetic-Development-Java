package mines;

import enums.Units;

public class CoalMine extends Mine {

    public CoalMine() {
        this.setDailyProductivity(1);
        this.setUnit(Units.COAL_UNIT);
    }
}
