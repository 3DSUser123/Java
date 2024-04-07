package New;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int width;// 가로        
		 int height;// 세로
		 
		 System.out.println("\t" + "[사각형 둘레와 넓이 구하는 공식]");
		 System.out.println("\t" + "사각형의 가로와 세로의 길이를 입력하세요");
		 
		 System.out.println("\t" + "-------------------------");
		 
		 System.out.print("\t" + "가로: ");
		 width = input.nextInt();// 가로
		 System.out.print("\t" + "세로: ");
		 height = input.nextInt();// 세로
		 int SLength = (width *2) + (height* 2);// 둘레
		 int SArea = width * height;// 넓이
		 System.out.println("\t" + "-----------------------");
		 System.out.println("\t" + "사각형의 둘레는 " + SLength + "입니다"); // 둘레 출력
		 System.out.println("\t" + "사각형의 넓이는 " + SArea + "입니다" + "\n");// 넓이 출력
	}

}
