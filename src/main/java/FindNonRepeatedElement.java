package main.java;

public class FindNonRepeatedElement {

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5};
        int res =0;
        for(int i : arr){
        res = res ^= i;
        }
        System.out.println(res);
    }
}
