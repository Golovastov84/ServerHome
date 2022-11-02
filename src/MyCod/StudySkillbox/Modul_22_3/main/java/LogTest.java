import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {

//    public static Logger logger = Logger.getLogger(LogTest.class.getName());
//    public static Logger logger;
private static Logger logger;

    public static void main(String[] args){
//        LoggerContext context = (LoggerContext) LogManager.getContext(false);
//        logger = LogManager.getContext(false);
//        File file = new File("src/MyCod/StudySkillbox/Modul_22_3/main/resources/log4j2.xml");
//        context.setConfigLocation(file.toURI());
//        logger.setConfigLocation(file.toURI());
        logger = LogManager.getRootLogger();
//         LogManager.getLogManager().readConfiguration(LogTest.class.getResourceAsStream("logging.properties"));
        long startTimer = System.currentTimeMillis();

        for (int j = 0; j < 100; j++) {
//            logger.log(Level.INFO,j + " " + (System.currentTimeMillis() - startTimer) + " ms");
            logger.info(j + " " + (System.currentTimeMillis() - startTimer) + " ms");
        }
    }
}
