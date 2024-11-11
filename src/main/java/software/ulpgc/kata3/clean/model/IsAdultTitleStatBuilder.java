package software.ulpgc.kata3.clean.model;

import java.util.List;

public class IsAdultTitleStatBuilder implements StatBuilder{

    private final List<Title> titles;

    public IsAdultTitleStatBuilder(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public Stat build() {
        Stat stat = new Stat();
        for (Title title : titles) {
            stat.put(title.getIsAdult(), (int)stat.getOrDefault(title.getIsAdult(), 0)+1);
        }
        return stat;
    }
}
