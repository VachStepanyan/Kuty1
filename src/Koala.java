public class Koala  implements Joy{

    boolean tail = false;
    private int legs = 4;
    String voice = "kxo kxo";

    @Override
    public void voice() {
        System.out.println(voice);
    }

    @Override
    public int legs() {
        return legs;
    }

    @Override
    public boolean tail() {
        return tail;
    }


    @Override
    public String toString() {
        if(tail){
            return "Koala have " + legs + " legs and it have a tail and it have voice " +  voice;
        } else
            return "Koala have " + legs + " legs and it does not have a tail and it have voice " +  voice;
    }
}
