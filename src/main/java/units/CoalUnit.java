package units;

import enums.Units;

public class CoalUnit extends Unit {

    public CoalUnit() {
        this.setUnit(Units.COAL_UNIT.getUnit());
        this.setDescription("1000 tons of coal");
    }
}
