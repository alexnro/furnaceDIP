package org.lasencinas.interfaces;

import org.lasencinas.resources.RoomTemperature;

public interface Heater {

    public void engage(RoomTemperature temperature);
    public void disengage(RoomTemperature temperature);
}
