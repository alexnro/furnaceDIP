package org.lasencinas.resources;

public class RoomTemperature {

    private double temperature = 0;
    private static RoomTemperature INSTANCE = null;

    public RoomTemperature(){

    }

    public static RoomTemperature getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RoomTemperature();
        }
        return INSTANCE;
    }

    public RoomTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
