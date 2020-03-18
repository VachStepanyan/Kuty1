public class Main {
    public static void main(String[] args) {
        Dog shun = new Dog();
        shun.voice();
        System.out.println(shun.legs());

        Cat katu = new Cat();

        katu.voice();

        System.out.println(katu.legs());
    }
}
