class Owl extends Animal implements Flyable {
    @Override
    void sound() {
        System.out.println("Hoot");
    }

    @Override
    public void fly() {
        System.out.println("The owl is flying.");
    }

    @Override
    public void glide() {
        System.out.println("The owl is gliding.");
    }
}
