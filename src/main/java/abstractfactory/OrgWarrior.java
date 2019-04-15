package abstractfactory;

public class OrgWarrior implements Warrior {
    String move = "Foot Attack";

    @Override
    public String attack() {
        return move;
    }
}
