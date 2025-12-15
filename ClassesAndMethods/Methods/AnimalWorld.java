class Animal {
    // Базовый метод - будет переопределен
    void makeSound() {
        System.out.println("Животное издает звук");
    }

    // Перегруженные методы в одном классе
    void eat() {
        System.out.println("Животное ест");
    }

    void eat(String food) {
        System.out.println("Животное ест " + food);
    }

    void eat(String food, int amount) {
        System.out.println("Животное ест " + amount + " порций " + food);
    }
}

class Dog extends Animal {
    // Переопределение метода makeSound()
    @Override
    void makeSound() {
        System.out.println("Собака лает");
    }
}

class Cat extends Animal {
    // Переопределение метода makeSound()
    @Override
    void makeSound() {
        System.out.println("Кошка мяукает");
    }
}

public class AnimalWorld {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Переопределение методов makeSound():");
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();

        System.out.println("\nПерегрузка метода eat():");
        animal.eat();
        animal.eat("траву");
        animal.eat("мяса", 3);
    }
}
