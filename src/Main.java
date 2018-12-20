import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String info =
                "Лабораторная работа №3 - " +
                "\"Классы и объекты\n" +
                "Выполнил: Семёнов Е.А. группа: ПЭ-171";
        System.out.println(info);
        FileViewerFactory fvf = new FileViewerFactory(args[0]);
        fvf.createFileViewer();


    }

}
