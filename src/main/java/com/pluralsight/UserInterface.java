package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static Scanner scan = new Scanner(System.in);

    private Dealership dealership; // Class level

    public void display(){
        init();
        boolean running = true;


        while(running){
            System.out.println("Welcome to Dealership Console");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make or model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");

            System.out.print("Enter numerical value: ");
            int menuChoice = scan.nextInt();
            scan.nextLine();

            switch(menuChoice){
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehicleRequest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicleRequest();
                case 99 -> running = false;
                default -> System.out.println("Invalid Input");
            }
        }

        scan.close();
        System.out.println("Good Bye");
    }

    private void init(){
        DealershipFileManager bm = new DealershipFileManager();

        this.dealership = bm.getDealership();
    }

    private void displayVehicles(List<Vehicle> vehicles){
        for (Vehicle v : vehicles){
            System.out.printf("%d |%d |%s |%s |%s |%s |%d |%.2f\n",v.getVin(),v.getYear(),v.getMake(),v.getModel(),v.getVehicleType(),v.getColor(),v.getOdometer(),v.getPrice());
        }
    }

    public void processGetByPriceRequest(){
        System.out.print("Enter min price: ");
        double min = scan.nextDouble();
        System.out.print("Enter max price: ");
        double max = scan.nextDouble();
        scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByPrice(min,max);
            displayVehicles(vehicles);
    }

    public void processGetByMakeModelRequest(){
        System.out.print("Enter make or model: ");
        String makeModel = scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByMake(makeModel);
            displayVehicles(vehicles);
    }

    public void processGetByYearRequest(){
        System.out.print("Enter Year: ");
        int year = scan.nextInt();
        scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByYear(year);
            displayVehicles(vehicles);
    }

    public void processGetByColorRequest(){
        System.out.print("Enter Color: ");
        String color = scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByColor(color);
            displayVehicles(vehicles);
    }

    public void processGetByMileageRequest(){
        System.out.print("Enter Mileage: ");
        int mileage = scan.nextInt();
        scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByMileage(mileage);
            displayVehicles(vehicles);
    }

    public void processGetByVehicleTypeRequest(){
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scan.nextLine();

        List<Vehicle> vehicles = dealership.getVehiclesByType(vehicleType);
            displayVehicles(vehicles);
    }

    public void processGetAllVehicleRequest(){
        List<Vehicle> vehicles = dealership.getAllVehicles();
            displayVehicles(vehicles);
    }

    public void processAddVehicleRequest(){
        System.out.print("Enter Vin: ");
        int vin = scan.nextInt();

        System.out.print("Enter Year: ");
        int year = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Make: ");
        String make = scan.nextLine();

        System.out.print("Enter Model: ");
        String model = scan.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scan.nextLine();

        System.out.print("Enter Color: ");
        String color = scan.nextLine();

        System.out.print("Enter Odometer: ");
        int odo = scan.nextInt();

        System.out.print("Enter Price: ");
        double price = scan.nextDouble();
        scan.nextLine();

        Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odo,price);
        dealership.addVehicle(vehicle);
        System.out.println("Vehicle added successfully!");

    }

    public void processRemoveVehicleRequest(){
        System.out.print("Enter vin: ");
        int vin = scan.nextInt();
        scan.nextLine();

        dealership.removeVehicle(vin);
        System.out.println("Vehicle removed successfully");

    }
}
