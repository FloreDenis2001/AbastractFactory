package com.company;

public class ToyotaCorollaCombi extends ToyotaCorolla{
    @Override
    public String getType(){
        return "Combi";
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 2.0F;
    }

    @Override
    public Integer getTrunkSize() {
        return 540;
    }
}
