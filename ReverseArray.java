package assignment;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		String[] ar= {"a","d","e","f","h","g","r"};
		 String[] arr={"a","d","e","f","h","g","i","j"};
		for(int i=0;i<arr.length/2;i++)
		{
			String temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
