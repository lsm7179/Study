package Study.sort;

public class Sort {
    static int[] array = {8,5,2,6,3,7,9,1,4};
    public static void main(String[] args) {
        selectionSort();
        printArray();
    }

    //선택정렬
    public static void selectionSort(){
        for (int i = 0; i < array.length-1; i++) {
            int indexMin=i;
            for (int j = i+1; j < array.length; j++) {
                if(array[indexMin]>array[j]){
                    indexMin=j;
                }
            }
            int temp=array[i];
            array[i]=array[indexMin];
            array[indexMin]=temp;
        }
    }

    public static void printArray(){
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
