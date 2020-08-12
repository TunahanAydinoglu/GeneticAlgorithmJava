import GeneticAlgorithm.GeneticAlgorithm;
import GeneticAlgorithm.Preset;

public class Main {

    public static void main(String[] args) {
     
        GeneticAlgorithm geneticAlgorithm = Preset.getDefaultGA();
        geneticAlgorithm.runGenetic();
        geneticAlgorithm.showGraphInWindow();
        geneticAlgorithm.printProperties();
        geneticAlgorithm.printResults();
    }
}
