package apiMethods.utils;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class PropertiesParser {

    private static final Logger LOGGER = Logger.getLogger(PropertiesParser.class);

    public String getPropertyByName(String key, String file) {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(getFileFromResources(file)));
            return properties.getProperty(key);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            return null;
        }
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        try {
            if (resource == null)
                throw new IllegalArgumentException("File not found:" + fileName);
        } catch (IllegalArgumentException e) {
            LOGGER.error(e.getMessage());
        }
        return new File(resource.getFile());
    }

}

