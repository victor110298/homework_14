package abstractfactory;

public class ElfArcher implements Archer {
    String move = "Shoot by fire";

    @Override
    public String shoot() {
        return move;
    }
}
