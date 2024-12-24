package creationPattern.factory;

public class TestFactory {
    public static void main(String[] args) {
        AvantageFactory avantageFactory = new AvantageFactory();
        Avantage avantage1 = avantageFactory.getTypeAvantage("Avantage");
        avantage1.typOfAvantage();
    }
}
