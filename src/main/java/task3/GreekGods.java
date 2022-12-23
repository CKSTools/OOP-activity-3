package task3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreekGods {

    public  List<String> gods = new ArrayList<>();

    public void readFile() throws IOException {
        URL url = getClass().getClassLoader().getResource("gods.txt");
        if (url == null){throw new IOException("file url invalid");}
        File godFile = new File(url.getFile());
        //loads the data from the file.
        Scanner sc = new Scanner(new FileReader(godFile)).useDelimiter("[,\r\n]");
        String tempGod;
        //checking for end of file
        while(sc.hasNext()){
            tempGod = sc.next();
            //guards against empty input produced by line breaks / empty lines in source file.
            //otherwise test 3.1 fails due to last value getting \r\n appended.
            if (tempGod.isEmpty()){return;}
            //adds tempGod string to gods array.
            gods.add(tempGod);
        }
    }

    public void saveFilteredGods() throws IOException {
        FileWriter writer = new FileWriter("filtered-gods.txt");
        for (String god: gods) {if(!god.startsWith("A")){writer.write(god + "\n");}}
        writer.close();
    }

    public List<String> getList(){return gods;}


}
