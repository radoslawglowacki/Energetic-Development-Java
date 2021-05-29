package factories;

import energyPlants.*;

import java.util.ArrayList;
import java.util.List;

public class PlantsFactory {

    public static List<Plant> aninihilationPlantCreator(int count){
        List<Plant> plants = new ArrayList<>();
        for(int i = 0; i < count; i++){ plants.add(new AnnihilationPlant()); }
        return plants;
    }

    public static List<Plant> coalPlantCreator(int count){
        List<Plant> plants = new ArrayList<>();
        for(int j = 0; j < count; j++){ plants.add(new CoalPlant()); }
        return plants;
    }

    public static List<Plant> fusionPlantCreator(int count){
        List<Plant> plants = new ArrayList<>();
        for(int k = 0; k< count; k++){ plants.add(new FusionPlant()); }
        return plants;
    }

    public static List<Plant> nuclearPlantCreator(int count){
        List<Plant> plants = new ArrayList<>();
        for(int l = 0; l < count; l++){ plants.add(new NuclearPlant()); }
        return plants;
    }

    public static List<Plant> solarPlantCreator(int count){
        List<Plant> plants = new ArrayList<>();
        for(int m = 0; m < count; m++){ plants.add(new SolarPlant()); }
        return plants;
    }
}
