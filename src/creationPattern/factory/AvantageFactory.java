package creationPattern.factory;

public class AvantageFactory {

    public  Avantage getTypeAvantage(String parametreSelectif) {
        switch (parametreSelectif) {
            case "AvantageEnNature":
                return new AvantageEnNature();
            case "AvantageEnArgent":
                return new AvantageEnArgent();
            default:
                return new AvantageEnNature();
        }
    }
}
