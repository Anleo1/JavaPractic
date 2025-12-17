public class StringConcatenation {
    public static void main(String[] args) {
        String name = "Максим";
        int age = 30;
        double height = 1.80;
        boolean married = false;
        char bloodType = '1';

        System.out.println(name + ", " + age + " лет, рост " + height + " см" + "\nБрак: " + married + ", Группа крови: " + bloodType + "\n");

        Integer objI = Integer.valueOf(age);
        Double objD = Double.valueOf(height);
        String result = "Объекты: " + objI + ", " + objD;
        System.out.println(result);
    }
}
