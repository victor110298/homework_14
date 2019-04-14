package abstractfactory;

public class AbstractFactory {

    public static SquadronFactory getFactory(TypeOfClan clan) {
        SquadronFactory factory = null;
        if (clan == TypeOfClan.ELF) {
            factory = new ElfFactory();
        } else if (clan == TypeOfClan.ORG) {
            factory = new OrgFactory();
        }
        return factory;
    }
}
