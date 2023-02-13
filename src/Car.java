
class Car extends Vehicle{
	private int numEntertainmentSystems;

    public Car(String brand, String name, String licenseNumber, int topSpeed, int gasCapacity, int numWheels, String vehicleType, int numEntertainmentSystems) {
        super(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType);
        this.numEntertainmentSystems = numEntertainmentSystems;
    }

    public int getNumEntertainmentSystems() {
        return numEntertainmentSystems;
    }

    @Override
    void display() {
        System.out.println("Brand:                           " + getBrand());
        System.out.println("Name:                            " + getName());
        System.out.println("License Number:                  " + getLicenseNumber());
        System.out.println("Top Speed:                       " + getTopSpeed());
        System.out.println("Gas Capacity:                    " + getGasCapacity());
        System.out.println("Number of Wheels:                " + getNumWheels());
        System.out.println("Vehicle Type:                    " + getVehicleType());
        System.out.println("Number of Entertainment Systems: " + getNumEntertainmentSystems());
    }
}
