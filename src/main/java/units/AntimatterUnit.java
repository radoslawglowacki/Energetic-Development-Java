package units;

import enums.Units;

public class AntimatterUnit extends Unit {

    public AntimatterUnit() {
        this.setUnit(Units.ANTIMATTER_UNIT.getUnit());
        this.setDescription("1g of antimatter");
    }
}
