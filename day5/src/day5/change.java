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
	
	System.out.println("�ε��� 2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("�ε���1 �Է�:");
	idx1 = sc.nextInt();
	System.out.println("�ε���2 �Է�:");
	idx2 = sc.nextInt();
	
	temp = a[idx1];
	a[idx1] = a[idx2];
	a[idx2] = temp;
	System.out.print("[");
	for(int i=0;i<5;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("]");

	
	
	System.out.println("�� 2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("��1 �Է�:");
	num1 = sc.nextInt();
	System.out.println("��2 �Է�:");
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
