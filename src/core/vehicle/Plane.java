/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

/**
 *
 * @author edangulo
 */
public class Plane extends Vehicle {
    
    // A plane can reverse engine gear while moving forward, no problem here
    
    public Plane(int maxFuel) {
        super(maxFuel);
    }
    
    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
}
