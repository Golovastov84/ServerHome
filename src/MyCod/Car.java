package MyCod;

import java.util.Date;

public class Car {
    public String model;
    public String color;
    Date dateManufacture;
    public Car (String theColor, Date dateManufacture) {
        this.color = theColor;
        System.out.println(color + " dateManufacture = " + dateManufacture);
    }
    public void setColor(String newColor) {
        this.color = newColor;
        System.out.println("color = " + color);
    }
}

