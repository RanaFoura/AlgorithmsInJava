public class Main {
    public static void main(String[] args) {

        int arr3[] = {1,2,3,4,5,6,7,8,9,10}; //sorted
        int arr[] = {64,25,12,22,51};
        int arr2[] = {2,8,5,3,9,4,1};
        int[] ascendingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayWithDuplicates = {5, 2, 8, 2, 1, 5, 7, 8, 3, 4};
        int[] shuffledArray = {7, 3, 9, 2, 6, 1, 8, 4, 5, 10};
        int[] negativeArray = {-5, -3, -8, -2, -6, -1, -7, -4, -9, -10};
        int[] singleElementArray = {42};
        int[] emptyArray = {};
        int[] largeArray = {100, 45, 87, 34, 78, 56, 23, 99, 101, 66, 90, 72, 42, 29, 37, 91, 88, 55, 13, 24};


//        Algo.sortSelection(arr2);
//        Algo.sortBubble(arr2);
        Algo.sortInsertion(arr2);


    }
}