package abstractfactory;

public class OrgMage implements Mage {
    String move ="Cast by snow";

    @Override
    public String cast() {
        return move;
    }
}
