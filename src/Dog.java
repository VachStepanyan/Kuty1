public class Dog implements Joy {

    @Override
    public void voice() {
        System.out.println("Dog Voice: Huh");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private int legs = 4;
    @Override
    public int legs() {
        return legs;
    }

    @Override
    public boolean tail() {
        return true;
    }


}
