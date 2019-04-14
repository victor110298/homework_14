package abstractfactory;

public class OrgArcher implements Archer {
    String move = "Shoot by snow";

    @Override
    public String shoot() {
        return move;
    }
}
