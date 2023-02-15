package ex7;

import java.util.ArrayList;

public class Searching {

    // 1. solution
//    public int search(String[] arr, String str){
//        for(int i = 0; i < arr.length; i++){
//            if(str.equals(arr[i])){
//                return i;
//            }
//        }
//        return -1;
//    }
    // alternative
    public int search(String[] arr, String str) {
        for(int i = 0; i < arr.length; i++){
            if(str.equals(arr[i])){
                return i;
            }
            if(i == arr.length -1 ){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return -1;

    }
}
