import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting {
    public static int[] fillArray(int n) {
        int[] array = new int[n];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n * 10);
        }
        return array;
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void merge(int array[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = array[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = array[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int array[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(array, l, m);
            sort(array, m + 1, r);

            // Merge the sorted halves
            merge(array, l, m, r);
        }
    }

    public static void mergeSort(int array[]) {
        sort(array, 0, array.length - 1);
    }

    public static void print(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        long data[][] = new long[9][3];
        //bubbleSort
        int arr1[] = fillArray(1000);
        int arr2[] = fillArray(1000);
        int arr3[] = fillArray(5000);
        int arr4[] = fillArray(5000);
        int arr5[] = fillArray(10000);
        int arr6[] = fillArray(10000);
        int arr7[] = fillArray(50000);
        int arr8[] = fillArray(50000);
        int arr9[] = fillArray(100000);
        int arr10[] = fillArray(100000);
        int arr11[] = fillArray(1000000);
        int arr12[] = fillArray(1000000);
        int arr13[] = fillArray(5000000);
        int arr14[] = fillArray(5000000);
        int arr15[] = fillArray(10000000);
        int arr16[] = fillArray(10000000);
        int arr17[] = fillArray(50000000);
        int arr18[] = fillArray(50000000);

        //mergeSort

        int arr1_1[] = arr1.clone();
        int arr2_1[] = arr2.clone();
        int arr3_1[] = arr3.clone();
        int arr4_1[] = arr4.clone();
        int arr5_1[] = arr5.clone();
        int arr6_1[] = arr6.clone();
        int arr7_1[] = arr7.clone();
        int arr8_1[] = arr8.clone();
        int arr9_1[] = arr9.clone();
        int arr10_1[] = arr10.clone();
        int arr11_1[] = arr11.clone();
        int arr12_1[] = arr12.clone();
        int arr13_1[] = arr13.clone();
        int arr14_1[] = arr14.clone();
        int arr15_1[] = arr15.clone();
        int arr16_1[] = arr16.clone();
        int arr17_1[] = arr17.clone();
        int arr18_1[] = arr18.clone();

        //javaSort
        int arr1_2[] = arr1.clone();
        int arr2_2[] = arr2.clone();
        int arr3_2[] = arr3.clone();
        int arr4_2[] = arr4.clone();
        int arr5_2[] = arr5.clone();
        int arr6_2[] = arr6.clone();
        int arr7_2[] = arr7.clone();
        int arr8_2[] = arr8.clone();
        int arr9_2[] = arr9.clone();
        int arr10_2[] = arr10.clone();
        int arr11_2[] = arr11.clone();
        int arr12_2[] = arr12.clone();
        int arr13_2[] = arr13.clone();
        int arr14_2[] = arr14.clone();
        int arr15_2[] = arr15.clone();
        int arr16_2[] = arr16.clone();
        int arr17_2[] = arr17.clone();
        int arr18_2[] = arr18.clone();


        long startTime = System.nanoTime();
        bubbleSort(arr1);
        long finishTime = System.nanoTime() - startTime;
        data[0][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr2);
        finishTime = System.nanoTime() - startTime;
        data[0][0] = (data[0][0]+finishTime) / 2;
        //5mil
        bubbleSort(arr3);
        finishTime = System.nanoTime() - startTime;
        data[1][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr4);
        finishTime = System.nanoTime() - startTime;
        data[1][0] = (data[1][0]+finishTime) / 2;
        //10mil
        bubbleSort(arr5);
        finishTime = System.nanoTime() - startTime;
        data[2][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr6);
        finishTime = System.nanoTime() - startTime;
        data[2][0] = (data[2][0]+finishTime) / 2;
        //50mil
        bubbleSort(arr7);
        finishTime = System.nanoTime() - startTime;
        data[3][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr8);
        finishTime = System.nanoTime() - startTime;
        data[3][0] = (data[3][0]+finishTime) / 2;
        //100mil
        bubbleSort(arr9);
        finishTime = System.nanoTime() - startTime;
        data[4][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr10);
        finishTime = System.nanoTime() - startTime;
        data[4][0] = (data[4][0]+finishTime) / 2;
        //1millon
        bubbleSort(arr11);
        finishTime = System.nanoTime() - startTime;
        data[5][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr12);
        finishTime = System.nanoTime() - startTime;
        data[5][0] = (data[5][0]+finishTime) / 2;
        //5millones
        bubbleSort(arr13);
        finishTime = System.nanoTime() - startTime;
        data[6][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr14);
        finishTime = System.nanoTime() - startTime;
        data[6][0] = (data[6][0]+finishTime) / 2;
        //10Millones
        bubbleSort(arr15);
        finishTime = System.nanoTime() - startTime;
        data[7][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr16);
        finishTime = System.nanoTime() - startTime;
        data[7][0] = (data[7][0]+finishTime) / 2;
        //50millones
        bubbleSort(arr17);
        finishTime = System.nanoTime() - startTime;
        data[8][0] = finishTime;

        startTime = System.nanoTime();
        bubbleSort(arr18);
        finishTime = System.nanoTime() - startTime;
        data[8][0] = (data[8][0]+finishTime) / 2;

            //merges
        //mil
        startTime = System.nanoTime();
        mergeSort(arr1_1);
        finishTime = System.nanoTime() - startTime;
        data[0][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr2_1);
        finishTime = System.nanoTime() - startTime;
        data[0][1] = (data[0][1]+finishTime) / 2;
        //5mil
        startTime = System.nanoTime();
        mergeSort(arr3_1);
        finishTime = System.nanoTime() - startTime;
        data[1][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr4_1);
        finishTime = System.nanoTime() - startTime;
        data[1][1] = (data[1][1]+finishTime) / 2;
        //10mil
        startTime = System.nanoTime();
        mergeSort(arr5_1);
        finishTime = System.nanoTime() - startTime;
        data[2][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr6_1);
        finishTime = System.nanoTime() - startTime;
        data[2][1] = (data[2][1]+finishTime) / 2;
        //50mil
        startTime = System.nanoTime();
        mergeSort(arr7_1);
        finishTime = System.nanoTime() - startTime;
        data[3][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr8_1);
        finishTime = System.nanoTime() - startTime;
        data[3][1] = (data[3][1]+finishTime) / 2;
        //100mil
        startTime = System.nanoTime();
        mergeSort(arr9_1);
        finishTime = System.nanoTime() - startTime;
        data[4][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr10_1);
        finishTime = System.nanoTime() - startTime;
        data[4][1] = (data[4][1]+finishTime) / 2;
        //1millon
        startTime = System.nanoTime();
        mergeSort(arr11_1);
        finishTime = System.nanoTime() - startTime;
        data[5][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr12_1);
        finishTime = System.nanoTime() - startTime;
        data[5][1] = (data[5][1]+finishTime) / 2;
        //5millones
        startTime = System.nanoTime();
        mergeSort(arr13_1);
        finishTime = System.nanoTime() - startTime;
        data[6][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr14_1);
        finishTime = System.nanoTime() - startTime;
        data[6][1] = (data[6][1]+finishTime) / 2;
        //10milones
        startTime = System.nanoTime();
        mergeSort(arr15_1);
        finishTime = System.nanoTime() - startTime;
        data[7][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr16_1);
        finishTime = System.nanoTime() - startTime;
        data[7][1] = (data[7][1]+finishTime) / 2;
        //50millones
        startTime = System.nanoTime();
        mergeSort(arr17_1);
        finishTime = System.nanoTime() - startTime;
        data[8][1] = finishTime;

        startTime = System.nanoTime();
        mergeSort(arr18_1);
        finishTime = System.nanoTime() - startTime;
        data[8][1] = (data[8][1]+finishTime) / 2;


        //javaSorts
            //mil
        startTime = System.nanoTime();
        Arrays.sort(arr1_2);
        finishTime = System.nanoTime() - startTime;
        data[0][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr2_2);
        finishTime = System.nanoTime() - startTime;
        data[0][2] = (data[0][2]+finishTime) / 2;
        //5mil
        startTime = System.nanoTime();
        Arrays.sort(arr3_2);
        finishTime = System.nanoTime() - startTime;
        data[1][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr4_2);
        finishTime = System.nanoTime() - startTime;
        data[1][2] = (data[1][2]+finishTime) / 2;
        //10mil
        startTime = System.nanoTime();
        Arrays.sort(arr5_2);
        finishTime = System.nanoTime() - startTime;
        data[2][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr6_2);
        finishTime = System.nanoTime() - startTime;
        data[2][2] = (data[2][2]+finishTime) / 2;
        //50mil
        startTime = System.nanoTime();
        Arrays.sort(arr7_2);
        finishTime = System.nanoTime() - startTime;
        data[3][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr8);
        finishTime = System.nanoTime() - startTime;
        data[3][2] = (data[3][2]+finishTime) / 2;
        //100mil
        startTime = System.nanoTime();
        Arrays.sort(arr9_2);
        finishTime = System.nanoTime() - startTime;
        data[4][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr10_2);
        finishTime = System.nanoTime() - startTime;
        data[4][2] = (data[4][2]+finishTime) / 2;
        //1millon
        startTime = System.nanoTime();
        Arrays.sort(arr11_2);
        finishTime = System.nanoTime() - startTime;
        data[5][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr12_2);
        finishTime = System.nanoTime() - startTime;
        data[5][2] = (data[5][2]+finishTime) / 2;
        //5millones
        startTime = System.nanoTime();
        Arrays.sort(arr13_2);
        finishTime = System.nanoTime() - startTime;
        data[6][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr14_2);
        finishTime = System.nanoTime() - startTime;
        data[6][2] = (data[6][2]+finishTime) / 2;
        //10millones
        startTime = System.nanoTime();
        Arrays.sort(arr15_2);
        finishTime = System.nanoTime() - startTime;
        data[7][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr16_2);
        finishTime = System.nanoTime() - startTime;
        data[7][2] = (data[7][2]+finishTime) / 2;
        //50millones
        startTime = System.nanoTime();
        Arrays.sort(arr17_2);
        finishTime = System.nanoTime() - startTime;
        data[8][2] = finishTime;

        startTime = System.nanoTime();
        Arrays.sort(arr18_2);
        finishTime = System.nanoTime() - startTime;
        data[8][2] = (data[8][2]+finishTime) / 2;

        //Imprimir Matriz
        for (int x=0; x < data.length; x++) {
            System.out.print("|");
            for (int y=0; y < data[x].length; y++) {
                System.out.print ((data[x][y])/1000);
                if (y!=data[x].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }

        System.out.println("Conclui que JavaSort completa la tarea de manera mas rapida");
        System.out.println("por caracteristicas de la maquina, el programa no se logro ejecutar en menos de 5 minutos");


    }


}
