package factories;

import mines.*;

import java.util.ArrayList;
import java.util.List;

public class MinesFactory {

    public static List<Mine> coalMineCreator(int count){
        List<Mine> mines = new ArrayList<>();
        for(int i = 0; i < count; i++){ mines.add(new CoalMine()); }
        return mines;
    }

    public static List<Mine> hadronColliderCreator(int count){
        List<Mine> mines = new ArrayList<>();
        for(int j = 0; j < count; j++){ mines.add(new HadronCollider()); }
        return mines;
    }

    public static List<Mine> moonMineCreator(int count){
        List<Mine> mines = new ArrayList<>();
        for(int k = 0; k < count; k++){ mines.add(new MoonMine()); }
        return mines;
    }

    public static List<Mine> uraniumMineCreator(int count){
        List<Mine> mines = new ArrayList<>();
        for(int l = 0; l < count; l++){ mines.add(new UraniumMine()); }
        return mines;
    }
}
