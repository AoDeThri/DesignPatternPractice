package design.PrivateClassData;

public class ImmutableStew {
    StewData stewData;

    public ImmutableStew(int numCarrots, int numMeat, int numPeppers, int numPotatoes){
        stewData = new StewData(numCarrots, numMeat, numPeppers, numPotatoes);
    }

    public void mix(){

    }

}
