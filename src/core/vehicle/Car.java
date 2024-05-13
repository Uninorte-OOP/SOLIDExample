/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.RadioSwitch;

/**
 *
 * @author edangulo
 */
public class Car extends Vehicle implements RadioSwitch {
    
    private boolean radioOn;
    
    public Car(int maxFuel) {
        super(maxFuel);
    }

    public boolean isRadioOn() {
        return radioOn;
    }
    
    private boolean isMovingForwards(Gear gear, Gear actualGear) {
        return this.isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
    
    private boolean isMovingBackwards(Gear gear, Gear actualGear) {
        return this.isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }
    
    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = this.getGear();
        if (isMovingForwards(gear, actualGear) || isMovingBackwards(gear, actualGear)) {
            this.stop();
        }
        super.changeGear(gear);
    }

    @Override
    public void turnRadioOn() {
        this.radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        this.radioOn = false;
    }

    @Override
    public void accelerate() {
        this.setRemainingFuel(this.getRemainingFuel() - 1);
    }
    
}
