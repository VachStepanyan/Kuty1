import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Zoo extends Main {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        ArrayList<Monkey> monkeys = new ArrayList<>();
        ArrayList<Koala> koalas = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();

        boolean f  = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Worker> list = new ArrayList<>();
        int inputedValue, s1, s2, inputValueForAnimals, s4,  id,workerInputValue;
        System.out.println("Welcome to our zoo, press 1 for information, press 2 to see animal list, press 3 for Worker's list");
        inputedValue = scan.nextInt();
        switch (inputedValue) {
            case 1:
                System.out.println("Location: Yerevan, tel: 011 xx-xx-xx, website: www.YerevanZoo.am");
                break;
            case 2:
                System.out.println("To add animal press 1, to remove animal press 2");
                inputValueForAnimals =  scan.nextInt();

                switch (inputValueForAnimals) {
                    case 1:
                        System.out.println("to add monkey press 1 , to add koala press 2, to add dog press 3, to add cat press 4");

                        int inputClassName = scan.nextInt();
                        switch (inputClassName){
                            case 1:
                                System.out.println("Enter age");
                                int age = scan.nextInt();
                                System.out.println("Enter Height");
                                int height = scan.nextInt();
                                System.out.println("enter type");
                                String type = scan.next();
                                monkeys.add(new Monkey(age,height,type));
                                break;
                            case 2:
                                System.out.println("Enter age");
                                age = scan.nextInt();
                                System.out.println("Enter Height");
                                 height = scan.nextInt();
                                System.out.println("enter type");
                                 type = scan.next();
                                koalas.add(new Koala(age, height, type));
                                break;

                            case 3:
                                System.out.println("Enter age");
                                age = scan.nextInt();
                                System.out.println("Enter Height");
                                height = scan.nextInt();
                                System.out.println("enter type");
                                type = scan.next();
                                dogs.add(new Dog(age, height, type));

                                break;

                            case 4:
                                System.out.println("Enter age");
                                age = scan.nextInt();
                                System.out.println("Enter Height");
                                height = scan.nextInt();
                                System.out.println("enter type");
                                type = scan.next();
                                cats.add(new Cat(age, height, type));
                                break;
                        }
                    break;
                    }
                break;
            case 3:

                list.add(new Worker("Vaspur", 42, "Male", "Security"));
                list.add(new Worker("Gago", 43, "Male", "Director"));

                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i).toString());
                }
                System.out.println();
                System.out.println("to remove worker press 1, to add worker press 2");
                workerInputValue = scan.nextInt();
                switch (workerInputValue) {
                    case 1:
                        System.out.println("Please enter ID of worker you wont to remove" );
                        s2 = scan.nextInt();
                        list.removeIf(worker -> worker.getId() == s2);
                        System.out.println("Successfully removed!");
                        break;
                    case 2:
                        System.out.println("Enter ID, name, age, sex, position of worker");
                        String name = scan.nextLine();
                        int age = scan.nextInt();
                        String sex = scan.nextLine();
                        String position = scan.nextLine();
                        list.add(new Worker(name, age, sex, position));

                break;

                }
                break;
                }
    }
}


