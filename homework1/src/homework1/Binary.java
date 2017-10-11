package homework1;

public class Binary {//Бинарный поиск
    public static void binarysearch(int val) {
        int[] arr = Main.numArrsorted;
        System.out.println("Номер элемента: "+ rank(val, arr));
    }

    public static int rank(int val, int[] arr) {
        return rank(val, arr, 0, arr.length-1);
    }

    private static int rank(int val, int[] arr, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (val < arr[mid]) {
            return rank(val, arr, lo, mid - 1);
        } else if (val > arr[mid]) {
            return rank(val, arr, mid + 1, hi);
        } else {
            return mid+1;
        }
    }
}
