public class ArrayComparator {

    public static boolean checkIfEmpty(int[] array) {
        boolean isEmpty = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                isEmpty = true;
            } else {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public static boolean checkIfEmpty(int[][] array1) {
        boolean isEmpty = true;

        for (int i = 0; i < array1.length; i++) {
            if (isEmpty) {
                for (int j = 0; j < array1[i].length; j++) {
                    if (array1[i][j] == 0) {
                        isEmpty = true;
                    } else {
                        isEmpty = false;
                        break;
                    }
                }
            } else {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public static boolean checkSize(int[][] array1, int[][] array2) {
        boolean isSameSize = true;

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i].length == array2[i].length) {
                    isSameSize = true;
                } else {
                    isSameSize = false;
                    break;
                }
            }
        }
        return isSameSize;
    }

    public static boolean compare(int[] array1, int[] array2) {
        boolean isTheSame = false;
        boolean isEmpty = checkIfEmpty(array1) || checkIfEmpty(array2);

        while (isEmpty) {
            System.out.println("Tablica jest pusta, wprowadź poprawną tablicę");
            return false;
        }

        if (!isEmpty) {
            if (array1.length == array2.length) {
                for (int i = 0; i < array1.length; i++) {
                    if (array1[i] == array2[i]) {
                        isTheSame = true;
                    } else {
                        isTheSame = false;
                        break;
                    }
                }
            } else {
                isTheSame = false;
            }
        } else {
            System.out.println("Tablica jest pusta");
        }
        return isTheSame;
    }

    public static boolean compare(int[][] array1, int[][] array2) {
        boolean isTheSame = true;
        boolean isSameSize = checkSize(array1, array2);
        boolean isEmpty = checkIfEmpty(array1) || checkIfEmpty(array2);

        while (isEmpty) {
            System.out.println("Tablica jest pusta, wprowadź poprawną tablicę");
            return false;
        }

        if (isTheSame && isSameSize) {
            for (int i = 0; i < array1.length; i++) {
                if (isTheSame) {
                    for (int j = 0; j < array1[i].length; j++) {
                        if (array1[i][j] == array2[i][j]) {
                            isTheSame = true;
                        } else {
                            isTheSame = false;
                            break;
                        }
                    }
                } else {
                    isTheSame = false;
                    break;
                }
            }
        } else {
            isTheSame = false;
        }
        return isTheSame;
    }
}


