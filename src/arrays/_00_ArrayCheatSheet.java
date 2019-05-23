package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] grades = {"bad","good", "okay", "pretty good", "terrible"};
		
		//2. print the third element in the array
		System.out.println(grades[2]);
		//3. set the third element to a different value
		grades[2] = "perfect";
		//4. print the third element again
		System.out.println(grades[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
		}
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		 Random randy = new Random();
		for(int i=0; i < nums.length; i++) {
		nums[i] = randy.nextInt(100);
		
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = nums[0];
		for(int i = 1; i<nums.length; i++) {
			if(nums[i]< smallest)
			smallest = nums[i];
			}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i < nums.length; i++) {
		System.out.println(nums[i]);
		}
		//10. print the largest number in the array.
		int largest = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i]>largest) {
				largest = nums[i];
			}
		}
		System.out.println(largest);
		}
}
