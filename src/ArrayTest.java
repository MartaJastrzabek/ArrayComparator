public class ArrayTest {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9};
        int[] tab2 = {1,2,3,4,5,6,7,8,9};
        int[] tab3 = {1,2,3,4,5,6,7};
        int[] tab4 = {7,8,9,4,5,6,1,2,3};
        int[] tab5 = {};
        int[][] tab6 = {
                {1,2,3},
                {3,4,5}
        };
        int[][] tab7 = {
                {1,2,3},
                {3,4,5}
        };

        int[][] tab8 = {
                {4,5,6},
                {6,5,4}
        };

        int[][] tab9 = {
                {4,5,6},
                {6,5}
        };




        System.out.println(ArrayComparator.compare(tab,tab2));
        System.out.println(ArrayComparator.compare(tab,tab3));
        System.out.println(ArrayComparator.compare(tab,tab4));
        System.out.println(ArrayComparator.compare(tab,tab5));
        System.out.println(ArrayComparator.compare(tab8,tab6));
        System.out.println(ArrayComparator.compare(tab6,tab7));
        System.out.println(ArrayComparator.compare(tab8,tab9));


    }
}
