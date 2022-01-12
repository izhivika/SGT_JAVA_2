package week1;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMax {

    public static void main(String[] args) {

        System.out.println(thirdMax(new int[]{-10,9,3,2,-3,4,1,5,9}));
        System.out.println(thirdMax(new int[]{1,2}));
        System.out.println(thirdMax(new int[]{6,0,6,2}));

    }

    public static int thirdMax(int[] arr) {

        Set<Integer> numSet = new TreeSet<>();
        // Converting the array into the TreeSet, which is sorted and doesn't have duplicates
        for (Integer num : arr) {
            numSet.add(num);
        }
        int n = numSet.size();
        Integer[] resArr = new Integer[n];
        // Converting the set back to an array, so we can access elements by their indexes
        resArr = numSet.toArray(resArr);
        // Returning the third max number if there is such
        if (resArr.length >= 3) {
            return resArr[resArr.length-3];
            // Returning the max number if the resulting array size is smaller than 3
        } else {
            return resArr[resArr.length-1];
        }
    }
}