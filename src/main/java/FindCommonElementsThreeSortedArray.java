package main.java;

public class FindCommonElementsThreeSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,4,5,6,7,8,10};
        int arr2[]={2,3,5,7};
        int arr3[]={3,5,7,8,9,10,11};

        commonElement(arr1, arr2, arr3);
    }
    public static void commonElement(int arr1[], int arr2[], int arr3[]){
        int x = 0, y = 0, z = 0;
        while(x < arr1.length && y < arr2.length && z < arr3.length){
            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]){
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
            }else if(arr1[x] > arr2[y]){
                y++;
            }else if(arr2[y] > arr3[z]){
                z++;
            }else {
                x++;
            }
        }
    }
    /*public static void commonElement(int arr1[], int arr2[], int arr3[]){
        for(int i = 0; i < arr1.length; i++){
            for(int j =0; j < arr2.length; j++){
                for(int k = 0; j < arr3.length; k++){
                    if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }*/
}
