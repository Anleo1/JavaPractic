class Base {
    public void display() {
        System.out.println("Base display");
    }

    public String getMessage() {
        return "Base message";
    }

    public void process(int value) {
        System.out.println("Base process: " + value);
    }

    public final void finalMethod() {
        System.out.println("Final method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}

class Descendant extends Base {
    // Опечатка в имени метода
    //@Override
    //public void displaay() { // ошибка компиляции: метод не переопределяет метод из суперкласса
      //  System.out.println("Descendant display");
    //}

    // Изменение возвращаемого типа
    //@Override
    //public int getMessage() { // ошибка компиляции: несовместимый тип возвращаемого значения
    //    return 42; // Base.getMessage() возвращает String
    //}

    // Изменение параметров метода
    //@Override
    //public void process(String value) { // ошибка компиляции: метод не переопределяет метод из суперкласса
      //  System.out.println("Descendant process: " + value);
    //}

    // Попытка переопределить final метод
    //@Override
    //public void finalMethod() { // ошибка компиляции: нельзя переопределить final метод
      //  System.out.println("Trying to override final");
    //}

    // Попытка переопределить private метод
    //@Override
    //public void privateMethod() { // ошибка компиляции: метод не переопределяет метод из суперкласса
      //  System.out.println("Trying to override private");
    //}

    // Попытка переопределить несуществующий метод
    //@Override
    //public void nonExistentMethod() { // ошибка компиляции: метод не переопределяет метод из суперкласса
      //  System.out.println("This method doesn't exist in Base");
    //}

    // Корректное переопределение
    //@Override
    //public void display() {
      //  System.out.println("Correct override");
    //}
}

public class MistakesInOverriding {
    public static void main(String[] args) {
        Base base = new Descendant();

        // Демонстрация полиморфизма
        base.display(); // Вызовет переопределенный метод
        //Остальные будут вызваны из родительского класса(если существуют в нём,
        //не являются private или final
        base.display();
        base.getMessage();
        base.process(5);
        base.finalMethod();
    }
}
