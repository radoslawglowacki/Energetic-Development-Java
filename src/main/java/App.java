import energyConsumers.Consumer;
import energyConsumers.World;

public class App {

    public static void main(String[] args) {
        EnergeticDevelopment energeticDevelopment = new EnergeticDevelopment();
        int countOfDays = 200;
        Consumer consumer = new World();

        energeticDevelopment.preparingMines(1,1,1,1);
        energeticDevelopment.preparePlants(1,1,1,1,1);

        energeticDevelopment.run(countOfDays, consumer);
    }

}
