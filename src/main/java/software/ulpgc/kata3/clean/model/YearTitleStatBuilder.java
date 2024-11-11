package software.ulpgc.kata3.clean.model;

import java.util.List;

public class YearTitleStatBuilder implements StatBuilder {
    private final List<Title> titles;

    public YearTitleStatBuilder(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public Stat build() {
        Stat stat = new Stat();
        for (Title title : titles) {
            stat.put(title.getYear(), (int)stat.getOrDefault(title.getYear(), 0)+1);
        }
        return stat;
    }
}
