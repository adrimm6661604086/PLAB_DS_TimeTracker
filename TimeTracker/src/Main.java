import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Tree Apendix A
        //// Top Level
        Project root = new Project("root", null);
        Project p1 = new Project("software design", root);
        Project p2 = new Project("software testing", root);
        Project p3 = new Project("databases", root);
        Task t1 = new Task("transportation", root);

        // software design project creates two new projects
        Project p4 = new Project("problems", p1);
        Project p5 = new Project("time tracker", p1);

        // problems project creates two new tasks
        Task t2 = new Task("first list", p4);
        Task t3 = new Task("second list", p4);

        // time tracker project creates two new tasks
        Task t4 = new Task("read handout", p5);
        Task t5 = new Task("first milestone", p5);

        //Test Apendix B
        //1. start task transportation, wait 4 seconds and then stop it
        t1.start();
        sleep(4000);
        t1.stop();
        //2. wait 2 seconds
        sleep(2000);
        //3. start task first list, wait 6 seconds
        t2.start();
        sleep(6000);
        //4. start task second list and wait 4 seconds
        t3.start();
        sleep(4000);
        //5. stop first list
        t2.stop();
        //6. wait 2 seconds and then stop second list
        sleep(2000);
        t3.stop();
        //7. wait 2 seconds
        sleep(2000);
        //8. start transportation, wait 4 seconds and then stop it
        t1.stop();
        sleep(4000);
        t1.stop();


    }
}