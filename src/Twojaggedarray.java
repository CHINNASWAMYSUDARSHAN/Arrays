

import java.util.Scanner;

public class Twojaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size to company");
		int size=sc.nextInt();
		String arr[][]=new String[size][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter size to employee:");
			arr[i]=new String[sc.nextInt()];
		}
		System.out.println("Enter values to array:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.next();
			}
		}
		System.out.println("values of array:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
