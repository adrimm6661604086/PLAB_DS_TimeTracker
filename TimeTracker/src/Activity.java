import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Observer;

abstract class Activity implements Observer {
    protected LocalDateTime date_start;
    protected LocalDateTime date_end;
    protected Duration duration;
    private String name;
    private Project dad;

    public Activity(String name, Project dad){
        this.name = name;
        this.dad = dad;
    }

    public abstract void update();
}
