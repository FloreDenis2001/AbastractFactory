package com.company;

public class ToyotaCorollaSedan extends ToyotaCorolla{
    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 1.8F;
    }

    @Override
    public Integer getTrunkSize() {
        return 480;
    }
}
