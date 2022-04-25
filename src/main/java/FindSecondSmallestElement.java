package main.java;

public class FindSecondSmallestElement {
    public static void main(String[] args) {
        int arr[]={3,1,4,6,2};

       int smallest = Integer.MAX_VALUE;
       int secondSmallest = Integer.MAX_VALUE;
       for(int i = 0; i<arr.length; i++){
           if(arr[i] < smallest){
               smallest = arr[i];
           }
           if(arr[i] > smallest && arr[i] < secondSmallest){
               secondSmallest = arr[i];
           }
       }
        System.out.println(smallest);
    }
}
