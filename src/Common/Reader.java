package Common;

import java.io.*;
import java.util.ArrayList;

public class Reader {

    ArrayList<String> lines;

    public Reader(String fileName) throws IOException {
        this.lines = new ArrayList<>();

        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            lines.add(st);
        }
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }
}