package main.java;

public class FindPairSume {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        //first we need to sort the array then find the pair of elements
        int sum=10;
       /* for(int i =0; i< arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] +" "+ arr[j]);
                }
            }
        }*/
        //int sum = 10;
        int low =0, high = arr.length-1;
        while(low < high)
            if(arr[low]+arr[high] == sum){
                System.out.println(arr[low]+" "+ arr[high]);
                low++;
                high--;
        }
    }
}
