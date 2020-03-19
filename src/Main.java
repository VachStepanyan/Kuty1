import java.util.ArrayList;

public class Main {


    private static Worker worker = new Worker();

    public static void main(String[] args) {

        ArrayList<Worker> list = new ArrayList<>();

        list.add(new Worker(1,"Vaspur",42,"Male","Security"));
        list.add(new Worker(2,"Gago",43,"Male","Director"));

        int id = 1;


        // es do n a
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        System.out.println();



        // senc pti gtnes bolor workernerit mejic specific workeri
        for (Worker worker : list) {
            if(worker.getId() == id){
                list.remove(worker);
            }
        }

        // es posle n a
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }



    }
}
