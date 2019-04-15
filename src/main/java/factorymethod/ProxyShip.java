package factorymethod;

public class ProxyShip implements Vehicle {
    private String typeOfVehicle;
    private Ship ship;

    public ProxyShip(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public String getVehicle() {
        if (ship == null) {
            ship = new Ship (typeOfVehicle);
        }
        return ship.getVehicle();
    }
}
