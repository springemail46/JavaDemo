package main.java;

public class FindMaxDiference {

    public static void main(String[] args) {
        int arr[]={3,8,4,9,5,9,6,12};
        int maxDiff = arr[1]- arr[0];
        int minDiff = arr[0];

        for(int i =0; i< arr.length; i++){
            if((arr[i]-minDiff) > maxDiff){
                maxDiff = arr[i]-minDiff;
            }
            if(arr[i] < minDiff){
                minDiff = arr[i];
            }

        }
        System.out.println(maxDiff);

       /* int max=0;
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    max = Math.max(max, arr[j]-arr[i]);
                }
            }
        }
        System.out.println(max);*/
    }
}
