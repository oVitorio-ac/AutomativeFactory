/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automativefactory;

/**
 *
 * @author 0041432213010
 */
public class Car {
    
    private String engineType;
    private String model;
    private String Color;
    private int quantyDoor;
    private int quantywheels;

    public Car( String model, String engineType, String Color, int quantyDoor, int quantywheels) {
        this.engineType = engineType;
        this.model = model;
        this.Color = Color;
        this.quantyDoor = quantyDoor;
        this.quantywheels = quantywheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getQuantyDoor() {
        return quantyDoor;
    }

    public void setQuantyDoor(int quantyDoor) {
        this.quantyDoor = quantyDoor;
    }

    public int getQuantywheels() {
        return quantywheels;
    }

    public void setQuantywheels(int quantywheels) {
        this.quantywheels = quantywheels;
    }

    @Override
    public String toString() {
        return "car ={\n 'Modelo':'" + model + "', \n 'motor':'"+ engineType +"', \n 'Cor':'" + Color + "', \n 'Quantidade de portas':'" + quantyDoor + "', \n 'Quantidade de rodas':'" + quantywheels +"' \n}";
    }
    
}
