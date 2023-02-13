
class Motorcycle extends Vehicle{
	private int numHelmets;

    public Motorcycle(String brand, String name, String licenseNumber, int topSpeed, int gasCapacity, int numWheels, String vehicleType, int numHelmets) {
        super(brand, name, licenseNumber, topSpeed, gasCapacity, numWheels, vehicleType);
        this.numHelmets = numHelmets;
    }
    
    public int getNumHelmets() {
        return numHelmets;
    }

    @Override
    void display() {
        System.out.println("Brand:             " + getBrand());
        System.out.println("Name:              " + getName());
        System.out.println("License Number:    " + getLicenseNumber());
        System.out.println("Top Speed:         " + getTopSpeed());
        System.out.println("Gas Capacity:      " + getGasCapacity());
        System.out.println("Number of Wheels:  " + getNumWheels());
        System.out.println("Vehicle Type:      " + getVehicleType());
        System.out.println("Number of Helmets: " + getNumHelmets());
    }
}
