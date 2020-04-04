package ru.lanit.atschool.helpers;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.yaml.snakeyaml.Yaml;

public class YMLResourceUtils {
    public YMLResourceUtils() {
    }

    public Map<String, LinkedHashMap<String, String>> readConfig(String resource) {
        InputStream input = this.getClass().getClassLoader().getResourceAsStream(resource);
        Yaml yaml = new Yaml();
        return (Map)yaml.load(input);
    }
}
