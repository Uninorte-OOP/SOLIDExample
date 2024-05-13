/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle.handlers;

import core.vehicle.drivingmodes.DrivingMode;
import core.vehicle.Vehicle;

/**
 *
 * @author edangulo
 */
public class EventHandler {
    
    private Vehicle vehicle;

    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void changeDrivingMode(DrivingMode drivingMode) {
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
    }
    
}
