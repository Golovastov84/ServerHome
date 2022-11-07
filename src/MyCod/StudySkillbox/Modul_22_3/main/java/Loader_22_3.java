import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Loader_22_3 {
    private static Logger logger;
//    static Logger logger = Logger.getGlobal();
//    public static final Logger logger = Logger.getLogger(Loader.class.getName());

    public static void main(String[] args) throws Exception {

        int cores = Runtime.getRuntime().availableProcessors();
        long startTimer = System.currentTimeMillis();
        char letters[] = {'У', 'К', 'Е', 'Н', 'Х', 'В', 'А', 'Р', 'О', 'С', 'М', 'Т'};
        int maxRegionCode = 3;
        int maxNumber = 10;
        logger = LogManager.getRootLogger();
        int shareSize = (int) Math.ceil((double) maxRegionCode / (double) cores); // 3
        for (int j = 0; j < cores; j++) {
            int nameFile = j;
            new Thread(() -> {
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter("data/numbers_" + nameFile + ".txt");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                for (int regionCode = Math.max(1, nameFile * shareSize); regionCode <
                        (Math.min((nameFile + 1) * shareSize, maxRegionCode)); regionCode++) {
//              условие годка делиться без остатка
                /*for (int regionCode = (nameFile * shareSize > 0 ? nameFile * shareSize : 1); regionCode < ((nameFile + 1) *
                        shareSize); regionCode++) {*/
// 1 2-3 4-5 6-8
                    StringBuilder builder = new StringBuilder();
                    for (int number = 1; number < maxNumber; number++) {
                        for (char firstLetter : letters) {
                            for (char secondLetter : letters) {
                                for (char thirdLetter : letters) {
                                    builder.append(firstLetter);
                                    padNumber(builder, number, 3);
                                    builder.append(secondLetter);
                                    builder.append(thirdLetter);
                                    padNumber(builder, regionCode, 2);
                                    builder.append("\n");
                                    /* synchronized (logger) {

//                                        logger.info(nameFile + " " + (System.currentTimeMillis() - startTimer) + " ms");
                                        logger.log(Level.INFO,nameFile + " " + (System.currentTimeMillis() - startTimer) +
                                                " ms");
                                    }*/

                                    synchronized (logger) {
                                        logger.info(nameFile + " " + (System.currentTimeMillis() - startTimer) + " ms");
                                    }
                                }
                            }
                        }
                    }
                    try {
                        writer.write(builder.toString());
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                    }
                }
                writer.flush();
                writer.close();
                System.out.println((System.currentTimeMillis() - startTimer) + " ms");
            }).start();
        }
    }
    private static void padNumber(StringBuilder builder, int number, int numberLength) {
        int padSize = numberLength - number;
        for (int i = 0; i < padSize; i++)
        {
            builder.append('0');
        }
        builder.append(number);
    }
}
