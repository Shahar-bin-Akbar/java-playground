package video_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class array {
  
  public static void main(String[] args) {
    Random rand = new Random();

    //multi dimensional array on primitive type arrays
    //------------------------------------------------
    int[][] arr = new int[2][1];
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = rand.nextInt(20);
      }
    }

    for (int row = 0; row < arr.length; row++) {
      //System.out.println(Arrays.toString(arr[row])); 
    }
    //--------------------------------------------

    //multi dimensional array on arraylist classes
    //------------------------------------------------
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      list.add(new ArrayList<>());
    }

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size(); j++) {
        list.get(i).add(rand.nextInt(20));
      }
    }
     //System.out.println(list);

     //-------------------------------------------

     //Checking the methods
     //--------------------
     int[] array = new int[8];
     for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(50);
     }
     System.out.println(Arrays.toString(array));
     reverseTheArray(array);
     System.out.println(Arrays.toString(array));
  }

  static void swap(int[] arr,int i1,int i2){
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;

  }

  static int max(int[] arr){
    if(arr.length < 1){
      return 0;
    }
    int max = arr[0];
    if(arr.length > 1){
      for (int i = 0; i < arr.length; i++) {
        if(arr[i] > max){
          max = arr[i];
        }
      }
    } 
    return max;
  }

  static int findMaxBwtheArray(int[] arr,int start,int end){
    if(arr.length < 1){
      return 0;
    }
    int max = start;
    for (int i = start; i <= end; i++) {
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }

  static void reverseTheArray(int[] arr){
  int start = 0;
  int end = arr.length - 1;
   
  while(start < end){
    swap(arr, start, end);
    start++;
    end--;
  }
  }
}
