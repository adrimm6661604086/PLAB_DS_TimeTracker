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


    public void start() {
        //TO_DO execute task start timer
        System.out.println("Running task ..." + LocalDateTime.now());
        Interval i1 = new Interval(this, LocalDateTime.now(), LocalDateTime.now(), null);
        ListIntervals.add(i1);
        //timeKeeper(i1);
        i1.timeKeeper();
        this.date_start = i1.getDate_start();
        this.date_end = i1.getDate_end();
    }

    public void stop() {
        //TO_DO stop task and timer
        System.out.println("Stopping task ..." + LocalDateTime.now());
        long duration = Duration.between(this.date_start, this.date_end).getSeconds();

    }

    public LinkedList<Interval> getListIntervals() { return ListIntervals;}


    @Override
    public void update() {
        //Aqui todos los prints; falta arreglar los updates correctamente i colocar los prints correctos en el update correspondiente

        System.out.println("\t\t initial date \t final date \t duration");
        System.out.println("Start test ...");
        System.out.println("Transportation starts ...");
        System.out.println("Transportation stops");

        System.out.println("activity: \t" + this.TaskName + "\t" + this.date_start + "\t" + this.date_end + "\t" + this.duration);
        System.out.println("interval: \t \t" + this.date_start + "\t" + this.date_end + "\t" + this.duration);

        System.out.println("First list starts...");
        System.out.println("First list stops");

        System.out.println("Second list starts...");
        System.out.println("Second list stops");

        System.out.println("End of test");
    }

    @Override
    public void update(Observable o, Object arg) {
        LocalDateTime dateTime = ((TimeTracker) o).getDateTime();
    }
}
