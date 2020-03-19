import java.util.ArrayList;

public class Worker extends Zoo{
    private Object toString;

    public Worker(String name, String age, String sex, String work) {
        super();
    }



    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {

        ArrayList<Worker> worker = new ArrayList();

        worker.add(new Worker("Bob","47", "Mail", "Cleaner"));
        worker.add(new Worker("Ann", "47", "FeMail", "Security"));
        worker.add(new Worker("John", "40", "Mail", "Director"));
    }
}