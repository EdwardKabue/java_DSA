public class MinArray{

    public int findMinimum(int[] arr){
        //edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        int min = arr[0]; //min will hold the minimum value of the array

        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};

        MinArray ma = new MinArray();

        System.out.println(ma.findMinimum(arr));
    }
}