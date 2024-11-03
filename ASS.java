public class ASS {


    public static int SecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] > highest) {
                secondHighest = highest;
                highest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < highest) {
                secondHighest = arr[i];
            }
            i++;
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 1, 4, 9};

        System.out.println("Second highest element is: " + SecondHighest(arr));
    }


}



//o/p
// Second highest element is: 8