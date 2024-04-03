package pk.edu.cuiatd.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;

public class Configuration {
    private static volatile Configuration instance;
    private HashMap<String, String> config = new HashMap<String, String>();
    private final String configFile = "config.properties"; // Path to configuration file

    private Configuration() {
        loadConfigFromFile();
    }

    private void loadConfigFromFile() {
        try {
            File file = new File(configFile);
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
            fileInput.close();

            Enumeration<Object> enuKeys = properties.keys();

            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                config.put(key, value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        return config.get(key);
    }

    public void reload() {
        config.clear(); // Clear existing configuration
        loadConfigFromFile(); // Reload configuration from file
    }

    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    instance = new Configuration();
                }
            }
        }
        return instance;
    }
}
