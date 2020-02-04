package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File file = new File("");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
    }

    public String getArrowUrl(){
        return properties.getProperty("baseurl");
    }
}
