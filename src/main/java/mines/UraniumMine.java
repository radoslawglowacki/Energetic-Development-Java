package mines;

import enums.Units;

public class UraniumMine extends Mine {

    public UraniumMine() {
        this.setUnit(Units.URANIUM_UNIT);
        this.setDailyProductivity(1);
    }

}
