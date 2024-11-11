package software.ulpgc.kata3.clean.model;

public class Title {
    private final String title;
    private final int year;
    private final int duration;
    private final int isAdult;

    public Title(String title, int year, int duration, int isAdult) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.isAdult = isAdult;
    }

    public int getIsAdult() {
        return isAdult;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Title{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration +
                ", isAdult=" + isAdult +
                '}';
    }
}
