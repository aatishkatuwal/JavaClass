public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public CargoShip(CargoShip other) {
        super(other.getShipName(), other.getYearBuilt());
        this.cargoCapacity = other.cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String display() {
        return "Cargo Ship Name: " + getShipName() + "\nCargo Capacity (tonnage): " + cargoCapacity;
    }
}
