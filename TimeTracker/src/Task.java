import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Observable;

public class Task extends Activity {
    private String TaskName;
    private LinkedList <Interval> ListIntervals;

    public Task(String name, Project dad) {
        super(name, dad);
    }

    @Override
    public void update() {

    }

    public void start() {
        //TO_DO execute task start timer
        System.out.println("Running task ..." + LocalDateTime.now());
        Interval i1 = new Interval(this, LocalDateTime.now(), LocalDateTime.now(), null);
        ListIntervals.add(i1);
        //timeKeeper(i1);
        i1.timeKeeper();
    }

    public void stop() {
        //TO_DO stop task and timer
        System.out.println("Stopping task ..." + LocalDateTime.now());
        long duration = Duration.between(this.date_start, this.date_end).getSeconds();

    }

    public LinkedList<Interval> getListIntervals() { return ListIntervals;}

    @Override
    public void update(Observable o, Object arg) {

    }
}
