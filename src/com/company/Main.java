package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public  static String reverse(String str){
        String reverseStr="";
        for (int i=str.length()-1;i>=0;i--){
            reverseStr+=str.charAt(i);
        }
        return reverseStr;
    }

    public static void fizzBuzz(){
        for(int i=1; i<=100;i++){
            if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static int mostFrequentItemInArray(int[] array){
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();

        for(int arr:array){
            if(map.containsKey(arr)){
                map.put(arr, map.get(arr)+1);
            }else{
                map.put(arr,1);
            }
        }
        System.out.println(map);

        int maxItem=0;
        int max= 0;

        for (int item:map.keySet()){

            if(map.get(item) > max){
                max=map.get(item);
                maxItem = item;
            }
        }
        return maxItem;
    }

    public static void main(String[] args) {
        String str1 = "I reverse the string";
        System.out.println(reverse(str1));
        fizzBuzz();
        int[] arr1 = {1, 3, 2, 1, 4, 1};
        System.out.println(mostFrequentItemInArray(arr1));
        int[] arr2= {10, 20, 10, 20, 30, 20, 20};
        System.out.println(mostFrequentItemInArray(arr2));


	// write your code here
    }
}
