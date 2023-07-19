public class Algo {


    // O(n^2)
public static void selectionSort(int arr[]){
    for (int i =0 ; i < arr.length; i++ ){
        int currentminimum = arr[i];
        int currentitem = i;
        for (int j = i ; j < arr.length;j++) {
            if (arr[j]<currentminimum){
                currentminimum=arr[j];
                currentitem=j;
            }
        }
        // Swap the minimum element with the first unsorted element
        arr[currentitem] = arr[i];
        arr[i]=currentminimum;
    }
    // Print the sorted array
    for (int i =0 ; i< arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
