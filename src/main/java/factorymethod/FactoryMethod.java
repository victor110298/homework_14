package factorymethod;

public class FactoryMethod {
    private static final String COMFORTABLE = "hight";
    private static final String TYPE_OF_VEHICLE = "water transport";
    private static final int COUNT_OF_WHEELS = 4;
    private static final boolean IS_TRUNK = true;

    public Vehicle getCurrentOS(TypeOfVehicle name) {
        Vehicle vehicle = null;
        switch (name) {
            case PLANE:
                vehicle = new Plane.Builder()
                        .setIsTrunk(IS_TRUNK)
                        .setCombortable(COMFORTABLE)
                        .build();
                break;
            case CAR:
                vehicle = Car.getInstance(IS_TRUNK,COUNT_OF_WHEELS );
                break;
            case SHIP:
                vehicle = new ProxyShip(TYPE_OF_VEHICLE);
                break;
        }
        return vehicle;
    }
}