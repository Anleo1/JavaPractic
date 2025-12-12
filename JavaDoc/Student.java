/**
 Класс для представления студента.
 @author Анастасия
 */
public class Student {
    private String name;
    private int age;
    private String group;

    /**
     Конструктор по умолчанию.
     Создает студента с пустыми полями.
     */
    public Student() {
        this.name = "";
        this.age = 0;
        this.group = "";
    }

    /**
     Конструктор с параметрами.

     @param name имя студента
     @param age возраст студента
     @param group учебная группа
     */
    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }
    /**
     Возвращает строковое представление студента.

     @return строка в формате "Имя: [name], Возраст: [age], Группа: [group]"
     */
    public String toString() {
        return String.format("Имя: %s, Возраст: %d, Группа: %s", name, age, group);
    }

    /**
     Главный метод для демонстрации работы класса.
     @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        // Создание студента
        Student student = new Student("Анастасия", 20 , "2");
        System.out.println(student);
    }
}
