package logging;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ResourceBundleExample {

    public static void ResourceBundleExample(String[] args) {
        // 설정된 로케일에 따라 리소스 번들을 선택
        ResourceBundle bundle = ResourceBundle.getBundle("logmessages", Locale.getDefault());

        // 로그 메시지 출력을 위한 로거 생성
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        logger.setLevel(Level.INFO);

        String fileName = "file.txt";
        String oldName = "oldFile.txt";
        String newName = "newFile.txt";

        // 메시지 출력
        logger.logrb(Level.INFO, bundle, "readingFile", fileName);
        logger.logrb(Level.INFO, bundle, "renamingFile", oldName, newName);
    }
}

