package units;

public abstract class Unit {
    private String description;
    private String unit;


    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    protected void setUnit(String unit) {
        this.unit = unit;
    }
}
