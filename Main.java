public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.sound();
        cow.pet();

        Owl owl = new Owl();
        owl.sound();
        owl.fly();
        owl.glide();

        Duck duck = new Duck();
        duck.sound();
        duck.fly();
        duck.glide();
        duck.pet();
        duck.clean();

        Pig pig = new Pig();
        pig.sound();
        pig.pet();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.sound();
        pekingDuck.fly();
        pekingDuck.glide();
        pekingDuck.pet();
        pekingDuck.clean();
        pekingDuck.beCrispy();
    }
}