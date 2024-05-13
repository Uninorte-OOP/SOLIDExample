/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.vehicle.Vehicle;

/**
 *
 * @author edangulo
 */
public class Driver {
    
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void increaseSpeed() {
        this.vehicle.accelerate();
    }
    
}
