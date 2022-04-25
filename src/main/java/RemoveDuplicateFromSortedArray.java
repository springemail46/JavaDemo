package main.java;

import java.util.HashMap;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2,2,4,5,5,7,8,8};
        removeDup(arr);
        /*int j = 0;
       for(int i =0; i< arr.length-1; i++){
           if(arr[i] != arr[i+1]){
               arr[j++] = arr[i];
           }
       }
       arr[j++] = arr[arr.length-1];
       for(int i =0; i< j; i++){
           System.out.println(arr[i]);
       }*/
    }
    public static void removeDup(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else {
                map.put(arr[i], 1);
            }
        }
       /* map.forEach((k,v)->{ // this will print only duplicate
            if(v > 1){
                System.out.println(k);
            }
        });*/
        map.forEach((k,v) -> System.out.println(k)); //unique elements
    }
}
