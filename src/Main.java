import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog shun = new Dog();
        shun.voice();
        System.out.println(shun.legs());
        boolean s1  = shun.tail();
        if (s1 == true)
            System.out.println("Shuny uni poch");
         else
            System.out.println("Shuny chuni poch");

        Cat katu = new Cat();



        katu.voice();

        System.out.println(katu.legs());
        boolean s2  = katu.tail();
        if (s2 == true)
            System.out.println("Katun uni poch");
        else
            System.out.println("Katun  chuni poch");
    }
}
