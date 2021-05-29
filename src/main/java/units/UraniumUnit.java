package units;

import enums.Units;

public class UraniumUnit extends Unit {

    public UraniumUnit() {
        this.setUnit(Units.URANIUM_UNIT.getUnit());
        this.setDescription("100kg of enriched uranium");
    }
}
