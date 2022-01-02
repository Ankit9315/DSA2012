package DSAFUNDAMENTALS;

import java.util.Scanner;

public class sqrt {
public static int Squareroot(int a) {
	int low=0;
	int high=a/2;
	if(a==0) {
		return 0;
	}if(a==1) {
		return 1;
	}
	while(low<=high) {
		int mid=low+(low+high)/2;
		int square=mid*mid;
		if(square==a) {
			return mid;
		}
		else if(square>a) {
			high=mid-1;
		}else {
			low=mid+1;
		}
	}
	return high;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(Squareroot(a));

	}

}
