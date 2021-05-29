package resourcesStorage;

import factories.EnergyUnitFactory;
import enums.Units;
import interfaces.ResourcesStorageDao;
import units.Unit;

import java.util.HashMap;
import java.util.Map;

public class ResourcesStorage implements ResourcesStorageDao {

    private static ResourcesStorage instance;
    private HashMap<Unit, Integer> units;
    private EnergyUnitFactory energyUnitFactory;

    private ResourcesStorage() {
        this.units = new HashMap<>();
        this.energyUnitFactory = new EnergyUnitFactory();
    }

    public static ResourcesStorage getInstance() {
        if (instance == null) {
            instance = new ResourcesStorage();
        }
        return instance;
    }

    public Map.Entry<Unit, Integer> findUnit(Units energyUnit) {
        Unit unit = energyUnitFactory.getUnit(energyUnit);
        for (Map.Entry<Unit, Integer> unitEntry : units.entrySet()) {
            if (unitEntry.getKey().getUnit().equals(unit.getUnit())) {
                return unitEntry;
            }
        }
        return null;
    }


    public void singleAdd(Units energyUnit) {
        Unit unit = energyUnitFactory.getUnit(energyUnit);
        if (units.size() > 0) {
            for (Map.Entry<Unit, Integer> unitEntry : units.entrySet()) {
                if (unitEntry.getKey().getUnit().equals(unit.getUnit())) {
                    Integer value = unitEntry.getValue();
                    Unit key = unitEntry.getKey();
                    units.put(key, value + 1);
                    return;
                }
            }
        }
        units.put(unit, 1);
    }

    public void multipleAdd(int quantity, Units energyUnit) {
        Unit unit = energyUnitFactory.getUnit(energyUnit);
        if (units.size() > 0) {
            for (Map.Entry<Unit, Integer> unitEntry : units.entrySet()) {
                if (unitEntry.getKey().getUnit().equals(unit.getUnit())) {
                    Integer value = unitEntry.getValue();
                    Unit key = unitEntry.getKey();
                    units.put(key, value + quantity);
                    return;
                }
            }
        }
        units.put(unit, quantity);
    }

    public void removeQuantityOfUnit(int quantity, Units energyUnit) {
        Unit unit = energyUnitFactory.getUnit(energyUnit);
        for (Map.Entry<Unit, Integer> unitEntry : units.entrySet()) {
            if (unitEntry.getKey().getUnit().equals(unit.getUnit())) {
                if (unitEntry.getValue() >= quantity) {
                    units.put(unitEntry.getKey(), unitEntry.getValue() - quantity);
                    return;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    public HashMap<Unit, Integer> getAllUnits() {
        return units;
    }
}