package prototype;

public class LegoFactory {
    Detail detail;

    public LegoFactory(Detail detail) {
        setPrototype(detail);
    }

    private void setPrototype(Detail detail) {
        this.detail = detail;
    }

    public LegoFactory makeCopy() {
        return (LegoFactory) detail.copy();
    }
}
