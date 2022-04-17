package com.company;

public class Transmission {

       private String typeOfTransmission;
    private String carDrive; // привод автомобиля: заднеприводный, переднеприводный или полноприводный.

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getCarDrive() {
        return carDrive;
    }

    public void setCarDrive(String carDrive) {
        this.carDrive = carDrive;
    }
}
