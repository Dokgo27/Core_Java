package logging;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MethodLoggingExample {

    private static final Logger logger = Logger.getLogger("com.mycompany.myapp");

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);

        MethodLoggingExample example = new MethodLoggingExample();
        int result = example.read("file.txt", "pattern");
        System.out.println("Result: " + result);
    }

    int read(String file, String pattern) {
        logger.entering("MethodLoggingExample", "read", new Object[]{file, pattern});
        int count = 0;
        // 파일 읽기 작업 수행
        // ...
        count = 42; // 가상의 읽은 개수
        logger.exiting("MethodLoggingExample", "read", count);
        return count;
    }
}