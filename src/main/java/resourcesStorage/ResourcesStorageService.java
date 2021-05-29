package resourcesStorage;

import enums.Units;
import interfaces.ResourcesStorageDao;
import units.Unit;

import java.util.HashMap;
import java.util.Map;

public class ResourcesStorageService {

    private final ResourcesStorageDao resourcesStorageDao;

    public ResourcesStorageService(ResourcesStorageDao resourcesStorageDao) {
        this.resourcesStorageDao = resourcesStorageDao;
    }

    public void addSingleUnit(Units unit) {
        resourcesStorageDao.singleAdd(unit);
    }

    public void addMultipleUnit(int quantity, Units unit) {
        resourcesStorageDao.multipleAdd(quantity, unit);
    }

    public HashMap<Unit, Integer> getAllUnits() {
        return resourcesStorageDao.getAllUnits();
    }

    public void removeUnits(int quantity, Units unit) {
        resourcesStorageDao.removeQuantityOfUnit(quantity, unit);
    }
    public Map.Entry<Unit, Integer> findUnit(Units unit){
        return resourcesStorageDao.findUnit(unit);
    }
}
