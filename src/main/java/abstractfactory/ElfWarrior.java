package abstractfactory;

public class ElfWarrior implements Warrior {
    String move = "Hand Attack";

    @Override
    public String attack() {
        return move;
    }
}
