public class Dog implements Joy {


    private static boolean tail = true;
    private static int legs = 4;
    private static String voice = "huh huh";
    private int age;
    private int hight;
    private String type;
    private static int id=0;

    public Dog(int age, int hight, String type) {
        this.age = age;
        this.hight = hight;
        this.type = type;
        id++;

    }


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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        if(tail){
            return "Dog have " + legs + " legs and it have a tail and it have voice " +  voice;
        } else
            return "Dog have " + legs + " legs and it does not have a tail and it have voice " +  voice;
    }



}