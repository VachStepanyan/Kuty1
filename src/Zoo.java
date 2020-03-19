import java.util.ArrayList;
import java.util.Scanner;

public class Zoo extends Main {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
    Monkey monkey1 = new Monkey();
    Koala koala1 = new Koala();
    Dog dog1 = new Dog();
    Cat cat1 = new Cat();
        ArrayList<Monkey> Monkeylist = new ArrayList<>();
        ArrayList<Koala> Koalalist = new ArrayList<>();
        ArrayList<Dog> Doglist = new ArrayList<>();
        ArrayList<Cat> Catlist = new ArrayList<>();

        Monkeylist.add(monkey1);
        Koalalist.add(koala1);
        Doglist.add(dog1);
        Catlist.add(cat1);
        boolean f  = true;
        int s = 0;
        while(f) {
            System.out.println("Welcome to our zoo, press 1 for information, press 2 to see animal list, press 3 for Worker's list");
            try {
                Scanner scan = new Scanner(System.in);
                s = scan.nextInt();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (s) {

                case 1:
                    System.out.println("Location: Yerevan, tel: 011 xx-xx-xx, website: www.YerevanZoo.am");
                break;
                case 2:
                System.out.println(Monkeylist);
                    System.out.println(Koalalist);
                    System.out.println(Doglist);
                    System.out.println(Catlist);
                    break;
                 case 3:




                     System.out.println();

            }
        }
    }
}