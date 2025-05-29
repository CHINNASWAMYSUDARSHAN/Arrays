
import java.util.Scanner;
public class OneDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int size=sc.nextInt();
		String arr[]=new String[size];
		System.out.println("Enter "+size+" values");
		for(int i=0;i<size;i++){
		arr[i]=sc.next();
		}
		for(String name:arr){
		System.out.print(name+" ");
		}
	}

}





