package units;

import enums.Units;

public class EnergyUnit extends Unit {

    public EnergyUnit() {
        this.setUnit(Units.ENERGY_UNIT.getUnit());
        this.setDescription("1 MWh");
    }
}
