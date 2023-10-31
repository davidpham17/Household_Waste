package model;

public class Truck {
    private int totalWaste;
    private int numStation;
    public static final double TIME_LOAD_GARBAGE = (double)8/60;
    public static final double TIME_GO_DUMP = 0.5;
    public static final double CAPACITY = 10000;

    public Truck() {
    }

    public Truck(int totalWaste, int numStation) {
        this.totalWaste = totalWaste;
        this.numStation = numStation;
    }

    public int getTotalWaste() {
        return totalWaste;
    }

    public void setTotalWaste(int totalWaste) {
        this.totalWaste = totalWaste;
    }

    public int getNumStation() {
        return numStation;
    }

    public void setNumStation(int numStation) {
        this.numStation = numStation;
    }
    
    
    
}
