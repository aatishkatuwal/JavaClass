public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public CruiseShip(CruiseShip other) {
        super(other.getShipName(), other.getYearBuilt());
        this.maxPassengers = other.maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String display() {
        return "Cruise Ship Name: " + getShipName() + "\nMaximum Number of Passengers: " + maxPassengers;
    }
}
