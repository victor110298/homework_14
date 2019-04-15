package factorymethod;

public class FactoryMathodApp {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        Vehicle os = factoryMethod.getCurrentOS(TypeOfVehicle.CAR);
        System.out.println(os.getVehicle());
    }
}
