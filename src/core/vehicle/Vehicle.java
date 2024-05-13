/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.vehicle;

import core.vehicle.components.Gear;
import core.vehicle.switches.EngineSwitch;

/**
 *
 * @author edangulo
 */
public abstract class Vehicle implements EngineSwitch {
    
    private final int maxFuel;
    private int remainingFuel;
    private int power;
    private int suspensionHeight;
    private boolean isMoving;
    private Gear gear;
    private boolean engineRunning;
    
    public Vehicle(int maxFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }
    
    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
    
    public void move() {
        this.isMoving = true;
    }
    
    public void stop() {
        this.isMoving = false;
    }

    public void changeGear(Gear gear) {
        this.gear = gear;
    }
    
    @Override
    public void startEngine() {
        this.engineRunning = true;
    }
    
    @Override
    public void shutDownEngine() {
        this.engineRunning = false;
    }
    
    public abstract void accelerate();
    
}
