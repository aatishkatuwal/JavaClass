import java.util.ArrayList;

public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[4];
        ships[0] = new CruiseShip("Aatish", "2000", 2000);
        ships[1] = new CargoShip("Aatisgo", "1990", 5000);
        ships[2] = new CruiseShip("Aatish-Jr", "2010", 2500);
        ships[3] = new CargoShip("Aatisgo-Jr", "2020", 7500);

        System.out.println("Using an array of shop object");
        for (Ship ship : ships) {
            System.out.println(ship.display());
        }

        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Junior", "2022", 1500));
        shipList.add(new CargoShip("Dog", "2015", 10000));

        System.out.println("\nUsing an array of shop object");
        for (Ship ship : shipList) {
            System.out.println(ship.display());
        }

        CruiseShip cruiseCopy = new CruiseShip((CruiseShip) ships[0]);
        CargoShip cargoCopy = new CargoShip((CargoShip) ships[1]);

        System.out.println(cruiseCopy.display());
        System.out.println(cargoCopy.display());
    }
}