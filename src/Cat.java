public class Cat implements Joy {
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void voice() {
        System.out.println("Cat Voice: mau");
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
