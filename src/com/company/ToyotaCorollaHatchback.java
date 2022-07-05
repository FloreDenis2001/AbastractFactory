package com.company;

public class ToyotaCorollaHatchback extends ToyotaCorolla{
    @Override
    public String getType() {
        return "HatchBack";
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
        return 420;
    }
}
