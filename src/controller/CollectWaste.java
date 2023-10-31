package controller;

import common.Algorithms;
import common.Library;
import view.View;

public class CollectWaste extends View<String> {

    protected Library library;
    protected Algorithms algorithm;

    public CollectWaste() {
        super("=====Collecting Household Waste=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute() {
        String input = library.getString("Input weight gabage(kg) each station: ");
        int result[] = algorithm.computeTotalGarbage(input);
        double[] timeNTimes = algorithm.computeTimesGoToDump(result);
        System.out.println("Cost: " + algorithm.computeCostSpend(timeNTimes));
    }
}
