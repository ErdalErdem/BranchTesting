public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("woof");
        Cat cat = new Cat("meow");

        System.out.println(cat);
        System.out.println(dog);

        cat.eat("fish");
        dog.eat("dog food");

    }
}
