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
		System.out.println("[1] 추가");
		System.out.println("[2] 삭제");
		System.out.println("[3] 삽입");
		System.out.println("[0] 종료");
		
		System.out.println("메뉴 선택:");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("추가할 값 입력:");
			int add = sc.nextInt();
			
		}
		
	}
	}

}
