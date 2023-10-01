package AssignmentOne;
import java.util.Scanner;
public class Question28 {
	static void SortArr(int n,int [] arr) {
		System.out.println("The unsorted array is: ");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+ ", ");}
		System.out.println(" ");
		
		for(int i=0;i<n-1;i++) {
			int temp;
			if(arr[0]>arr[1]) {
				temp = arr[0];
				arr[0]=arr[1];
				arr[1]=temp;}
			else if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;}}
		System.out.print("The sorted array is: ");
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+", ");}
		System.out.println(" ");}
	static void KSmallest(int k, int n, int []arr) {
		int temp;
		System.out.println("The k smallest value is: "+arr[k]);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements for an array: ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i =0;i<n;i++) {
			System.out.println("Enter value at index: "+ i);
			arr[i] = sc.nextInt ();
		}
		SortArr(n,arr);
		System.out.println("Enter the index number for k smallest number: ");
		int k = sc.nextInt();
		KSmallest(k, n, arr);
	}
}
