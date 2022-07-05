package com.company;

public abstract class AbstractCar implements Car {
    @Override
    public String toString() {
        String text = "Car : " + getProducer() + "\n";
        text += "Model Name : " + getModelName() + "\n";
        text += "Type : " + getType() + "\n";
        text += "Cylinders : " + getCylindersNum() + "\n";
        text += "Engine Volume : " + getEngineVolume() + "\n";
        text += "Truck Size : " + getTrunkSize() + "\n";
        return text;
    }
}
