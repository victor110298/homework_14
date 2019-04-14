package abstractfactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        SquadronFactory factory1 = AbstractFactory.getFactory(TypeOfClan.ELF);
        SquadronFactory factory2 = AbstractFactory.getFactory(TypeOfClan.ORG);
        Mage mage = factory1.createMage();
        Archer archer= factory2.createArcher();
        System.out.println(mage.cast());
        System.out.println(archer.shoot());
    }
}
