package Task3;

public class Sort {

    //BUBBLE SORT
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    int t = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = t;
                }

            }

        }
        return array;

    }

    //SHELL SORT
    public static int[] shellSort(int[] array) {
        for (int i = array.length / 2; i > 0; i = i / 2) {
            for (int j = i; j < array.length; j++) {
                for (int k = j - i; k >= 0; k = k - i) {
                    if (array[k + i] >= array[k]) {
                        break;
                    } else {
                        int t = array[k];
                        array[k] = array[k + i];
                        array[k + i] = t;
                    }
                }
            }
        }
        return array;
    }


    //GNOME SORT
    public static int[] gnomeSort(int array[]) {
        int i = 0;
        while (i < array.length) {
            if (i == 0) {
                i++;
            }
            if (array[i] >= array[i - 1]) {
                i++;
            } else {
                int t = array[i];
                array[i] = array[i - 1];
                array[i - 1] = t;
                i--;
            }
        }
        return array;

    }


    //INSERTION SORT
    public static int[] insertSort(int array[]) {
        for (int i = 1; i < array.length; ++i) {
            int k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = k;
        }
        return array;

    }

}
