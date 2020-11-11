import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []num = {8,2,10,6,4};
        //int n = numA.length;
        System.out.println(maxProduct(num, num.length));

    }

    // Maximum Product of Two consecutive Elements in an Array
    // Method for maximum product of two consecutive elements which takes array of integer and number of element in the array
    public static int maxProduct(int [] arr, int n){
        // sorting out the array of numbers and put them by ascending order
        Arrays.sort(arr);

        // Create variable  for array to check the product of 0's and 1's  in the given array
        int sum1 = arr[0] * arr[1];
        // Create variable for array deducting 1's element of an array from n(number of elements in the array).
        // And multiply by deducted 2nd element of an array from n(number of elements in the array).
        int sum2 = arr[n-1] * arr[n-2];

        // In this case our sorted array is {2,4,6,8,10}
        // sum1 arr[0] * arr[1] = 2*4  4*6  6*8  8*10
        // sum2 arr[n-1] * arr[n-2] = 4*6  6*8  8*10  null
        // sum1>sum2 when sum1 = 8*10 and sum2 = 0
        if(sum1>sum2) {
            // if sum1>sum2 we will return Sum1, which will be the maximum product
            return sum1;
        } else {
            // if sum1 is not greater than sum2, will return Sum2, which is the lowest product value.
            // But in this case, sum1 is always grater than sum2 since we used sorted out the array.
            return sum2;

        }

    }
}
