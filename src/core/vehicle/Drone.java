/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.switches.CameraSwitch;

/**
 *
 * @author edangulo
 */
public class Drone extends Vehicle implements CameraSwitch {
    
    private boolean cameraOn;
    
    public Drone(int maxFuel) {
        super(maxFuel);
    }

    public boolean isCameraOn() {
        return cameraOn;
    }
    
    @Override
    public void turnCameraOn() {
        this.cameraOn = true;
    }

    @Override
    public void turnCameraOff() {
        this.cameraOn = false;
    }
    
    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
}
