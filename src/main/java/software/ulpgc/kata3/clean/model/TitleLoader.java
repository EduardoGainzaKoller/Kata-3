package software.ulpgc.kata3.clean.model;

import software.ulpgc.kata3.clean.model.Title;

import java.io.IOException;
import java.util.List;

public interface TitleLoader {
    List<Title> load() throws IOException;
}
