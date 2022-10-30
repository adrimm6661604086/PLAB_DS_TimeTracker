import java.time.LocalDateTime;
import java.util.Observable;
import java.util.Timer;

public class TimeTracker extends Observable {
    private static TimeTracker instance;
    private LocalDateTime dateTime;
    private Timer timer;
    private TimeTracker(TimeTracker i) {
        this.instance = i;
        this.dateTime = LocalDateTime.now();
    }


    public TimeTracker getInstance() {
        //metodo publico para utilizar i controlar el constructor siendo private
        if (instance == null) {
            instance = new TimeTracker(); //CONSTRUCTOR MISSES PARAMETER
        }
        return instance;
    }

    public void startTimer() {

    }

    private void track() {
        setChanged();
        notifyObservers(dateTime);
    }

    public LocalDateTime getDateTime() { return this.dateTime; }
}
