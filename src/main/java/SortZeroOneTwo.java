package main.java;

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int arr[]={1,0,1,0,2,0,1,2,0,1};
        sortElement(arr);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] sortElement(int arr[]){
        int zeroCount =0;
        int oneCount = 0;
        for(int i =0; i< arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
            if (arr[i] == 1) {
                oneCount++;
            }
        }
            for(int i =0; i< zeroCount; i++){
                arr[i]=0;
            }
            for(int i = oneCount; i<(zeroCount+oneCount); i++){
                arr[i]=1;
            }
            for(int i = (zeroCount+oneCount); i< arr.length; i++){
                arr[i]=2;
        }
            return arr;
    }
}
