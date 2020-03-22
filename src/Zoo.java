import java.util.ArrayList;
import java.util.Iterator;
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
        int s = 0, s1, s2, id, age;
        String name,  sex, position;

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
                    ArrayList<Worker> list = new ArrayList<>();

                    list.add(new Worker(1, "Vaspur", 42, "Male", "Security"));
                    list.add(new Worker(2, "Gago", 43, "Male", "Director"));

                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).toString());
                    }
                    System.out.println();

                    System.out.println("to remove worker press 1, to add worker press 2");
                    Scanner scan = new Scanner(System.in);
                    s1 = scan.nextInt();
                        switch (s1) {
                            case 1:
                                System.out.println("Please enter ID of worker you wont to remove" );
                                s2 = scan.nextInt();
                                for(Iterator<Worker> itr = list.iterator(); itr.hasNext();){
                                    Worker worker = itr.next();
                                    if(worker.getId() == s2){
                                        itr.remove();
                                    }
                                }

                                for (int i = 0; i < list.size(); i++) {
                                    System.out.println(list.get(i).toString());

                                }
                                break;
                            case 2:
                                System.out.println("Enter ID, name, age, sex, position of worker");

                                id = scan.nextInt();
                                name = scan.nextLine();
                                age = scan.nextInt();
                                sex = scan.nextLine();
                                position = scan.nextLine();
                                list.add(new Worker(id, name, age, sex, position));

                        break;

                        }

                        break;

                    }
            }
        }


