

import java.util.Scanner;

public class swap_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter values to array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Values of array:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	
		System.out.println("Enter size to swap:");
		int swap=sc.nextInt();
		int temp,j=0;
		
		for(int i=swap;i>0;i--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		System.out.println("After first swap:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
		temp=arr.length-1;
		for(int i=swap;i<arr.length/2;i++) {
			arr[i]=arr[temp];
			temp--;
		}
		System.out.println("After second swap:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
		
		
		j=0;
		for(int i=arr.length-1;i>0;i--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		System.out.println("Final swap:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
