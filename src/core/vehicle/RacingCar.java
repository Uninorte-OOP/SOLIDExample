/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

/**
 *
 * @author edangulo
 */
public class RacingCar extends Vehicle {

    public RacingCar(int maxFuel) {
        super(maxFuel);
    }

    @Override
    public void accelerate() {
        this.setPower(this.getPower() + 1);
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
}
