

import java.util.Scanner;

public class Threejaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size to organization");
		int size=sc.nextInt();
		String arr[][][]=new String[size][][];
		for(int i=0;i<size;i++) {
			System.out.println("Enter size to comapany:");
			arr[i]=new String[sc.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter size of employee");
			arr[i][j]=new String[sc.nextInt()];
			}
		}
		System.out.println("Enter values to array:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				arr[i][j][k]=sc.next();
			}
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.print(arr[i][j][k]+" ");
			}
				System.out.println();
			}
		}
	}

}
