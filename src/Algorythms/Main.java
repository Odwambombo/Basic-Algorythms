package InsertionSort;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,10,6,3,4,9};
        insertion(numbers);
        //mergeSort(numbers);
        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        System.out.println("The binary search found the value at index:");
        System.out.println(binarySearch(numbers,0,numbers.length-1,10));
        System.out.println(linearSearch(numbers, 10));
    }
    private static void insertion(int[] array){
        for (int i =1; i< array.length; i++){
            int key = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
    private static void mergeSort(int[] array){
        int length = array.length;
        if(length <= 1){
            return;
        }
        int middle= length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int j=0;

        for (int i=0; i< length;i++){
            if(i<middle){
                leftArray[i] = array[i];
            }else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArr,int[] rightArr,int[] array){

        int length = array.length;
        int mid = length/2;
        int left = mid;
        int right = length - mid;

        int i=0; int j=0; int k=0;

        while (j < left && k < right){
            if(leftArr[j] > rightArr[k]){
                array[i] = rightArr[k];
                i++;
                k++;
            }else {
                array[i] = leftArr[j];
                i++;
                j++;
            }
        }
        while (k < right){
            array[i] = rightArr[k];
            i++;
            k++;
        }

        while (j < left){
            array[i] = leftArr[j];
            i++;
            j++;
        }

    }
    private static int binarySearch(int arr[], int start, int end, int x) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x) {
                return binarySearch(arr, start, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, end, x);
        }
        return -1;
    }
    public static int linearSearch(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
