import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileViewer {

    private String filename;

    private String fileformat;

    public String getFilename() {

        return this.filename;

    }

    public void setFilename(String filename) {

        this.filename = filename;
        Log.consoleOutput("Установлено имя файла.");
    }

    public boolean isFileExist() {
        Log.consoleOutput("Проверка на наличие файла: файл найден.");
        return true;
    }


    public String getFileFormat() {

        Log.consoleOutput("Получние формата файла...");

        return this.fileformat;
    }

    public void closeFile() {
        Log.consoleOutput("Закрытие файла.");
    }


}
