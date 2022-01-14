package day5;
import java.util.Scanner;
public class change {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int [] a = {10, 20, 30, 40, 50};
	int idx1 = 0;
	int idx2 = 0;
	int temp = 0;
	int num1 = 0;
	int num2 = 0;
	int temp2 = 0;
	
	System.out.println("인덱스 2개를 입력받아 값 교체하기");
	System.out.println("인덱스1 입력:");
	idx1 = sc.nextInt();
	System.out.println("인덱스2 입력:");
	idx2 = sc.nextInt();
	
	temp = a[idx1];
	a[idx1] = a[idx2];
	a[idx2] = temp;
	System.out.print("[");
	for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("]");

	
	
	System.out.println("값 2개를 입력받아 값 교체하기");
	System.out.println("값1 입력:");
	num1 = sc.nextInt();
	System.out.println("값2 입력:");
	num2 = sc.nextInt();
	
	
	int check1 = 0;
	int check2 = 0;
	System.out.print("[");
	for(int i = 0; i<5;i++) {
		
		if(a[i]==num1){
			check1 = i;
		}
		if(a[i]==num2) {
			check2 = i;
		}

	}
	temp2 = a[check1];
	a[check1] = a[check2];
	a[check2] = temp2;
	
	for(int i = 0; i<5; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.print("]");
	
}
}
