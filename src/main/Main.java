/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.person.Driver;
import core.vehicle.Car;
import core.vehicle.Drone;
import core.vehicle.Plane;
import core.vehicle.RacingCar;
import core.vehicle.Vehicle;
import core.vehicle.components.Gear;
import core.vehicle.drivingmodes.Comfort;
import core.vehicle.drivingmodes.Economy;
import core.vehicle.drivingmodes.Sport;
import core.vehicle.handlers.EventHandler;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Car car = new Car(200);
        RacingCar racingCar = new RacingCar(600);
        Plane plane = new Plane(1200);
        Drone drone = new Drone(50);
        
        EventHandler handler1 = new EventHandler(car);
        EventHandler handler2 = new EventHandler(racingCar);
        EventHandler handler3 = new EventHandler(plane);
        EventHandler handler4 = new EventHandler(drone);
        
        handler1.changeDrivingMode(new Comfort());
        handler2.changeDrivingMode(new Sport());
        handler3.changeDrivingMode(new Comfort());
        handler4.changeDrivingMode(new Economy());
        
        Driver driver1 = new Driver(car);
        Driver driver2 = new Driver(racingCar);
        Driver driver3 = new Driver(plane);
        Driver driver4 = new Driver(drone);
        
        car.startEngine();
        racingCar.startEngine();
        plane.startEngine();
        drone.startEngine();
        
        car.changeGear(Gear.D);
        racingCar.changeGear(Gear.D);
        plane.changeGear(Gear.D);
        drone.changeGear(Gear.D);
        
        car.move();
        racingCar.move();
        plane.move();
        drone.move();
        
        for (int i = 0; i < 30; i++) {
            driver1.increaseSpeed();
        }
        
        for (int i = 0; i < 50; i++) {
            driver2.increaseSpeed();
        }
        
        for (int i = 0; i < 40; i++) {
            driver3.increaseSpeed();
        }
        
        for (int i = 0; i < 10; i++) {
            driver4.increaseSpeed();
        }
        
        Vehicle[] vehicles = {car, racingCar, plane, drone};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + " Remaining Fuel = " + vehicle.getRemainingFuel());
            System.out.println(vehicle.getClass().getSimpleName() + " Power = " + vehicle.getPower() + "\n");
        }
    }
    
}
