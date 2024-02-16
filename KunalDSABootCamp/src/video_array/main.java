package video_array;

import java.util.Arrays;

class main{
    public static void main(String[] args) {
        int[][] toDArr = {
            {1,3},
            {2,3},
            {2,5,6}
        };
        System.out.println(toDArr[2].length);
        int[] arr = {1,2,3,4,5,6};
        //int[] reversedArry = new int[arr.length];
        for(int i = arr.length - 1,j=0;i>=0;i--,j++){
           arr[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
