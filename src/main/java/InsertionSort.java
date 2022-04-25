package main.java;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={4,2,6,6,7,1};
        insertSort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void insertSort(int arr[]){
        int temp;
        int j;
        for(int i =1; i < arr.length-1; i++){
            temp = arr[i];
            j = i-1;
            while (j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
    }
}
