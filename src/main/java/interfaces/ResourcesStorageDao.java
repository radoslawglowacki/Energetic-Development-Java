package interfaces;

import enums.Units;
import units.Unit;

import java.util.HashMap;
import java.util.Map;

public interface ResourcesStorageDao {
    void singleAdd(Units energyUnit);
    void multipleAdd(int quantity, Units energyUnit);
    void removeQuantityOfUnit(int quantity, Units energyUnit);
    HashMap<Unit, Integer> getAllUnits();
    Map.Entry<Unit, Integer> findUnit(Units energyUnit);
}
