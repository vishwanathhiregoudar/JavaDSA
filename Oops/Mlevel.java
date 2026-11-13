public class Mlevel {
    public static void main(String args[]) {
        Dog dobby = new Dog();

        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }

    static class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    static class Mammal extends Animal {
        int legs;
    }

    static class Dog extends Mammal {
        String breed;
    }
}