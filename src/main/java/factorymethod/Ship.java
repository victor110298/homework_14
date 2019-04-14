package factorymethod;

import lombok.ToString;

@ToString
public class Ship implements Vehicle {
    private String typeOfVehicle;

    public Ship(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        load(typeOfVehicle);
    }

    private void load(String typeOfVehicle) {
        System.out.println("Ship is " + typeOfVehicle);
    }

    @Override
    public String getVehicle() {
        return "Ship is the most cheap transport";
    }
}
