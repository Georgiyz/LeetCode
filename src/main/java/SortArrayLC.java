import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SortArrayLC { //todo: make this code recursive
    public void mergeSort(int @NotNull [] unsortedArr){
        int inputLength = unsortedArr.length;

        if(inputLength < 2){
            return;
        }

        int midIndex = unsortedArr.length / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[unsortedArr.length - midIndex]; //uses midIndex to account for odd number of elements case
        int[][] halves = new int[2][];

        for(int i = 0; i < midIndex; i++){//splits into left half
            leftHalf[i] = unsortedArr[i];
        }

        for(int i = midIndex; i < unsortedArr.length; i++){//splits into right half
            rightHalf[i - midIndex] = unsortedArr[i];
        }

        halves[0] = leftHalf;
        halves[1] = rightHalf;

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(halves);
    }


    private int[] merge(int[] @NotNull [] halves){//todo: debug out of bounds
        int[] merged = new int[halves[0].length * 2];

        for(int i = 0; i < halves[0].length * 2 - 1; i++){
            if(halves[0][i] < halves[1][i])//case if left is smaller
                merged[i] = halves[0][i];

            if(halves[0][i] > halves[1][i])//case if right is smaller
                merged[i] = halves[1][i];

            if(halves[0][i] == halves[1][i]){//case where the two entries are equivalent
                merged[i] = halves[0][i];
                merged[i+1] = halves[1][i];
                i++;
            }

        }

        return merged;
    }



}
