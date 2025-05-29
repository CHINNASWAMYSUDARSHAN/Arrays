

public class ArrayRev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,54,345,23,7,9};
		int temp,j=0;
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		System.out.println("The reversed array");
for(int k=0;k<arr.length;k++) {
	System.out.print(arr[k]+" ");
}
	}

}
