package com.company;

public class FactoryProvider {
    public CarFactory createFactory(String type) throws Exception {
        switch (type) {
            case "AudiA4":
                return new AudiA4Factory();
            case "ToyotaCorolla":
                return new ToyotaCorollaFactory();
        }
        throw new Exception("Nu exista aceasta fabrica");
    }
}
