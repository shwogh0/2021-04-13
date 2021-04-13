package day11;

public class peopleMain {

	public static void main(String[] args) {
		// peopleMain 클래스에서 people 클래스를 객체로 만들어 활용
		
		// people 클래스 객체 선언
		people p = new people(); // 객체로만들클래스이름 현재파일에서쓸객체이름 = new 해당클래스가가지고있는생성자()
														// 해당클래스가 별도의 생성자를 정의하고 있지 않다면 기본생성자를 사용함

		// 객체로 선언한 클래스가 가지고 있는 자원(필드, 메소드) 활용
		// people 클래스가 가지고 있는 필드에 값 저장 및 출력
		p.name = "이름1"; //p 필드에 있는 name을 쓴다
		System.out.println(p.name);
		p.age = 10;
		System.out.println(p.age);
		
		System.out.println(p.nation); // 필드값을 따로 주지 않았다
		p.nation = "미국";
		System.out.println(p.nation);
		
		
		
		people p1 = new people();
		p1.name = "이름2";
		System.out.println(p1.name);
		
		// 매개변수가 있는 생성자를 이용한 객체(인스턴스) 생성
		people p3 = new people("이름4", 30);
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.nation);
		p3.nation = "캐나다";
		System.out.println(p3.nation);
		
		
	}

}
