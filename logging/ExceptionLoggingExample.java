package logging;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionLoggingExample {
    private static final Logger logger = Logger.getLogger("com.mycompany.myapp");

    public static void main(String[] args) {
        logger.setLevel(Level.FINE); // 로그 레벨 설정

        try {
            var e = new IOException("예외 발생");
            logger.throwing("com.mycompany.mylib.Reader", "read", e);
            throw e;
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "예외 처리 중 발생한 오류", ex);
        }
    }
}



