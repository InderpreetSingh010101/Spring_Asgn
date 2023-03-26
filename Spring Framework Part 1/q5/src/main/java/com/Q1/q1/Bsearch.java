package com.Q1.q1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bsearch implements AlgoUsed { // {1,2,3,4,5,6}
    public int IdxFinder(int[] arr , int ele ){
        int low = 0 ;
        int high = arr.length-1 ;
        while(low <= high){
            int mid = (low + high)/2 ;

            if(arr[mid] == ele) return mid ;
            else if (arr[mid] > ele) {
                high = mid - 1 ;
            }else{
                low = mid + 1 ;
            }

        }

        return -1 ;
    }
}
