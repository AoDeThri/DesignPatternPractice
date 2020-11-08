package design.PrivateClassData;

public class StewData {
    private int numPotatoes;
    private int numCarrots;
    private int numMeat;
    private int numPeppers;

    public StewData(int numCarrots, int numMeat, int numPeppers, int numPotatoes){
        this.numCarrots = numCarrots;
        this.numMeat = numMeat;
        this.numPeppers = numPeppers;
        this.numPotatoes = numPotatoes;
    }

    public int getNumPotatoes(){
        return numPotatoes;
    }

    public int getNumCarrots(){
        return numCarrots;
    }

    public int getNumMeat(){
        return numMeat;
    }

    public int getNumPeppers(){
        return numPeppers;
    }
}
