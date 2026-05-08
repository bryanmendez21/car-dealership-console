package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    // Declare
    private ArrayList<Vehicle> inventory;
    // Attributes
    private String name, address,phone;

    // Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        inventory = new ArrayList<>();
    }

    // Name Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Address Getter and Setter
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Phone Getter and Setter
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    // Search By Methods
    public List<Vehicle> getVehiclesByPrice(){
        return null;
    }
    public List<Vehicle> getVehiclesByMake(){
        return null;
    }
    public List<Vehicle> getVehiclesByYear(){
        return null;
    }
    public List<Vehicle> getVehiclesByColor(){
        return null;
    }
    public List<Vehicle> getVehiclesByMileage(){
        return null;
    }
    public List<Vehicle> getVehiclesByType(){
        return null;
    }

    // All Method
    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    // Add & Remove Methods
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(){

    }

}
