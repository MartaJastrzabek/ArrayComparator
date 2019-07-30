public class ArrayComparator {
    public static boolean compare(int[] array, int[] array2){
        if(array.length==0 || array2.length == 0){
            System.out.print("Błąd pusta tablica, ");
            return false;
        }

        if(array.length!=array2.length){
            return false;
        }

        for (int i = 0; i<array.length; i++){
            if(array[i]!=array2[i]){
                return false;
            }
        }

        return true;
    }
}
