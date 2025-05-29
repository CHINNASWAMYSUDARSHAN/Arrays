

import java.util.Scanner;

public class ThreeDimensional {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc=new Scanner(System.in);
System.out.println("Enter size:");
int size1=sc.nextInt();
System.out.println("Enter size2:");
int size2=sc.nextInt();
System.out.println("Enter size3:");
int size3=sc.nextInt();

String arr[][][]=new String[size1][size2][size3];
System.out.println("Enter values");
for(int i=0;i<size1;i++) {
	for(int j=0;j<size2;j++) {
		for(int k=0;k<size3;k++) {
		arr[i][j][k]=sc.next();
	}
	}
}
System.out.println("The values are");
for(int i=0;i<size1;i++) {
	for(int j=0;j<size2;j++) {
		for(int k=0;k<size3;k++) {
	System.out.print(arr[i][j][k]+" ");
	}
		System.out.println();
	}
}
	}
}