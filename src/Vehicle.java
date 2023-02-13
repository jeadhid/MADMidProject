
abstract class Vehicle {
	private String brand;
    private String name;
    private String licenseNumber;
    private int topSpeed;
    private int gasCapacity;
    private int numWheels;
    private String vehicleType;
    private String specialData;

    public Vehicle(String brand, String name, String licenseNumber, int topSpeed, int gasCapacity, int numWheels, String vehicleType) {
        this.brand = brand;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.topSpeed = topSpeed;
        this.gasCapacity = gasCapacity;
        this.numWheels = numWheels;
        this.vehicleType = vehicleType;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getSpecialData() {
        return specialData;
    }

    abstract void display();
}
