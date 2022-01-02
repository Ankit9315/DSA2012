package DSAFUNDAMENTALS;

import java.util.Scanner;

public class binarysearch {
public static int binarysearching(int []arr,int target) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=start+(start+end)/2;
		if(arr[mid]==target) {
			return mid;
		}else if(target<arr[mid]) {
			end=mid-1;
		}else {
			start=mid+1;
		}
	}
	return -1;
}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int target=sc.nextInt();
	System.out.println(binarysearching(arr,target));
	
}
}
