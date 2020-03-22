public class Dog implements Joy {


    boolean tail = true;
    private int legs = 4;
    String voice = "huh huh";

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
            return "Dog have " + legs + " legs and it have a tail and it have voice " +  voice;
        } else
            return "Dog have " + legs + " legs and it does not have a tail and it have voice " +  voice;
    }

}