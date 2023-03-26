package Q2;

import org.springframework.context.ApplicationContext;

public class Q2 {

    public Q2(){
        //psvm




        // VV we can explicitly pass the algo
        IndexFinder1 indexFinder = new IndexFinder1(new Bsearch()) ;
        int[] arr = new int[]{1,2,3,4,5,6,7} ;

        System.out.println(indexFinder.finder(arr , 3) );



    }
}
