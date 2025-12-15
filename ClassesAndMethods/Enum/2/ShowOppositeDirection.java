enum Direction {
    UP("Вверх") {
        public Direction opposite() { return DOWN; }
    },
    DOWN("Вниз") {
        public Direction opposite() { return UP; }
    },
    RIGHT("Вправо") {
        public Direction opposite() { return LEFT; }
    },
    LEFT("Влево") {
        public Direction opposite() { return RIGHT; }
    };

    private final String description;

    Direction(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Абстрактный метод (каждый элемент реализует свою логику)
    public abstract Direction opposite();
}
public class ShowOppositeDirection {
    public static void main(String[] args) {
        Direction dir = Direction.UP;

        System.out.println(dir + " (" + dir.getDescription() + ")");     // UP (Вверх)
        System.out.println(dir.opposite() +" ("+dir.opposite().getDescription()+")");  // DOWN (Вниз)
        
        for (Direction d : Direction.values()) {
            System.out.println(d + " (" + d.getDescription() + "), противоположное: " + d.opposite() +" ("+d.opposite().getDescription()+")");
        }
    }
}
