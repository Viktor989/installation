package ViktorGolikov;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder tmp = new StringBuilder();
        String file = "Каталог ";
        String generated = " успешно создан \n";

        File temp = new File("c://Games", "temp");
        if (temp.mkdir()) {
            tmp.append(file + temp + generated);
        }
        File src = new File("c://Games", "src");
        if (src.mkdir()) {
            tmp.append(file + src + generated);
        }
        File res = new File("c://Games", "res");
        if (res.mkdir()) {
            tmp.append(file + res + generated);
        }
        File savegames = new File("c://Games", "savegames");
        if (savegames.mkdir()) {
            tmp.append(file + savegames + generated);
        }
        File main = new File("c://Games/src", "main");
        if (main.mkdir()) {
            tmp.append(file + main + generated);
        }
        File test = new File("c://Games/src", "test");
        if (test.mkdir()) {
            tmp.append(file + test + generated);
        }
        File drawables = new File("c://Games/res", "drawables");
        if (drawables.mkdir()) {
            tmp.append(file + drawables + generated);
        }
        File vectors = new File("c://Games/res", "vectors");
        if (vectors.mkdir()) {
            tmp.append(file + vectors + generated);
        }
        File icons = new File("c://Games/res", "icons");
        if (icons.mkdir()) {
            tmp.append(file + icons + generated);
        }
        File mainJava = new File("c://Games/src/main", "Main.java");
        if (mainJava.createNewFile()) {
            tmp.append("Файл    " + mainJava + generated);
        }
        File utilsJava = new File("c://Games/src/main", "Utils.java");
        if (utilsJava.createNewFile()) {
            tmp.append("Файл    " + utilsJava + generated);
        }
        File tempTxt = new File("c://Games/temp", "temp.txt");
        if (tempTxt.createNewFile()) {
            try (FileOutputStream mess = new FileOutputStream("c://Games/temp/temp.txt")) {
                tmp.append("Файл    " + tempTxt + generated);
                tmp.append("Лог установки успешно записан");
                String tmpString = tmp.toString();
                byte[] bytes = tmpString.getBytes(StandardCharsets.UTF_8);
                mess.write(bytes);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
