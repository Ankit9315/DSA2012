package DSAFUNDAMENTALS;

import java.util.Scanner;

public class frequency {
	public static void sort(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
	}
	public static void printfreq(int arr[],int n) {
		int freq=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				freq++;
			}
			else {
				System.out.println("Frequency of "+arr[i-1]+" is: "+freq);
				freq=1;
			}
		}
		System.out.println("Frequency of "+arr[n-1]+"is: "+freq);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		printfreq(arr,n);
	}

}
