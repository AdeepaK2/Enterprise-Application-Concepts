package SOLID;
abstract class Bird{
    abstract void live();
}

interface FlyingBird{
    void fly();
}


class Sparrow extends Bird implements FlyingBird{
    @Override
    void live() {
        System.out.println("Sparrow is living.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

class Ostrich extends Bird{
    @Override
    void live() {
        System.out.println("Ostrich is living.");
    }
}