public class Inheritance {
    public static void main(String args[]){
        Fish spark = new Fish();
        spark.eat();
    }

    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }

}
