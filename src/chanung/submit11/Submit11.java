package chanung.submit11;

import java.util.Scanner;

public class Submit11 {
	
	public static Airplane airplane = new Airplane();

	public static void main(String[] args) throws InterruptedException {
		/* 
		 
		 	1. space 클래스 (Thread)
		 	  : 공간 선언
		 	  
		 	  * 역할
		 	  1) n초마다 물체가 내려오는 루프
		 	  2) n초마다 bullet과 물체의 위치 비교하여 일치할 때 bullet과 물체 삭제
		 	  
		 	2. snow
		 	  : 눈
		 	  
		 	  * 역할
		 	  1) n초마다 ( x / y ) 값의 눈을 생성하는 리스트
		 	  2) m초마다 기존 눈의 ( x / y )  y값 플러스
		 	  
		 	3. bullet
		 	  : 총알
		 	  
		 	  * 역할
		 	  1) airplane의 위치를 전달받는 리스트   ( x / y )
		 	  2) y만 마이너스 되면서 space를 채움
		 	
		 	4. airplane
		 	  : 비행기
		 	  
		 	  * 역할
		 	  1) while + scan으로
		 	  2) 방향키 -> 위치 이동
		 	  3) 공격키 -> bullet에 위치 전달
		 	  4) space에 물체가 없다면 종료됨
		 
		 */

		
		
		System.out.println("===============================");
		System.out.println("=         비행기 게임         =");
		System.out.println("===============================");
		System.out.println();
		System.out.println("   1. 시작하기     2. 종료     ");
		
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		
		if(input == 1) {
			
			Space space = new Space();
			space.start();
			
			airplane.start();
			
		}else if(input == 2) {
			return;
		}
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
