

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,54,342,54,64,34};
		int l,s,sum=0;
		l=arr[0];
		s=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l) {
				l=arr[i];
			}
			if(arr[i]<s) {
				s=arr[i];
			}
			sum+=arr[i];
		}
System.out.println("largest:"+l);
System.out.println("smallest:"+s);
System.out.println("Avg:"+sum/arr.length);
	}

}
