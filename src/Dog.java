public class Dog implements Joy {

    @Override
    public void voice() {
        System.out.println("Dog Voice: Huh");
    }

    private int legs = 4;
    @Override
    public int legs() {
        return legs;
    }


}
