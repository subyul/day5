package day5;
import java.util.Scanner;
public class control {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr = {10,20,0,0,0};
		int count = 2;
		
	while(true) {
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("[1] �߰�");
		System.out.println("[2] ����");
		System.out.println("[3] ����");
		System.out.println("[0] ����");
		
		System.out.println("�޴� ����:");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("�߰��� �� �Է�:");
			int add = sc.nextInt();
			
		}
		
	}
	}

}
