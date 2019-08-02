public class ArrayTest {
    public static void main(String[] args) {


        int[] tab1 = null;
        int[] tab2 = {1,2,3,4,5,6,7,8,9};
        int[][] tab3 = {{1,2},{3,4},{5,6},{7,8}};
        int[][] tab4 = {{1,2},{3,4},{5,6}};

        int[][] tab5 = null;
        int[][] tab6 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        System.out.println(ArrayComparator.compare(tab1,tab2));
        System.out.println(ArrayComparator.compare(tab5,tab6));
        System.out.println(ArrayComparator.compare(tab3,tab4));



    }
}
