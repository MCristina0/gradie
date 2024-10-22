import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.info("Mensaje de información");
        logger.warn("Mensaje de advertencia");
        logger.error("Mensaje de error");
    }
}
