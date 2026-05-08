package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));

            String dealerInfo = br.readLine();
                String[] dealerData = dealerInfo.split(Pattern.quote("|"));
                String name = dealerData[0];
                String address = dealerData[1];
                String phone = dealerData[2];

                dealership =  new Dealership(name,address,phone);

            String fileData;
            while((fileData = br.readLine()) !=null){
                String[] vehicleData = fileData.split(Pattern.quote("|"));
                int vin = Integer.parseInt(vehicleData[0]);
                int year = Integer.parseInt(vehicleData[1]);
                String make = vehicleData[2];
                String model = vehicleData[3];
                String vehicleType = vehicleData[4];
                String color = vehicleData[5];
                int odometer = Integer.parseInt(vehicleData[6]);
                double price = Double.parseDouble(vehicleData[7]);

                dealership.addVehicle(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dealership;
    }
    public void saveDealership(Dealership dealership){

    }


}
