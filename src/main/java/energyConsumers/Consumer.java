package energyConsumers;

import enums.Units;

public abstract class Consumer {

    private int consumption;
    private Units unit;

    public Consumer() {
        this.unit = Units.ENERGY_UNIT;
    }

    public int getConsumption() {
        return consumption;
    }

    protected void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    protected Units getUnit() {
        return unit;
    }

    protected void setUnit(Units unit) {
        this.unit = unit;
    }
}
