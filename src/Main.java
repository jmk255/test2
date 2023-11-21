import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("== 프로그램 시작 ==");
		
		//스캐너를 스캐너객체로 불러오는 과정
		//System.in은 입력하는 행위에 대한 것들을 인자로 넘겨주고 있는 값이 됨
		Scanner sc = new Scanner(System.in);
		//위 코드를 입력하고 단축키 ctrl+shift+o를 입력하면 코드 윗줄에 자동으로 임포트됨
		
		//실제 입력 받는 행위 입력
		
		//반복된 활용을 위해 변수에 할당
		String cmd = sc.nextLine();
		
		//입력되어있는 명령어가 뭐라고 입력되어있는지 확인을 위해 cmd출력
		System.out.println("입력된 명령어)"+ cmd);
		
		//sc라는 자원을 사용후에 꺼주는 행위도 필요함
		sc.close();
		
		System.out.println("== 프로그램 끝 ==");
		
	}
}
