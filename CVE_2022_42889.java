import org.apache.commons.text.StringSubstitutor;

public class CVE_2022_42889 {
    public static void main(String[] args) {
        String userInput = "bad user input";
        
        StringSubstitutor substitutor = StringSubstitutor.createInterpolator();
        String result = substitutor.replace(userInput);
        
        System.out.println("Result: " + result);
    }
}
