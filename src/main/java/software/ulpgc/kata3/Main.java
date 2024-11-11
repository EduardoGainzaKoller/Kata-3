package software.ulpgc.kata3;

import software.ulpgc.kata3.clean.model.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/edani/title.basics.tsv");
        List<Title> titles = new FileTitleLoader(file, new TsvTitleDeserializer()).load();
        Stat yearsStat = new YearTitleStatBuilder(titles).build();
        Stat isAdultStat = new IsAdultTitleStatBuilder(titles).build();
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
