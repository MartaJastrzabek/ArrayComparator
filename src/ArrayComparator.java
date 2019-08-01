public class ArrayComparator {
    public static boolean compare(int[] array, int[] array2){
        if(check(array,array2)){
            for (int i = 0; i<array.length; i++){
                if(array[i]!=array2[i]){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static boolean compare(int[][] array, int[][] array2){
        for(int i = 0; i<array.length; i++){
            if (check(array[i], array2[i])) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != array2[i][j]) {
                        return false;
                    }
                }
            }else {
                return false;
            }
        }
        return true;
    }

    private static boolean check(int[] array, int[] array2){
        if(array.length==0 || array2.length == 0){
            System.out.print("Błąd pusta tablica, ");
            return false;
        }else if (array.length!=array2.length){
            System.out.print("Błąd tablice mają różny rozmiar, ");
            return false;
        } else {
            return true;
        }
    }

}
