package software.ulpgc.kata3.clean.control;

import software.ulpgc.kata3.clean.model.Barchart;
import software.ulpgc.kata3.clean.model.Stat;
import software.ulpgc.kata3.clean.view.BarchartDisplay;

public class ToggleChartCommand implements Command{
    private final Stat years;
    private final Stat isAdult;
    private final BarchartDisplay barchartDisplay;

    public ToggleChartCommand(Stat years, Stat isAdult, BarchartDisplay barchartDisplay) {
        this.years = years;
        this.isAdult = isAdult;
        this.barchartDisplay = barchartDisplay;
    }

    private int i = 0;
    @Override
    public void excute() {
        Barchart nextBarchart = getBarchart(++i);
        barchartDisplay.display(nextBarchart);
    }

    private Barchart getBarchart(int i) {
        return i % 2 == 0 ?
                getYearsBarchart() :
                getIsAdultBarchart();
    }

    private Barchart getIsAdultBarchart() {
        Barchart barchart = new Barchart("IsAdult");
        for (Object count : isAdult.keySet()) {
            barchart.add(count.toString(), (int)isAdult.get(count));
        }
        return barchart;
    }

    private Barchart getYearsBarchart() {
        Barchart barchart = new Barchart("Years");
        for (Object count : years.keySet()) {
            barchart.add(count.toString(), (int)years.get(count));
        }
        return barchart;
    }

}
