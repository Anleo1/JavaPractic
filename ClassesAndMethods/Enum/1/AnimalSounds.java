enum Sound {
    DOG("Гав-гав"),
    CAT("Мяу"),
    COW("Мууу"),
    BIRD("Чик-чирик"),
    DUCK("Кря");

    private final String sound;

    Sound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void play() {
        System.out.println(sound);
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        Sound dog = Sound.DOG;
        dog.play();

        Sound cat = Sound.CAT;
        cat.play();

        for (Sound s : Sound.values()) {
            System.out.println(s + ": " + s.getSound());
        }

        Sound animal = Sound.BIRD;
        switch (animal) {
            case DOG :
                System.out.println("собака");
                break;
            case CAT :
                System.out.println("кошка");
                break;
            case BIRD :
                System.out.println("птица");
                break;
            default :
                System.out.println("другое животное");
                break;
        }
    }
}
