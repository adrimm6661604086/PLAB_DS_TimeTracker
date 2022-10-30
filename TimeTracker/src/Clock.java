import java.time.LocalDateTime;
import java.util.LinkedList;

public class Clock {
    private LinkedList<Interval> intervals = new LinkedList<>();
    private final long period = 2000; //Ms

    public Clock(LinkedList<Interval> i){
        this.intervals = i;
    }

    public void timeKeeper(){
        LocalDateTime now = LocalDateTime.now();
        for (Interval i : intervals){
            if(now.isBefore(i.getDate_end())){
                i.setDate_end(now);
            }
        }
    }
}
