package abstractfactory;

public class ElfMage implements Mage {
    String move ="Cast by fire";

    @Override
    public String cast() {
        return move;
    }
}
