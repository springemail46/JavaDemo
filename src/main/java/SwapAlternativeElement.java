package main.java;

public class SwapAlternativeElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int i =0, len=arr.length;
        int t;
        for(i =1; i < len-1; i++){
            t = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = t;
            ++i;
        }
        /*while(i < len-1){
            t = arr[i];
            arr[i] = arr[i+1];
            arr[i + 1] = t;
            i = i + 2;
        }*/
        for(int a =0; a< arr.length; a++){
            System.out.println(arr[a]);
        }
        /* i = 0;
        while (i < 6 - 1) {
            t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
            i = i + 2;
        }

        System.out.print("After swap list are:");
        for (i = 0; i < 6; i++) {
            System.out.print(" " + arr[i]);
        }*/
    }
}
