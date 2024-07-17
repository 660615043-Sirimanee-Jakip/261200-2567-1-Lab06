class Cow extends Animal implements Pettable {
    @Override
    void sound() {
        System.out.println("Moo");
    }

    @Override
    public void pet() {
        System.out.println("You can pet the cow.");
    }
}