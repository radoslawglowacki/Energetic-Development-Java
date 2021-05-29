package units;

import enums.Units;

public class HeliumUnit extends Unit{

    public HeliumUnit() {
        this.setUnit(Units.HELIUM_UNIT.getUnit());
        this.setDescription("100kg of helium-3");
    }
}
