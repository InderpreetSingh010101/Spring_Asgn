package Q1;

public class Q1 {

    public Q1() {


        System.out.println("Index Finder Of No in array");

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        // Tight Coupling
        IndexFinder indexFinder = new IndexFinder();
        int idx = indexFinder.finder1(arr, 3);
        System.out.println(idx);
    }
}
