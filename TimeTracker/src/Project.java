import java.time.LocalDateTime;
import java.util.Observable;
public class Project extends Activity {
    private String ProjectName;

    public Project(String name, Project dad) {
        super(name, dad);
    }

    @Override
    public void update() {

    }

    @Override
    public void update(Observable o, Object arg) {
        LocalDateTime dateTime = ((TimeTracker) o).getDateTime();
    }
}
