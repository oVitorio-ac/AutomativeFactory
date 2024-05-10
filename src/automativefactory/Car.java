/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automativefactory;

/**
 *
 * @author 0041432213010
 */
public class Car extends GroundVehicles {
    
    private int quantyDoor;
    private String windshieldWiper;

    public Car(int quantyDoor, String windshieldWiper, String engineType, String colorVehicle, String model, int quantywheels) {
        super(engineType, colorVehicle, model, quantywheels);
        this.quantyDoor = quantyDoor;
        this.windshieldWiper = windshieldWiper;
    }
}
