package Study.sort;

public class Sort {
    static int[] arr = {8, 5, 2, 6, 3, 7, 9, 1, 4};

    public static void main(String[] args) {
        //selectionSort();
        //bubbleSort();
        insertionSort();
        printArray();
    }

    public static void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int aux = i - 1;
            while (aux >= 0 && (arr[aux] > temp)) {
                arr[aux + 1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
    }

    //거품정렬
    public static void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //선택정렬
    public static void selectionSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }

    public static void printArray() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
