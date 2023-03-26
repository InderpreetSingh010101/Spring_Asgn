package Q2;

import org.springframework.stereotype.Component;


public class SimpleSearch implements AlgoUsed {

    public int IdxFinder(int[] arr, int ele) {
        for(int  i =0  ; i < arr.length ; i++){
            if(arr[i] == ele)return i ;
        }

        return -1 ;
    }
}
