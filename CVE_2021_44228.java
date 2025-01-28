package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CVE_2021_44228 {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        String msg = (args.length > 0 ? args[0] : "");
        logger.error(msg);
    }
}
