import energyConsumers.Consumer;
import energyPlants.*;
import enums.Units;
import factories.MinesFactory;
import factories.PlantsFactory;
import mines.*;
import resourcesStorage.ResourcesStorage;
import resourcesStorage.ResourcesStorageService;

import java.util.ArrayList;
import java.util.List;

public class EnergeticDevelopment {

    private final ResourcesStorageService service;
    private final List<Mine> mines;
    private final List<Plant> plants;

    public EnergeticDevelopment() {
        this.service = new ResourcesStorageService(ResourcesStorage.getInstance());
        this.mines = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public void preparingMines(int coalCount, int hadronCount, int moonCount, int uraniumCount) {
        mines.addAll(MinesFactory.coalMineCreator(coalCount));
        mines.addAll(MinesFactory.hadronColliderCreator(hadronCount));
        mines.addAll(MinesFactory.moonMineCreator(moonCount));
        mines.addAll(MinesFactory.uraniumMineCreator(uraniumCount));
    }

    public void preparePlants(int annihilationCount, int coalCount, int fusionCount, int nuclearCount, int solarCount) {
        plants.addAll(PlantsFactory.aninihilationPlantCreator(annihilationCount));
        plants.addAll(PlantsFactory.coalPlantCreator(coalCount));
        plants.addAll(PlantsFactory.fusionPlantCreator(fusionCount));
        plants.addAll(PlantsFactory.nuclearPlantCreator(nuclearCount));
        plants.addAll(PlantsFactory.solarPlantCreator(solarCount));
    }

    private void minesProduction() {
        for (Mine mine : mines) {
            mine.createDailyProduction(service);
        }
    }

    private void plantsProduction() {
        for (Plant plant : plants) {
            plant.createDailyProduction(service);
        }
    }

    public void run(int days, Consumer consumer) {
        for (int i = 0; i < days; i++) {
            minesProduction();
            plantsProduction();
        }

        Integer energyValue = service.findUnit(Units.ENERGY_UNIT).getValue();

        if (energyValue > consumer.getConsumption()) {
            System.out.println("Production is enough for this consumer");
        } else {
            System.out.println("Production is not enough for this consumer");
        }
    }
}
