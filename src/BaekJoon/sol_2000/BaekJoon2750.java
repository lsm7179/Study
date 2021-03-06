package BaekJoon.sol_2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2750 {
    static int[] array;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        insertionSort();
        printArray();
    }

    public static void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int aux = i - 1;
            while (aux >= 0 && (array[aux] > temp)) {
                array[aux + 1] = array[aux];
                aux--;
            }
            array[aux + 1] = temp;
        }
    }

    public static void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    private static void printArray() {
        for (int i : array) {
            System.out.println(i);
        }
    }


}