import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the sum : ");
        int sum = scanner.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int output = findMaximumSubarray(array, sum);
        System.out.println("Output : " + output);
    }

    private static int findMaximumSubarray(int[] array, int sum) {
        int size = array.length;
        int total = 0;
        for(int i = 0; i < size; i++){
            total += array[i];
        }
        int i = 0;
        while (total > sum){
            total -= array[i];
            i++;
        }
        return total;
    }
}
