
import java.util.Scanner;
public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  sc=new Scanner(System.in);
System.out.println("Enter size for one d");
int size1=sc.nextInt();
System.out.println("Enter size for two d");
int size2=sc.nextInt();
String arr[][]=new String[size1][size2];
System.out.println("Enter values");
for(int i=0;i<size1;i++) {
	for(int j=0;j<size2;j++) {
		arr[i][j]=sc.next();
	}
	
}
System.out.println("The values are");
for(int i=0;i<size1;i++) {
	for(int j=0;j<size2;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
	}

}
