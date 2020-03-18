public class Main {
    public static void main(String[] args) {
        Dog shun = new Dog();
        shun.voice();
        System.out.println(shun.legs());
        System.out.println(shun.tail());
        Cat katu = new Cat();

        katu.voice();

        System.out.println(katu.legs());
        System.out.println(katu.tail());
    }
}
