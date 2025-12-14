import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {7, 4, 9, 1, 3};

        // toString()
        System.out.println(Arrays.toString(arr));

        // sort()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // binarySearch()
        int index = Arrays.binarySearch(arr, 9);
        System.out.println(index);

        // equals()
        int[] arr2 = {1, 2, 3, 5, 8};
        System.out.println(Arrays.equals(arr, arr2)); // true

        // compare()
        int[] arr3 = {1, 2, 3};
        System.out.println(Arrays.compare(arr, arr3));
        //0, если первый и второй массивы равны;
        //Отрицательное значение, если первый массив лексикографически меньше второго;
        //Положительное значение, если первый массив лексикографически больше второго.
    }
}
