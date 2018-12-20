import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileViewerFactory {

    private String filename;
    private  String format;


    public FileViewerFactory(String filename){
        this.filename = filename;
        String[] formats = {"txt","jpeg","jpg","avi"};
        Pattern p = Pattern.compile("(\\.)(\\w+)");
        Matcher m = p.matcher(filename);

        if(m.find()){
             this.format = m.group(2);
        }
        else{
            System.out.println("Неверное имя файла");
            String msg = "Неверное имя файла";
            Log.consoleOutput(msg);

        }
        if(! Arrays.asList(formats).contains(this.format)){
            System.out.println("Неверный формат файла");
            String msg = "Неверный формат файла";
            Log.consoleOutput(msg);
        }
    }

    public void createFileViewer(){
        switch (this.format){
            case "avi": {
                AviFileViewer fw = new AviFileViewer();
                fw.setFilename(this.filename);
                fw.readData();
                fw.renderData();
                fw.closeFile();
                break;
            }
            case "jpeg": {
                JpegFileViewer fw = new JpegFileViewer();
                fw.setFilename(this.filename);
                fw.readData();
                fw.renderData();
                fw.closeFile();
                break;
            }
            case "jpg": {
                JpgFileViewer fw = new JpgFileViewer();
                fw.setFilename(this.filename);
                fw.readData();
                fw.renderData();
                fw.closeFile();
                break;
            }
            case "txt": {
                TxtFileViewer fw = new TxtFileViewer();
                fw.setFilename(this.filename);
                fw.readData();
                fw.renderData();
                fw.closeFile();
                break;
            }
            default: System.out.println("Неверное имя файла");
        }

    }
}
