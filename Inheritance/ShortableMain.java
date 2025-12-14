// Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers in descending order. Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method

import java.util.*;
public class ShortableMain {
    public static void main(String[] rounak) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements in an array : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        Sortable s = new QuickSort();
        Sortable s1 = new MergeSort();

        long start = System.nanoTime();

        System.out.println("Quick Sort : " + Arrays.toString(s.sort(arr1)));
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("Time taken for Quick Sort " + duration);


        long start1 = System.nanoTime();
        System.out.println("Merge Sort : "+ Arrays.toString(s1.sort(arr2)));
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;
        System.out.println("Time taken for Merge Sort " + duration1);

        sc.close();

    }
}

interface Sortable{
    int[] sort(int[] array);
}

class QuickSort implements Sortable{

    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] > pivot) {   // descending
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
    

}
class MergeSort implements Sortable{
    public int[] sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {   // descending
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1)
            array[k++] = L[i++];

        while (j < n2)
            array[k++] = R[j++];
    }

}
