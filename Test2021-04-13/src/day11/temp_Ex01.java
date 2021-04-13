package day11;

import java.util.Scanner;

public class temp_Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] students = null;
		int score = 0;
		int sum=0;
		int max=0;
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			
			if(select==1) {
				System.out.print("학생수 : ");
				int num = scan.nextInt();
				students = new int[num];
			}
			if(select==2) {
				for(int i=0; i<students.length; i++) {
					System.out.println((i+1)+"번째 학생점수 : ");
					score = scan.nextInt();
					students[i] = score;
				}
			}
			if(select==3) {
				for(int i=0; i<students.length; i++) {
					System.out.println((i+1)+"번째 학생점수 : "+ students[i]);
				}
			}
			if(select==4) {
				for(int i=0; i<students.length; i++) {
					sum+=students[i];
					if(max<students[i]) {
						max=students[i];
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균줌수 : " + (sum/students.length));
				for(int i=0; i<students.length; i++) {
					for(int j=i+1; i<students.length; j++) {
						if(students[i] < students[j]) {
							int swap = students[i];
							students[i] = students[j];
							students[j] = swap;
						}
					}
				}
				
				for(int i=0; i<students.length; i++) {
					System.out.println(students[i]);
				}
			}
			if(select==5) {
				System.out.println("종료");
				run = false;
			}
		}

		
		
		
		
		
		
		
		
		
	}

}
