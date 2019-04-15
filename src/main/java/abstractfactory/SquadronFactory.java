package abstractfactory;

public interface SquadronFactory {
    Mage createMage();

    Archer createArcher();

    Warrior createWarrior();
}
