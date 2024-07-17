class Duck extends Animal implements Flyable, Pettable {
    @Override
    void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void glide() {
        System.out.println("The duck is gliding.");
    }

    @Override
    public void pet() {
        System.out.println("You can pet the duck.");
    }

    public void clean() {
        System.out.println("The duck is cleaning itself.");
    }
}
