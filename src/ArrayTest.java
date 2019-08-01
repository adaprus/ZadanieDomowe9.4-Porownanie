public class ArrayTest {
    public static void main(String[] args) {
        int[] array1 = {0,1,0};
        int [] array2 = {0,1};

        int[][] array3 = {{0,0},{0,0},{0,0}};
        int[][] array4 = {{0,1},{0,0},{0,0}};


        System.out.println("Czy tablice są takie same? " + ArrayComparator.compare(array1, array2));
        System.out.println();
        System.out.println("Czy tablice są takie same? " + ArrayComparator.compare(array3, array4));
    }
}
