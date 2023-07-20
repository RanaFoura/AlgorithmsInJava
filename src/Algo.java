public class Algo {


        // O(n^2)
    public static void sortSelection(int arr[]){
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


    // O(n^2)
    public static void sortBubble(int arr[]){
        int unsorted= arr.length;
        boolean swapped;
        for (int i =0 ; i < arr.length; i++ ){
            swapped= false;
            for (int j=0; j<unsorted;j++){
                if (j+1 <=arr.length-1) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            // This will make O(n) instead of o(n^2), if the array sorted , or just stop looping if the array sorted
            if (swapped == false)
                break;
            unsorted--;
        }
        // Print the sorted array
        for (int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    // O(n^2)
    public static void sortInsertion(int arr[]){
    for (int i = 0 ; i<arr.length-1;i++){
        for ( int j = i+1 ; j>0 ; j--){
            if (arr[j]>arr[j-1]){
                break;
            }
            else {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]= temp;
            }
        }
    }
        // Print the sorted array
        for (int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}


