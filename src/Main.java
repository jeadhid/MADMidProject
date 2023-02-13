import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
	static ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    boolean run = true;
	    while (run) {
	        System.out.println("1. Add Vehicle");
	        System.out.println("2. View Vehicle List");
	        System.out.println("3. View Vehicle Details");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                addVehicle(sc);
	                break;
	            case 2:
	                viewVehicleList();
	                break;
	            case 3:
	                viewVehicleDetails(sc);
	                break;
	            case 4:
	                run = false;
	                break;
	            default:
	                System.out.println("Invalid Choice! Please try again.");
	                break;
	        }
	    }
	}
	
	public static void viewVehicleDetails(Scanner sc) {
	    if (vehicles.size() == 0) {
	        System.out.println("No vehicles found.");
	        return;
	    }
	
	    System.out.println("List of vehicles:");
	    for (int i = 0; i < vehicles.size(); i++) {
	        System.out.println(i + 1 + ". " + vehicles.get(i).getName());
	    }
	    System.out.print("Enter the vehicle number to view details: ");
	    int vehicleNumber = sc.nextInt();
	    if (vehicleNumber < 1 || vehicleNumber > vehicles.size()) {
	        System.out.println("Invalid vehic1le number.");
	        return;
	    }
	
	    Vehicle selectedVehicle = vehicles.get(vehicleNumber - 1);
	    System.out.println("Vehicle details:");
	    selectedVehicle.display();
	}
	
	
	public static void viewVehicleList() {
	    if (vehicles.size() == 0) {
	        System.out.println("No vehicles found.");
	        return;
	    }
	
	    System.out.println("List of vehicles:");
	    System.out.println("No.\tName\t\tType");
	    for (int i = 0; i < vehicles.size(); i++) {
	        System.out.println((i + 1) + "\t" + vehicles.get(i).getName() + "\t\t" + vehicles.get(i).getVehicleType());
	    }
	}
	
	
	
	private static void addVehicle(Scanner sc) {
	    System.out.print("Enter Type of Vehicle (Car/Motorcycle): ");
	    String type = sc.next();
	    System.out.print("Enter Brand: ");
	    String brand = sc.next();
	    System.out.print("Enter Name: ");
	    String name = sc.next();
	    System.out.print("Enter License Number (Capital Letter + 1-4 digits + 1-3 Capital Letters): ");
	    String licenseNumber = sc.next();
	    while (!Pattern.matches("[A-Z]\\d{1,4}[A-Z]{1,3}", licenseNumber)) {
	        System.out.println("Invalid License Number Format! Please try again.");
	        System.out.print("Enter License Number (Capital Letter + 1-4 digits + 1-3 Capital Letters): ");
	        licenseNumber = sc.next();
	    }
	    System.out.print("Enter Top Speed: ");
	    int topSpeed = sc.nextInt();
	    System.out.print("Enter Gas Capacity: ");
	    int gasCapacity = sc.nextInt();
	    System.out.print("Enter Number of Wheels: ");
	    int numWheels = sc.nextInt();
	    System.out.print("Enter Vehicle Type: ");
	    String vehicleType = sc.next();
	        if (type.equals("Car")) {
	        	System.out.print("Enter Number of Entertainment Systems: ");
	        	int numEntertainmentSystems = sc.nextInt();
	        	vehicles.add(new Car(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType, numEntertainmentSystems));
	        } else if (type.equals("Motorcycle")) {
	        	System.out.print("Enter Number of Helmets: ");
	        	int numHelmets = sc.nextInt();
	        	vehicles.add(new Motorcycle(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType, numHelmets));
	        } else {
	        	System.out.println("Invalid Type!");
	        }
	        if (type.equalsIgnoreCase("Car")) {
	        	System.out.print("Enter Number of Entertainment Systems: ");
	        	int numEntertainmentSystems = sc.nextInt();
	        	vehicles.add(new Car(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType, numEntertainmentSystems));
	        } 
	        else if (type.equalsIgnoreCase("Motorcycle")) {
	        	System.out.print("Enter Number of Helmets: ");
	        	int numHelmets = sc.nextInt();
	        	vehicles.add(new Motorcycle(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType, numHelmets));
	        }
	}
}
