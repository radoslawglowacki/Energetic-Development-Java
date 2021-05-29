package enums;

public enum Units {
    ENERGY_UNIT("energy unit"),
    COAL_UNIT("coal unit"),
    URANIUM_UNIT("uranium_unit"),
    HELIUM_UNIT("helium unit"),
    ANTIMATTER_UNIT("antimatter unit");

    private String unit;

    Units(String unit) {
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }
}
