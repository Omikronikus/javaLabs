import java.util.Arrays;

public class FileViewer {

    private String filename;

    private String fileformat;
    private String[] formats = {"txt","jpeg","jpg","avi"};

    public String getFilename() {

        return this.filename;

    }

    public void setFilename(String filename) {

        this.filename = filename;

    }

    public boolean isFileExist() {

        return true;
    }


    public String getFileFormat() {

        if(! Arrays.asList(formats).contains(fileformat)){
            System.out.println("Неверный формат файла");
            String msg = "Неверный формат файла";
            Log.consoleOutput(msg);
            return "";
        }
        return this.fileformat;
    }

    public void closeFile() {

    }

}
