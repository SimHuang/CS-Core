package Sort;

/**
 * Created by Simon on 5/8/17.
 */
public class SortMain {

    public static void main(String[] args) {
        int[] unsorted = {4,10,2,1,3,15,7,1,6,99};

        //selection sort
//		int[] sorted = selectionSort(unsorted);
//		for(int i = 0; i < sorted.length; i++) {
//			System.out.println(sorted[i]);
//		}

        //bubble sort
//        int[] bubbleSorted = bubbleSort(unsorted);
//        for(int i = 0; i < bubbleSorted.length; i++) {
//            System.out.println(bubbleSorted[i]);
//        }

        //insertion sort
        int[] insertSorted = insertionSort(unsorted);
        for(int i = 0; i < insertSorted.length; i++) {
            System.out.println(insertSorted[i]);
        }

    }

    /**
     * Selection sort Implementation
     * @param list array to be sorted
     * @return
     * 	return sorted list
     */
    public  static int[] selectionSort(int[] list) {
        int minIndex = 0, min = 0;
        for(int i = 0; i < list.length; i++) {
//			minIndex = i;
            min = list[i];
            for(int j = i + 1; j < list.length; j++) {
                if(list[j] < min) {
                    min = list[j];
                    minIndex = j;

                }
            }
            //swap
            int temp = min;
            list[minIndex] = list[i];
            list[i] = temp;
        }
        return list;
    }

    /**
     * Bubble sort implementation. Each iteration the largest number
     * is pushed to the back
     */
    public static int[] bubbleSort(int[] list){
        for(int i = list.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    /**
     * Insertion Sort Implementation
     * This uses a for loop implementation, the normal way use a while loop
     */
    public static int[] insertionSort(int[] list) {
        for(int i = 0; i < list.length; i++) {	//responsible for looping through entire list
            int currentNum = list[i];
            for(int j = 0; j < i; j++) {	//looking through to see if number should be sorted
                if(currentNum < list[j]) {  //currentNum should be sorted at a earlier position
                    int indexToPut = j;
                    int numToPut = list[i];
                    for(int k = i - 1; k >= j; k--) {   //move all required elements one element to the right
                        list[k + 1] = list[k];
                    }
                    list[indexToPut] = numToPut;
                    break;
                }
            }
        }
        return list;
    }

    /**
     * Merge Sort Implementation
     */
    public static int[] mergeSort(int[] list) {
        return list;
    }
}
