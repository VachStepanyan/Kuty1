public class Monkey  implements Joy {
    @Override
    public void voice() {
        System.out.println("Monkey Voice: wtf");
    }
    private int legs = 2;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int legs() {
        return legs;
    }

    @Override
    public boolean tail() {
        return true;
    }
}
