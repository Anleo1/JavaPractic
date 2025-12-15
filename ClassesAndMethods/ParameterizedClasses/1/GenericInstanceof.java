import java.util.*;
class Temp<T> {
    private T item;

    public Temp(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericInstanceof {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Temp<String> stringBox = new Temp<>("Hello");
        Temp<Integer> intBox = new Temp<>(85);

        //Проверка самого контейнера (без generic параметров) - всегда работает
        System.out.println(list instanceof ArrayList); //true
        System.out.println(stringBox instanceof Temp); //true
        System.out.println(intBox instanceof List); //false

        // Проверка параметризации, может сработать в соответствии с Pattern Matching for instanceof в более новых версиях Java
        //так как instanceof с generic параметрами разрешен, если нет явной несовместимости типов на этапе компиляции, иначе ошибка компиляции
        System.out.println(stringBox instanceof Temp<String>); // true
        System.out.println(list instanceof List<String>); //true
        //следующие строки выдадут ошибку(при попытке сконвертировать Integer в String или наоборот)
        //System.out.println(intBox instanceof Box<String>);
        //System.out.println(list instanceof List<Integer>);

        // Проверка содержимого
        Object obj1 = stringBox.getItem();
        System.out.println(obj1 instanceof String); // true
        Object obj2 = intBox.getItem();
        System.out.println(obj2 instanceof String); //false
    }
}
