package utilities;

public class Properities {
    private static final ConfigReader propertiesReader = new ConfigReader();
    public static final String baseUrl = propertiesReader.getArrowUrl();
}
