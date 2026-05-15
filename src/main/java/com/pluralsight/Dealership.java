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
    public List<Vehicle> getVehiclesByPrice(double min, double max){

        List<Vehicle> result = new ArrayList<>();

        for(Vehicle v : inventory){
            if (v.getPrice() >= min && v.getPrice() <= max){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getVehiclesByMake(String makeModel){

        List<Vehicle> result = new ArrayList<>();

        for(Vehicle v : inventory){
            if (v.getMake().equalsIgnoreCase(makeModel) || v.getModel().equalsIgnoreCase(makeModel)){
                result.add(v);
            }
        }
        return result;

    }
    public List<Vehicle> getVehiclesByYear(int year){

        List<Vehicle> result = new ArrayList<>();

        for(Vehicle v : inventory){
            if (v.getYear() == year){
                result.add(v);
            }
        }
        return result;

    }
    public List<Vehicle> getVehiclesByColor(String color){

        List<Vehicle> result = new ArrayList<>();

        for (Vehicle v : inventory){
            if(v.getColor().equalsIgnoreCase(color)){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getVehiclesByMileage(int mileage){

        List<Vehicle> result = new ArrayList<>();

        for (Vehicle v : inventory){
            if(v.getOdometer() == mileage){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getVehiclesByType(String vehicleType){

        List<Vehicle> result = new ArrayList<>();

        for (Vehicle v : inventory){
            if(v.getVehicleType().equalsIgnoreCase(vehicleType)){
                result.add(v);
            }
        }
        return result;
    }

    // All Method
    public List<Vehicle> getAllVehicles(){
        return inventory;
    }

    // Add & Remove Methods
    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }
    public void removeVehicle(int vin){
        for (Vehicle v : inventory) {
            if(v.getVin() == vin){
                inventory.remove(v);
                break;
            }
        }
    }

}
