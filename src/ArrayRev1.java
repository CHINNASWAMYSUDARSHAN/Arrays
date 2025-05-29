
import  java.util.Scanner;
public class ArrayRev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("The values are:");
for(int i=0;i<size;i++) {
	System.out.print(arr[i]+" ");
}
int Rev[]=new int[arr.length];
int k=0;
for(int j=arr.length-1;j>=0;j--){
Rev[k]=arr[j];
k++;
}
System.out.println("The reversed array:");
for(int name:Rev) {
	System.out.print(name+" ");
}
	}

}
