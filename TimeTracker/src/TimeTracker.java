import java.time.LocalDateTime;

public class TimeTracker {
    private static TimeTracker instance;
    private TimeTracker(TimeTracker i) {
        this.instance = i;
    }


    public TimeTracker getInstance() {
        //metodo publico para utilizar i controlar el constructor siendo private
        if (instance == null) {
            instance = new TimeTracker(); //CONSTRUCTOR MISSES PARAMETER
        }
        return instance;
    }


}
