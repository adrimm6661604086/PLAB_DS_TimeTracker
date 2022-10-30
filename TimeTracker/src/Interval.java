import java.time.Duration;
import java.time.LocalDateTime;

public class Interval {
    private Task dad;
    private LocalDateTime date_start;
    private LocalDateTime date_end;
    private Duration duration;

    public Interval(Task dad, LocalDateTime ds, LocalDateTime de, Duration duration){
        this.dad = dad;
        this.date_start = ds;
        this.date_end = de;
        this.duration = duration;
    }

    public LocalDateTime getDate_start() { return date_start;}
    public LocalDateTime getDate_end() { return date_start;}
    public void setDate_start(LocalDateTime start) { date_start = start;}
    public void setDate_end(LocalDateTime end) { date_end = end;}

    public void timeKeeper(){
        Clock c = new Clock(dad.getListIntervals());
        c.timeKeeper();
    }


}
