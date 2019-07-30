public class ArrayTest {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9};
        int[] tab2 = {1,2,3,4,5,6,7,8,9};
        int[] tab3 = {1,2,3,4,5,6,7};
        int[] tab4 = {7,8,9,4,5,6,1,2,3};
        int[] tab5 = {};

        System.out.println(ArrayComparator.compare(tab,tab2));
        System.out.println(ArrayComparator.compare(tab,tab3));
        System.out.println(ArrayComparator.compare(tab,tab4));
        System.out.println(ArrayComparator.compare(tab,tab5));

    }
}
