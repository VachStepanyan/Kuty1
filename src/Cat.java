public class Cat implements Joy {

    boolean tail = true;
    private int legs = 4;
    String voice = "myau myau";

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
            return "Cat have " + legs + " legs and it have a tail and it have voice " +  voice;
        } else
            return "Cat have " + legs + " legs and it does not have a tail and it have voice " +  voice;
    }


}
