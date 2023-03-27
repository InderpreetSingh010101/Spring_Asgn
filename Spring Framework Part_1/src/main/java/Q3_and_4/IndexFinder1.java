package Q3_and_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexFinder1 {

    private AlgoUsed algoUsed ;
    @Autowired
    public IndexFinder1(AlgoUsed algoUsed){
        this.algoUsed = algoUsed ;
    }

    public int finder(int[] arr , int ele){

        int res = algoUsed.IdxFinder(arr , ele) ;
      return  res ;

    }
}
