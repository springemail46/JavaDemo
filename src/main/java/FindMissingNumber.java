package main.java;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,9};
        int n = arr.length;
        int sum = (n*(n+1)/2);
        for(int i =0; i < arr.length-1; i++){
        sum = sum - arr[i];
        }
        System.out.println(sum);
    }
}
