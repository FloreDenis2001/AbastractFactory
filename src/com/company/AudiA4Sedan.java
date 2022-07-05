package com.company;

public class AudiA4Sedan extends AudiA4 {
    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public Integer getCylindersNum() {
        return 6;
    }

    @Override
    public Float getEngineVolume() {
        return 2.5F;
    }

    @Override
    public Integer getTrunkSize() {
        return 460;
    }
}
