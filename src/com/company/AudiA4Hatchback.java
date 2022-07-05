package com.company;

public class AudiA4Hatchback extends AudiA4{
    @Override
    public String getType() {
        return "HATCHBACK";
    }

    @Override
    public Integer getCylindersNum() {
        return 4;
    }

    @Override
    public Float getEngineVolume() {
        return 1.9F;
    }

    @Override
    public Integer getTrunkSize() {
        return 340;
    }
}
