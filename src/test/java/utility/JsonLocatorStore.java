package utility;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonLocatorStore {
    private final JsonNode root;

    /**
     * @param resourcePath classpath path, e.g. "locatorsDefinition/HomePage.json"
     */
    public JsonLocatorStore(String resourcePath) {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(resourcePath)) {
            if (is == null) {
                throw new IllegalArgumentException("Resource not found in classpath: " + resourcePath);
            }
            ObjectMapper mapper = new ObjectMapper();
            this.root = mapper.readTree(is);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load locators from " + resourcePath, e);
        }
    }

    /**
     * Reads a locator from a nested JSON as: root[page][key] -> String
     */
    public String get(String page, String key) {
        JsonNode node = root.path(page).path(key);
        if (node.isMissingNode() || node.isNull()) {
            throw new IllegalArgumentException("Locator not found: " + page + "." + key);
        }
        String value = node.asText();
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Locator value empty: " + page + "." + key);
        }
        return value;
    }
}
