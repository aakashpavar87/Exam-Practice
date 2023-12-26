import java.util.Arrays;

public class Array_Handle {
    public static void main(String[] args) {
        int[] arr = {2,4,5,67,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // Searching Element
        int elem = 67;
        int idx = Arrays.binarySearch(arr, elem);
        System.out.println("Element Found at " + (idx + 1));
        int sum = 0;
        // Sum of Array
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(String.format("Copy Array %s", Arrays.toString(copy)));

        int fill[] = new int[6];
        Arrays.fill(fill, 0);

        String strArr[] = {"Aakash", "Bhavesh", "Ramesh", "Mahesh"};
        
        String newStr = String.join("(^_^)", strArr);
        System.out.println(newStr);
        System.out.println(Arrays.toString(fill));
    }
}
