package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindFirstRepeatedElement {

public static int secondRepeated(int arr[]){

    HashSet<Integer> set = new HashSet<>();
    for(int i =0; i< arr.length-1;i++){
        int num = arr[i];
        if(set.contains(num)){
            return num;
        }else {
            set.add(num);
        }
    }
    return 0;
   /* int num = 0;
    for(int i =0; i< arr.length-1;i++){
        for(int j = i+1; j< arr.length-1; j++){
            if(arr[i] == arr[j]){
                num = arr[j];
                return num;
            }
        }
    }
    return num;*/
}
    public static void main(String[] args) {
        int arr[] = {2,3,8,7,4,9,0,5,8,7,2};
        System.out.println(secondRepeated(arr));
      /*  HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr){
            Integer count = hm.get(i);
            if(count == null){
                hm.put(i, 1);
            }else {
                hm.put(i, ++count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet){
            if(entry.getValue() > 2){
                System.out.println("Duplicate value = "+ entry.getKey());
            }
        }*/

    }
}
