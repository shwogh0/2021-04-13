package day11;

import java.util.Scanner;

public class Ex01_ArrayStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int sum = 0; //총합
		int score = 0; // 점수
		int max = 0; //최댓값
		int num = 0; //학생수 결정
		int select = 0; // 선택
		int student[] = null; //학생수 // 배열 이름만 선언한 것 (크기나 데이터에 대한 것은 전혀 없음.)
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			select = scan.nextInt();
			
			if(select==1) {
				System.out.print("학생수> ");
				num = scan.nextInt();
				student = new int[num]; //배열 분리 선언 핵심 부분임
				}
			if(select==2) {
				for(int i=0; i<num;i++) { 
					System.out.print((i+1) + "번 째 학생점수 : ");
					score = scan.nextInt();
					student[i] = score;
					}
			}
			if(select==3) {
				for(int i=0; i<student.length; i++) {
					System.out.println((i+1) + "번 째 학생점수 : " + student[i]);
				}
			}
			if(select==4) {
				for(int i=0; i<student.length; i++) {
					sum += student[i];
					if(max<student[i]) {
						max=student[i];
					}
				}
				for(int i=0; i<student.length; i++) {
				for(int j= i+1; j<student.length; j++) {
					if(student[i]<student[j]) {
						int swap = student[i];
						student[i] = student[j];
						student[j] = swap;
						}
					}
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (sum/student.length));
				for(int i=0; i<student.length;i++) {
					System.out.println(student[i]);
				}
				
			}
			if(select==5) {
				System.out.println("종료");
				run = false;
			}
			
			
			
			
		}

	}

}
