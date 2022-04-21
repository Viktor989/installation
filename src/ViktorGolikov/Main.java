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

        File[] temps = new File[9];
        temps[0] = new File("c://Games", "temp");
        temps[1] = new File("c://Games", "src");
        temps[2] = new File("c://Games", "res");
        temps[3] = new File("c://Games", "savegames");
        temps[4] = new File("c://Games/src", "main");
        temps[5] = new File("c://Games/src", "test");
        temps[6] = new File("c://Games/res", "drawables");
        temps[7] = new File("c://Games/res", "vectors");
        temps[8] = new File("c://Games/res", "icons");

        for (int i = 0; i < temps.length; i++) {
            if (temps[i].mkdir()) {
                tmp.append(file + temps[i] + generated);
            }
        }
        
        File[] mainJava = new File[3];
        mainJava[0] = new File("c://Games/src/main", "Main.java");
        mainJava[1] = new File("c://Games/src/main", "Utils.java");
        mainJava[2] = new File("c://Games/temp", "temp.txt");
        for (int i = 0; i < mainJava.length; i++) {
            if (mainJava[i].createNewFile()) {
                tmp.append("Файл    " + mainJava[i] + generated);
            }
        }
        try (FileOutputStream mess = new FileOutputStream("c://Games/temp/temp.txt")) {
            tmp.append("Лог установки успешно записан");
            String tmpString = tmp.toString();
            byte[] bytes = tmpString.getBytes(StandardCharsets.UTF_8);
            mess.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

