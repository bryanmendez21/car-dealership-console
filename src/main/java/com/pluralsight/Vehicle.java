package com.pluralsight;

public class Vehicle {
    // holds information about specific vehicle

    // Attributes
    private int vin,year,odometer;
    private String make,model,vehicleType,color;
    private double price;

    // Constructor
    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    // Vin Getter and Setter
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    // Year Getter and Setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Odometer Getter and Setter
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // Make Getter and Setter
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Model Getter and Setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Type Getter and Setter
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Color Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Price Getter and Setter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
