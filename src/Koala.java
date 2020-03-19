public class Koala  implements Joy{

    @Override
    public void voice() {
        System.out.println("Koala Voice: aaa");
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
        return false;
    }
}
