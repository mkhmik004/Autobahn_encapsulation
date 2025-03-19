package za.co.wethinkcode;

import java.awt.*;
import java.time.Year;

public class Car {
    private String manufacturer;
    private String model;
    private Year year;
    private Color color;

    public Car(String manufacturer, String model, Year year, Color color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public String getModel() {
        return this.model;
    }
    public Year getYear() {
        return this.year;
    }
    public Color getColor() {
        return this.color;
    }
    public void setColor(Color aNewColor) {
        this.color = aNewColor;
    }
}

