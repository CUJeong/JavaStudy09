package chanung.submit11;

import java.util.ArrayList;
import java.util.Scanner;

public class Airplane extends Thread {
		private static String[][] airplane = new String[1][11];
		private static ArrayList<Integer> bullet = new ArrayList<>();
		private static boolean isDie = false;
		private static int hp = 3;
		
		
		
		
		
		
		public static int getHp() {
			return hp;
		}

		public static void setHp(int hp) {
			Airplane.hp = hp;
		}

		public static boolean isDie() {
			return isDie;
		}

		public static void setDie(boolean isDie) {
			hp--;
			if(hp == 0)
				Airplane.isDie = isDie;
		}

		public Airplane() {
			for(int i = 0 ; i < airplane.length; i ++) {
				for(int j = 0 ; j < airplane[i].length; j ++) {
					if (i == 0 && j == 5) {
						airplane[i][j] = "▲ ";
					}else {
						airplane[i][j] = "  ";
					}
				}
			}
		}
		
		public Airplane(String[][] airplane) {
			this.airplane = airplane;
		}


		public String[][] getAirplane() {
			return airplane;
		}


		public void setAirplane(String[][] airplane) {
			this.airplane = airplane;
		}
		
		public static void showAirplane() {
			
			for(int i = 0 ; i < airplane.length; i++) {					// space 출력
				for(int j = 0 ; j < airplane[0].length; j++) {
					System.out.print(airplane[i][j]);
				}
				System.out.println();
			}
			
		}
		
		public static ArrayList<Integer> getBullet() {
			return bullet;
		}

		public static void setBullet(ArrayList<Integer> bullet) {
			Airplane.bullet = bullet;
		}

		public static void moveAirplane(String direction) {
			if (direction == "left") { // left
				for(int i = 0 ; i < airplane.length ; i ++) {
					for(int j = 0 ; j < airplane[i].length; j ++) {
						if(airplane[i][j] == "▲ ") {
							airplane[i][j-1] = "▲ ";
							airplane[i][j] = "  ";
						}
					}
				}
			}else if(direction == "right"){ // right
				for(int i = airplane.length-1 ; i >= 0 ; i --) {
					for(int j = airplane[i].length-1 ; j >= 0; j --) {
						if(airplane[i][j] == "▲ ") {
							airplane[i][j+1] = "▲ ";
							airplane[i][j] = "  ";
						}
					}
				}
			}
		}
		
		public void run() {
			
				
			Scanner scan = new Scanner(System.in);
			
				while(!isDie) {
					
					if(Space.getStage() == 2) {
						System.out.println(" stage 2 를 실행하시겠습니까?");
						System.out.println("   1. 시작하기     2. 종료   ");
						System.out.print(">>>");
						int input = Integer.parseInt(scan.nextLine());
						
						if(input == 1) {
							Space space2 = new Space();
							space2.setSnowDelay(15);
							space2.setSnowIsEmpty(false);
							space2.setSnowTime(0);
							space2.start();
							bullet.clear();
							Space.setStage(3);
						}else if(input == 2) {
							return;
						}
						
						
						
					}
					
					int input = Integer.parseInt(scan.nextLine());
					
					if(input == 4) {
						moveAirplane("left");
					}else if(input == 6) {
						moveAirplane("right");
					}else if(input == 1) {
						for(int i = 0; i < airplane[0].length; i++) {
							if(airplane[0][i] == "▲ ")
								bullet.add(i + 99);
						}
					}else if(input == 2){
						return;
					}
					else{
					
						continue;
					}
				}
		}


		
		
		
}
