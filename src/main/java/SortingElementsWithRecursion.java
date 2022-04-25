package main.java;

public class SortingElementsWithRecursion {

    public static void main(String[] args) {

        int arr[]={8,3,8,4,9,3,7};
        sortElement(arr, arr.length);
        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortElement(int arr[], int n){

        if(n==1){
            return;
        }
        for(int i =0; i < n-1; i++){
            if(arr[i] > arr[i+1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        sortElement(arr, n-1);
    }
}
