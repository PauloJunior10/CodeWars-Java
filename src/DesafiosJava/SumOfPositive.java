//this challenge is found at https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

/* You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0. */

package DesafiosJava;

public class SumOfPositive{

	  public static int sum(int[] arr){
		  int soma = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                soma += arr[i];
	            }
	        }
	        return soma;
	  }

	    public static void main(String[] args) {
	        int[] arr = {1, -4, 7, 12};
	        int somaPositivos = sum(arr);
	        System.out.println("A soma dos positivos é: " + somaPositivos);
	    }
	}