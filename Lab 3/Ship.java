public abstract class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setShipName(String name) {
        this.shipName = name;
    }

    public abstract String display();

    @Override
    public String toString() {
        return display();
    }
}