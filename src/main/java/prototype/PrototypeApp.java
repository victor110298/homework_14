package prototype;

public class PrototypeApp {
    private static final String DETAIL_SIZE = "14*10";
    private static final String COLOR_OF_DATAIL = "black";

    public static void main(String[] args) {
        Detail detail = new Detail(DETAIL_SIZE, COLOR_OF_DATAIL);
        System.out.println(detail);

        LegoFactory legoFactory = new LegoFactory(detail);
        LegoFactory firstDatail = legoFactory.makeCopy();
        LegoFactory secondDatail = legoFactory.makeCopy();
        System.out.println(firstDatail);
        System.out.println(secondDatail);
    }
}
