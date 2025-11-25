public class Example {
    public static void main(String[] args) {

        Animal dog1 = new Dog("Шарик");
        Animal dog2 = new Dog("Бобик");
        Animal cat1 = new Cat("Барсик");
        Animal cat2 = new Cat("Рыжик");

        Animal[] animals = {dog1, cat1, dog2, cat2};

        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}
