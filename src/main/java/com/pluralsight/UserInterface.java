package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership; // Class level

    public void display(){
        init();
        boolean running = true;
        Scanner scan = new Scanner(System.in);

        while(running){
            System.out.println("Welcome to Dealership Console");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
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

    public void processGetByPriceRequest(){}

    public void processGetByMakeModelRequest(){}

    public void processGetByYearRequest(){}

    public void processGetByColorRequest(){}

    public void processGetByMileageRequest(){}

    public void processGetByVehicleTypeRequest(){}

    public void processGetAllVehicleRequest(){
        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    public void processAddVehicleRequest(){}

    public void processRemoveVehicleRequest(){}
}
