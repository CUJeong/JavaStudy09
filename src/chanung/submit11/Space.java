package chanung.submit11;

import java.util.ArrayList;

public class Space extends Thread{

//	1. space 클래스 (Thread)
//	  : 공간 선언
//	  
//	  * 역할
//	  1) n초마다 물체가 내려오는 루프
//	  2) n초마다 bullet과 물체의 위치 비교하여 일치할 때 bullet과 물체 삭제
//	  

		private static String[][] space = new String[10][11];
		private static ArrayList<Integer> snow = new ArrayList<>();
		private static boolean snowIsEmpty = false;
		private static int snowTime = 0;
		private static int snowDownTime = 0;
		private static int snowDelay = 25;
		private static int stage = 1;
		
		public static int getSnowTime() {
			return snowTime;
		}



		public static void setSnowTime(int snowTime) {
			Space.snowTime = snowTime;
		}



		public static int getSnowDownTime() {
			return snowDownTime;
		}



		public static void setSnowDownTime(int snowDownTime) {
			Space.snowDownTime = snowDownTime;
		}



		public static int getStage() {
			return stage;
		}



		public static void setStage(int stage) {
			Space.stage = stage;
		}



		public void run() {
			
			try {
				
				while(!snowIsEmpty && !Airplane.isDie()) {
			
					
				Thread.sleep(100);
				
				if(snowTime <= 200) {
				if(snowTime % snowDelay == 0){					// 2.5초 마다 눈 생성
					snow.add((int)(Math.random()*11));
				}
				snowTime ++;
				}
				
//				for(int i = 0 ; i < space.length; i++) {					// space 변경
//					for(int j = 0 ; j < space[0].length; j++) {
//						if(space[i][j] == "□ ") 
//							space[i][j] = "■ ";
//						else
//							space[i][j] = "□ ";
//					}
//				}
				
				changeSpace(snow, Airplane.getBullet());
			
				for(int i = 0 ; i < space.length; i++) {					// space 출력
					for(int j = 0 ; j < space[0].length; j++) {
						System.out.print(space[i][j]);
					}
					System.out.println();
				}
				
				Airplane.showAirplane(); 
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("< HP : " + Airplane.getHp() + " >");
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				System.out.println("[ 이동 ] <- : 4   /   6 : -> ");
				System.out.println("[ 공격 ]  * : 1 ");
				
			
				System.out.println();
				
				
				
				}
				
				if(snowIsEmpty) {
					System.out.println("========= 클리어! =========");
					System.out.println(" 1. 다음 단계     2. 종료  ");
					stage ++;
				}else {
					System.out.println("========== 패배! ==========");
				}
				
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			
			
			
		}
		
		
		
		public static int getSnowDelay() {
			return snowDelay;
		}



		public static void setSnowDelay(int snowDelay) {
			Space.snowDelay = snowDelay;
		}



		public static ArrayList<Integer> getSnow() {
			return snow;
		}



		public static void setSnow(ArrayList<Integer> snow) {
			Space.snow = snow;
		}



		public static boolean isSnowIsEmpty() {
			return snowIsEmpty;
		}



		public static void setSnowIsEmpty(boolean snowIsEmpty) {
			Space.snowIsEmpty = snowIsEmpty;
		}



		public Space() {													// 기본 space 정의
			for(int i = 0 ; i < space.length; i++) {
				for(int j = 0 ; j < space[0].length; j++) {
					space[i][j] = "□ ";
				}
			}
		
		}
		
		public static void changeSpace (ArrayList<Integer> snow, ArrayList<Integer> bullet) {
			if(snow.isEmpty()) {
				snowIsEmpty = true;
			}
			else {											
				
		
				
				
				if(snowDownTime % 10 == 0) {
				for(int i = 0 ; i < snow.size(); i++) {		// 눈
					if(snow.get(i) >= 110) {
						Airplane.setDie(true);
						
						int snowX = (snow.get(i)-11) % 11;
						int snowY = (snow.get(i)-11) / 11;
						space[snowY][snowX] = "□ ";
						
						snow.remove(i);
					}else {
						int snowX = snow.get(i) % 11;
						int snowY = snow.get(i) / 11;
						space[snowY][snowX] = "■ ";
						if(snowY > 0) {
							space[snowY-1][snowX] = "□ ";
						}
						
						
						
						snow.set(i, snow.get(i)+11);
					}
				}
				}
				snowDownTime++;
				
				for(int i = 0 ; i < bullet.size(); i++) {	// 총알
					if(bullet.get(i) < 0) {
						
						int bulletX = (bullet.get(i)+11) % 11;
						int bulletY = (bullet.get(i)+11) / 11;
						space[bulletY][bulletX] = "□ ";
						
						bullet.remove(i);
					}else {
						
						
						int bulletX = bullet.get(i) % 11;
						int bulletY = bullet.get(i) / 11;
						space[bulletY][bulletX] = "★ ";
						
						if(bulletY < 9) {
							space[bulletY+1][bulletX] = "□ ";
						}

						if(bullet.size() >= snow.size()) {	// snow와 bullet 충돌시 둘 다 삭제 구문 !
							for(int k = 0 ; k < bullet.size(); k++) {
								if(snow.contains(bullet.get(k))) {
									snow.remove(snow.indexOf(bullet.get(k)));
									if(bulletY < 1) {
										space[bulletY][bulletX] = "□ ";
										}
										else {
										space[bulletY-1][bulletX] = "★ ";
										space[bulletY][bulletX] = "□ ";
										}
								}else if(snow.contains(bullet.get(k) + 11)) {
									snow.remove(snow.indexOf(bullet.get(k)+11));
									if(bulletY < 1) {
										space[bulletY][bulletX] = "□ ";
										}
										else {
										space[bulletY-1][bulletX] = "★ ";
										space[bulletY][bulletX] = "□ ";
										}
								}
							}
						}else {
							for(int k = 0 ; k < snow.size(); k++) {
								if(bullet.contains(snow.get(k))) {
									snow.remove(k);
									if(bulletY < 1) {
									space[bulletY][bulletX] = "□ ";
									}
									else {
									space[bulletY-1][bulletX] = "★ ";
									space[bulletY][bulletX] = "□ ";
									}
								}else if(bullet.contains(snow.get(k) -11)) {
									snow.remove(k);
									if(bulletY < 1) {
										space[bulletY][bulletX] = "□ ";
										}
										else {
										space[bulletY-1][bulletX] = "★ ";
										space[bulletY][bulletX] = "□ ";
										}
								}
							}
						}
						
						bullet.set(i, bullet.get(i) - 11);
					
					}
				}
				
			}
		}
		
		
		
		
		
		
		
		
		
		public Space(String[][] space) {
			this.space = space;
		}

		public String[][] getSpace() {
			return space;
		}

		public void setSpace(String[][] space) {
			this.space = space;
		}
		
		
		
		
		
		
		
	
}
