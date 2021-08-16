package pack;

import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Hello {
	private final int height=188;
	private final int age= 23;
	private double weight=0;
	private double 기초_대사량=0;
	private double 유지_칼로리=0;
	private double 감량_칼로리=0;
	private int 감량비율=0;
	private int 탄;
	private int 단;
	private int 지;
	void register_ur_rate(int a) {
		this.감량비율=a;
	}
	void register_ur_weight(double a) {
		this.weight=a;
	}
	void 기초대사량() {
		double a=66+13.7*this.weight+5*height-6.8*age;
		this.기초_대사량=a;
	}
	void 유지칼로리() {
		double a= 1.55*this.기초_대사량;
		this.유지_칼로리=a;
	}
	void 감량칼로리() {
		double a=this.유지_칼로리*(100-this.감량비율)/100;
		this.감량_칼로리=a;
	}
	void 탄단지() {
		this.탄=(int)this.감량_칼로리*5/10/4;
		this.단=(int)this.감량_칼로리*3/10/4;
		this.지=(int)this.감량_칼로리*2/10/9;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		int rate;
		System.out.print("당신의 몸무게를 입력하시오:");
		weight=sc.nextDouble();
		System.out.print("칼로리 제한 비율을 입력하시오:");
		rate=sc.nextInt();
		Hello C=new Hello();
		C.register_ur_weight(weight);
		C.register_ur_rate(rate);
		C.기초대사량();
		C.유지칼로리();
		C.감량칼로리();;
		C.탄단지();
		System.out.println("당신은 하루에"+C.감량_칼로리+"칼로리를 섭취하고");
		System.out.println(C.탄+"g의 탄수화물");
		System.out.println(C.단+"g의 단백질");
		System.out.println(C.지+"g의 지방을 섭취해야합니다.");
		sc.close();;
	}

}

/*
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.print("자바");
	}
}*/
//ex4)
/*public class Hello
{
	public static void main(String[] args) {
		//산술연산
		System.out.println(13+3);
		System.out.println(13-3);
		System.out.println(13*3);
		System.out.println(13/3);
		System.out.println(13%3);
		//비교연산(관계연산)
		System.out.println(10>5);
		System.out.println(10>=10);
		System.out.println(10<5);
		System.out.println(10 <= 10);
		System.out.println(10 == 9);
		System.out.println(10 != 9);
	}
}*/
//ex5)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println(false || false);
//		System.out.println(false || true);
//		System.out.println(true || false);
//		System.out.println(true || true);
//
//		System.out.println("---------------------------------");
//		System.out.println(false && false);
//		System.out.println(false && true);
//		System.out.println(true && false);
//		System.out.println(true && true);
//
//		System.out.println("---------------------------------");
//		System.out.println(!true);
//		System.out.println(!(3>2));
//	}
//}
/*
//ex6)
public class Hello 
{
	public static void main(String[] args) 
	{
		// 숫자의 유효범위:-128~127
		// "=": 대입연산자
		// 결과 = 우측;
		byte apple;
		apple = -128;
		System.out.println(apple);
	}
}
 */
// ex7)
/*public class Hello 
{
	public static void main(String[] args) 
	{
		byte apple;
		apple = 50;
		// 숫자 + 숫자
		System.out.println( 10 + 20);	// 30
		// 숫자 + 문자열(	"호랑이"	)
		System.out.println(10 + "호랑이");	// 10호랑이
		// 문자열 + 숫자
		System.out.println("호랑이" + 10);	// 호랑이10
		// 문자열 + 문자열
		System.out.println("호랑이" + "코끼리");	// 호랑이코끼리
		System.out.println(3 + 4 + "호랑이");		// 7호랑이
		System.out.println(3 + "호랑이" + 4);		// 3호랑이4
		System.out.println("호랑이" + 3 + 4);		// 호랑이34 // 중요

		// 숫자를 출력한다.
		System.out.println(123); //123
		// 문자열을 출력하고 있다.
		System.out.println("123"); //123

		// + - << * /(우선순위가 높다) << ()가 우선순위가 가장 높다.
		System.out.println( 3 + 4 * 2 );	// 11
		System.out.println((3 + 4) * 2);	// 14

		System.out.println(2 + 3 * 4 + 5);	// 19
		System.out.println((2 + 3) * (4 + 5));	// 45

		System.out.println("100 + 200");	// 100 +200

		// 자주 사용하는 코드
		System.out.println( 10 + " " + 20);	// 10 20

		byte kiwi;
		byte banana;
		kiwi = 10;
		banana = 20;
		System.out.println( kiwi + banana);
		System.out.println( kiwi + " " + banana);
	}
}*/

////ex8)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		byte a;
//		a = 20;// (20은 리터럴 이라고 한다.)
//		//
//		//	세월이 지났다.
//		//
//
//		//
//		byte b;
//		b = 127;
//		System.out.println(Byte.MAX_VALUE ); // 기억해라
//		System.out.println(Byte.MIN_VALUE ); // 기억해라 // 클래스.MIN_VALUE (스태틱)
//		// 2바이트 주세요
//		short c;
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE );
//
//		// 4바이트 주세요
//		int d;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE );
//
//		// 8바이트 주세요
//		long e;
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE );
//
//	}
//}
//ex9)
/*public class Hello 
{
	public static void main(String[] args) 
	{
		int a;
		a= 10;

		// 이것도 마찬가지로 4바이트 주세요
		float b; // 소숫점 사용
		b = 10f;
		System.out.println(b);

		long c; // 8바이트
		double d; // 마찬가지로 8바이트
		c = 20;
		d = 20;
		System.out.println(d);

		b = 3.14f;
		d = 3.14;

		//2바이트 주세요
		short e; // 정수
		char f;  // 문자
		f = 'A';
		f = '한';
		System.out.println(f);

		// 1바이트 주세요
		byte g;
		boolean h;
		h = false;

		// 표준 타입(type)
		// byte(1), short(2), int(4), long(8)/ float(4), double(8)/ char(2)/ boolean(1)
	}
}*/

////ex10)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		short a = 65; // int여도 상관없다. 두 자료형의 크기가 모두 2바이트여서 맞춘것은 아니다.
//		char b = 'A';
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println( (char)a ); // 명시적 형변환
//		System.out.println( (short)b ); // 캐릭터의 아스키코드를 알기위해서는 앞에 (int) 혹은 (short)를 붙여보자
//		System.out.println("----------------------------");
//		char c = 'A' + 1; // 이런식으로 char형에 정수를 더하면 다른 문자로 변한다. 
//		// 내부적으로는 char형과 정수를 더하면 char형이 잠시 정수형으로 형변환되어 사칙연산된 후, 결과값을 다시 char값으로 형변환해준다.
//		// char c= 65 + 1
//		// (short)c = 66 
//		System.out.println(c); // B
//
//		char d = '한' + 5;
//		System.out.println(d);
//
//		char x = '양';
//		char y = '민';
//		char z = '재';
//		System.out.println((int)x);
//		System.out.println((int)y);
//		System.out.println((int)z);
//
//		char xx;
//		xx = 'A'; // (o)
//		char yy; 
//		yy = 65; // (x) // 같은값이 나오기는 하지만, (굳이) 일반적으로 이런식으로 코딩하지는 않는다.
//		System.out.println(yy);
//
//	}
//}
////ex11)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int a;
//		int b;
//		a = 10;
//		b = 20;
//		System.out.println(a + " " + b);
//
//		int c = 10;
//		int d = 20;
//		System.out.println(c + " " + d);
//
//		int app = 30;
//		int bpp = 4;
//		System.out.println( app + bpp );
//		System.out.println( app - bpp );
//		System.out.println( app * bpp );
//		System.out.println( app / bpp );
//		System.out.println( app % bpp );// 모듈러스
//	}
//}
//ex12) 변수 작명법
/*public class Hello 
{
	public static void main(String[] args) 
	{
		// 1. 변수이름은 중복해서 작명할 수 없다.
		int apple;
		// int apple;

		// 2. 대소문자는 (내부적으로는) 서로 다른 이름으로 해석한다.
		// **가급적 피하는 작명법이다.**
		int banana;
		int Banana;
		int baNana;

		// 3. **첫 글자가 숫자가 아니라면 숫자를 사용할 수 있다.**
		int kiwi2345;
		// int 9kiwi; (x)

		// 4. ( _, $ )를 제외한 특수문자는 사용할 수 없다.
		int _tiger;
		int lion_;
		int dog$;
		// int !cat;

		// 5. 한글을 사용할 수 있지만, 사용하지 않는것이 좋다.
		int 사과;
		사과 = 10;
		System.out.println(사과);

		// 6. 한단어 이상일떄는 낙타(카멜) 표기법을 사용한다.
		int applecount;
		int AppleCount;
		int appleCount;
		int apple_count;
	}
}*/

//ex13)
/*public class Hello 
{
	public static void main(String[] args) 
	{
		// int a = 10;
		// int b = 20;
		int a = 10, b = 20;
		int temp;// 임시
		System.out.println(a + " " + b );

		// 초기값을 가지고 있지 않는 변수는 출력의 대상으로 해서는 안된다
		// System.out.println(temp);

		// 데이터 교환 알고리즘
		temp = a; // temp: 10
		a = b; // a: 20
		b = temp; // b: 10
		System.out.println( a + " " + b );

		int c = 88, d = 99;
		int t;
		t = c;
		c = d;
		d = t;
		System.out.println(c + " " + d);
	}
}*/
////ex14)
//public class Hello {
//	public static void main(String[] args) {
//		//ex1)
//		if(false) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//		}
//		System.out.println(4);
//
//		//ex2)
//		if( 30 == 30) {
//		System.out.println(5);
//		}
//		System.out.println(6);
//
//		//ex3)
//		if( 30 > 20) {
//			System.out.println(7);
//		}
//		//ex4)
//		int a = 100, b = 50;
//		// if( a > b * 2) // false
//		if(a >= b * 2)  { // true
//			System.out.println(7);
//		}
//		System.out.println(8);
//
//		// 산술연산 >> 비교연산 >> 논리연산
//		// ex5)
//		// if( 5>=3 && 9>7)
//		if( 5>=3 && 2 + 7 > 7 ) 
//		{
//			System.out.println(9);
//		}
//	}
//}

////ex15)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 제어문 안에서 제어문을 사용할 수 있다.
//		System.out.println(1);
//		if(true) {
//			System.out.println(2);
//			if(true) {
//				System.out.println(3);
//			}
//			System.out.println(4);
//			if(false) {
//				System.out.println(5);
//
//			}
//			System.out.println(6);
//		}
//		System.out.println(7);
//	}
//}
/*
//ex16)
public class Hello 
{
	public static void main(String[] args) 
	{
		if(4 > 3) {
			System.out.println(1000);
		}
		// if else
		// 2중에 1개만 반드시 실행한다.
		if(true) {
			System.out.println("호랑이");
		}
		else {
			System.out.println("코끼리");
		}
		int num = 199999;
		if( num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		int dn = 2109211;
		if( dn / 1000000 == 1 ) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
	}
}*/

////ex17)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//ex1)
//		if(4 < 3) {
//			System.out.println(1);
//		}
//		else if(false) {
//			System.out.println(2);
//		}
//		else if(true) {
//			System.out.println(3);
//		}
//		else {
//			System.out.println(4);
//		}
//		System.out.println(5);
//
//		int jumsu = 99;
//		if( jumsu >= 90) {
//			System.out.println("당신의 학점은 A입니다.");
//		}
//		else if( jumsu >= 80 ) {
//			System.out.println("당신의 학점은 B입니다.");
//		}
//		else if( jumsu >= 70) {
//			System.out.println("당신의 학점은 C입니다.");
//		}
//		else if( jumsu >= 60 ) {
//			System.out.println("당신의 학점은 D입니다.");
//		}
//		else {
//			System.out.println("당신의 학점은 F입니다.");
//		}
//	}
//}

////ex18)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int a = 10;
//		System.out.println(a);
//
//		a += 5;
//		System.out.println(a);
//		a -= 7;
//		System.out.println(a);
//		a += 1;
//		System.out.println(a);
//
//		a++;
//		System.out.println(a);
//		++a;
//		System.out.println(a);
//
//		a -= 1;
//		System.out.println(a);
//		a--;
//		System.out.println(a);
//		--a;
//		System.out.println(a);
//	}
//}

////ex19)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// ex1)
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}
//		System.out.println("호랑이");
//		// ex2) 한줄에 데이터를 모두 보고 싶을때
//		for (int i = 0; i < 4; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("호랑이1");
//		// ex3)
//		int num=8;
//		for (int i = 0; i < 10; i++) {
//			System.out.println(num + " * " + i + " = " + num*i);
//		}
//		// ex4)
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i+"호랑이"+i*10);
//		}
//		// ex5)
//		long sum =0;
//		for (long i = 1; i <= 1000000000; i++) {
//			sum = sum +i;
//			System.out.println(sum);
//		}
//	}
//}
////ex20)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int sum = 1;
//		for (int i = 0; i < 8; i++) {
//			sum = sum*2;
//			System.out.println(i+1+" : "+sum);
//			// i=1 : 2 = 1 * 2
//			// i=2 : 4 = 2 * 2
//			// i=3 : 8 = 4 * 2
//			// i=4 : 16 = 8 * 2
//			// i=5 : 32 = 16 * 2
//			// .......
//			// i=8 : 256 = 128 *2
//		}
//		System.out.println();
//		// 2의 8승을 출력하는 프로그램이다.
//		
//		// 3의 4승
//		int sum1 = 1;
//		for (int i = 0; i < 4; i++) {
//			sum1 = sum1*3;
//			System.out.println(i+1+" : "+sum1);
//		}
//		int sum2=1;
//		int a=5, b=6;
//		for (int i = 0; i < b; i++) {
//			sum2=sum2*a;
//			
//		}
//		System.out.println(sum2);
//		// 팩토리얼 구하는 코드
//		int k,sum3;
//		k=5;
//		sum3=1;
//		for (int i = 0; i < k; i++) {
//			sum3=sum3*(i+1);
//		}
//		System.out.println(k+"팩토리얼="+sum3);
//	}
//}
////ex21)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//ex1)
//		for (int i = 0; i < 3; i++) 
//		{
//			for (int j = 0; j < 4; j++) 
//			{
//				System.out.println("("+i+", "+j+")");
//
//			}
//			System.out.println("--------------------");
//		}
//		//ex2)
//		System.out.println();
//		System.out.println("====================");
//		System.out.println();
//		for (int i = 0; i < 3; i++) 
//		{
//			for (int j = 0; j < 4; j++) 
//			{
//				System.out.print("["+i+" "+j+"]");
//
//			}
//			System.out.println();
//			System.out.println("--------------------");
//		}
//		System.out.println();
//		System.out.println();
//		//ex3)
//		for (int i = 0; i < 10; i++) {
//			if(i%3==0) {
//				System.out.println(i+"는 3의 배수입니다."); // 0은 모든 자연수의 배수이다.
//			}
//			else {
//				System.out.println(i+"는 3의 배수가 아닙니다.");
//			}
//		}
//	}
//}
////ex22)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// while 반복문
//		// 반복횟수를 알고 프로그램을 작성할때 : for
//		// 반복횟수를 모를때 : while를 사용한다.
//		
//		// ex1)
////		boolean state = false;
////		while(state) {
////			System.out.println("호랑이");
////		}
////		System.out.println("사자");
//		
//		// ex2) -> 이런식으로 쓸바에는 for문 쓴다. ex3)을 참고해라
//		int num = 0;
//		while(num<4) {
//			System.out.println(num);
//			num++;
//		}
//		System.out.println();
//		System.out.println();
//	
//		// ex3)
//		int num1 = 0;
//		while(true) {
//			System.out.println(num1);
//			if(num1 == 3) {
//				System.out.println("반복문을 탈출합니다.");
//				break;
//			}
//			num1++;
//		}
//	}
//}
////ex23) 우박수를 출력하세요.
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int n = 124567;
//		while(true) {
//
//			System.out.println(n);
//			if(n%2==0) {
//				n = n/2;
//			}
//			else {
//				n=3*n+1;
//			}
//			if(n==1) {
//				System.out.println(n);
//				System.out.println("탈출 일보 직전");
//				break;
//			}
//		}
//		System.out.println("프로그램을 종료합니다.");
//	}
//}
////ex24)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int num = 4599;
//		int temp = num;
//		int sum = 0;
//		while(true) {
//			int r = num%10; // 9
//			num = num/10;
//			sum+=r;
//			if(num==0) {
//				System.out.println(sum);
//				break;
//			}
//		}
//		System.out.println(temp+"의 숫자합은 : "+sum+"입니다.");
//		int a=4;
//		a=a/10;
//		System.out.println(a); // n보다 작은 수를 n으로 나눈 몫은 0이다.
//		
//	}
//}
////ex25) 
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// break는 반복문에서 사용할 수 있다.
//		// for에서도 break;를 사용할 수 있다.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if( i== 3) {
//				break;
//			}
//		}
//	}
//}
////ex26) 
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//ex1)
//		int n = 0;
//		while(true) {
//			n++;
//			if(n<3) {
//				System.out.println(n+"호랑이");
//				continue;
//			}
//			System.out.println("독수리");
//			if(n>5) {
//				break;
//			}
//		}
//		System.out.println("종료");
//		System.out.println("----------------------");
//		//ex2)
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i);
//			if(i<4) {
//				continue;
//			}
//			System.out.println(i+"호랑이");
//			
//			if(i==8) {
//				break;
//			}
//		}
//	}
//}
////ex27)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 1. switch 안에 변수를 사용할 수 있다.
//		// 2. case 뒤에 변수를 사용할 수 없다.
//		// 3. 점프할 곳이 없을때에는 아무것도 실행되지 않는다.
//		// 4. 갈곳이 없을 때, default: break;를 사용할 수 있다.
//		// 5. 혹시 실수라도 break;를 생략하면 밑의 문장을 실행합니다.
//		int num = 40;
//		int temp = 10;
//		switch (num) {
//		// ex) case temp: -> 사용할 수 없다.
//		case 10:
//			System.out.println("호랑이");
//			break;
//		case 20:
//			System.out.println("코끼리");
//			break;
//		case 30:
//			System.out.println("앵무새");
//			break;
//		default:
//			System.out.println("해당하는 곳이 없습니다.");
//			break;
//		}
//
//	}
//}
////ex28)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//
//		int a, b, c;
//		
//		//
//		int d, e, f, g, h, i, j, l, m, n;
//		// 다음은 비교적 영리한 변수 작명법이다.
//		int a1, a2, a3, a4, a5;
//		int a6, a7, a8, a9, a10;
//		// 위처럼 프로그램을 작성하던 시절도 있었다.
//		// 변수를 한꺼번에 많이 요구할 수 있는 문법을 만들었다.
//		// 이것이 바로 배열(array)이라고 합니다.
//		
//		// new
//		// int 타입으로 메모리 10개 주세요
//		// 그리고 그 이름을 ar이라는 이름으로 사용하겠다.
//		// char[] ar = new char[10]
//		int[] arr = new int[10];
//		
//		// ar[0], ar[1], ar[2], ar[3], ar[4],
//		// ar[5], ar[6], ar[7], ar[8], ar[9],
//		
//		// ex1)
//		arr[0] = 10;
//		arr[5] = 30;
//		arr[9] = 50;
//		System.out.println(arr[0]);
//		System.out.println(arr[5]);
//		System.out.println(arr[9]);
//		
//		// arr[10]=100;
//		// 위의 코드는 예외(exception)가 발생한다.
//		
//		System.out.println("호랑이");
//		
//		// ****메모리를 요구할때 기본값으로 0으로 채워진다.****
//		System.out.println(arr[1]);
//		
//		// ex2)
//		int x = 3, y = 4, z;
//		z= x+y;
//		
//		arr[4] = arr[0]+arr[5];
//		System.out.println(arr[4]);
//
//	}
//}
////ex29)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int[] ar = new int [5];
//		// 배열은 for문과 어울릴 수 있다.
//		for (int i = 0; i < 5; i++) {
//			ar[i]=i*10+i;
//			System.out.println("ar["+i+"]:"+ar[i]);
//		}
//		System.out.println("----------------------");
//		//System.out.println(ar.length);
//		
//		for (int i = 0; i < ar.length; i++) {// 이렇게 적는게 좋다.
//			ar[i]=i*10+i;
//			System.out.println("ar["+i+"]:"+ar[i]);
//		}
//		System.out.println("----------------------");
//		// 출력과 관련해서 다르게 출력하는 방법
//		// ***for each 문***
//		// 방법2
//		int a=0;
//		for (int i : ar) {
//			System.out.println("ar["+a+"]:"+i);
//			a++;
//		}
//		char[] z= "가나다라".toCharArray();
//		System.out.println(z);
//		System.out.println("-----------------------");
//		for(char f: z) {
//			System.out.println(f);
//		}
//	}
//}
//// ex30)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 배열을 선언하는 3가지 방법
//		// 방법1 - 가장 범용성 넓고 많이 쓰임
//		int[] arr = new int[5];
//
//		// 방법2
//		int[] arr1 = new int[] {10, 20, 50, 90};
//		for(int data: arr1) {
//			System.out.print(data+ " ");
//		}
//		System.out.println();
//		// 방법3
//		int[] arr2 = {11, 22, 55, 99};
//		for (int i : arr2) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//
//		// 밑에서 사용된 2를 배열의 첨자(인덱스)라고 한다.
//		System.out.println(arr2[2]);
//	}
//}

//// ex31)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int[] ar = new int[10];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i]=i*8+7;
//		}
//		ar[0]=33;
//		ar[3]=20;
//		ar[7]=25;
//		ar[9]=35;
//		for (int i : ar) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		// 33 15 23 20 39 47 55 25 71 35 
//		for (int i = 0; i < ar.length/2; i++) {
//			System.out.println(i+" "+(ar.length-i-1));
//			System.out.println(ar[i]+ar[ar.length-i-1]);
//		}
//	}
//}

////ex32)
//// 전체적인 정의
//class Airplane{
//	// 1. 변수(필드: field)
//	int num;
//	
//	// 2. 생성자
//	
//	// 3. 메소드(method) :함수(function)
//}
//
//// 클래스 이름의 첫자는 대문자를 사용하는 것이 암묵적인 약속이다.
//class Tiger{
//	int num = 10;
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.num= 30;
//		System.out.println(t1.num);
//		// "."를 체이닝이라고 한다. chaining
//		t1.num=999;
//		System.out.println(t1.num);
//	}
//}
////ex33)
//class Airplane{
//	//필드
//	//1
//	int a; // 멤버
//	//2
//	int b, c;
//	//3
//	int d = 10, e=20;
//	//4
//	int f, g=30;
//	
//	//5
//	int fuel; // <- 실제로 사용되는 멤버 필드
//	int windowNumber;
//}// 실질적으로 객체가 생성되지 않는 이상 메모리는 낭비되지 않는다.
//
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 객체가 생성되면서 메모리가 필요하게 된다.
//		Airplane air1 = new Airplane();
//		Airplane air2 = new Airplane();
//		air1.a=100;
//		air2.a=200;
//		System.out.println(air1.a+" "+air2.a);
//		System.out.println(air1.d+" "+air2.d);
//		
//		System.out.println(air1.hashCode());
//		System.out.println(air2.hashCode());
//	}
//}
////ex34)
//class Tiger{
//	void method01() {
//		// {} 안에서 알고있는 모든 문법을 구사할 수 있다.
//		System.out.println("메쏘드 호출(call)1");
//		System.out.println("메쏘드 호출(call)2");
//		System.out.println("메쏘드 호출(call)3");
//	}
//}
//
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		// 메쏘드 호출
//		t1.method01();
//		System.out.println("호랑이");
//		System.out.println("----------------------------");
//		for (int i = 0; i < 3; i++) {
//			t1.method01();
//		}
//		System.out.println("코끼리");
//	}
//}
////ex35)
//class Car{
//	int fuel = 100;
//	
//	void move() {
//		System.out.println("자동차가 달립니다.");
//		fuel-=13;
//	}
//	void stop() {
//		System.out.println("자동차가 멈췄습니다.");
//		fuel-=3;
//	}
//	void inject() {
//		System.out.println("연료를 주입합니다.");
//		fuel = fuel + 50;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//fuel = 2000; 이렇게 쓰면 안된다.
//		Car c1 = new Car();
//		c1.move();
//		System.out.println(c1.fuel);
//		c1.move();
//		System.out.println(c1.fuel);
//		c1.stop();
//		System.out.println(c1.fuel);
//		c1.inject();
//		System.out.println(c1.fuel);
//	}
//}
////ex36) 객체 = 속성 + 동작
//class ClassName{
//	// 필드(변수) : 객체의 속성을 가진다.
//	int 속성= 100;
//	// 메쏘드(함수) : 동작을 가진다.(따라서 이들은 동사)
//	void 메쏘드() {
//		System.out.println("객체 = 속성 + 동작");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		ClassName c1= new ClassName();
//		System.out.println(c1.속성);
//		c1.메쏘드();
//	}
//}
////ex37)
//class Tiger{
//	void m1() {
//		System.out.println("m1 call");
//		System.out.println();
//	}
//	void m2(int num) {// num을 매개변수
//		
//		for (int i = 0; i < num; i++) {
//			System.out.println("m2 call"+num);
//		}
//		System.out.println();
//	}
//	void happy(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.print("왕 ");
//		}
//		System.out.println();
//	}
//	// 인수를 1개이상 전달할 수 있는가? -> 할 수 있다.
//	void m3(int a, int b) {
//		System.out.println(a+b);
//	}
//	void m4(int num) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(num+" * "+i+" = "+ num*i);
//		}
//	}
//	void m5(long num) {
//		long sum = 0;
//		for (long i = 0; i < num; i++) {
//			sum+=i+1;
//			
//		}
//		System.out.println(sum);
//	}
//	void m6(int a, int b) {
//		int sum = 1;
//		for (int i = 0; i < b; i++) {
//			sum = sum * a;
//		}
//		System.out.println(sum);
//	}
//	void m7(int width, int height, char c1, char c2) {
//		
//		for (int i = 0; i < height ; i++) {
//			for (int j = 0; j < width; j++) {
//				if((i+j)%2==0) {
//					System.out.print(c1+" ");
//				}
//				else {
//					System.out.print(c2+" ");
//				}
//
//			}
//			System.out.println();
//		}
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.m1();
//		t1.m2(3);// 3을 인자라고 한다.
//		t1.happy(5);
//		t1.m3(8, 4);
//		t1.m4(7);
//		t1.m5(1000);
//		t1.m6(2, 8);
//		t1.m7(6, 6, 'ㅣ', 'ㅡ');
//	}
//}
////ex38)
////      리턴 함수이름(전달인수)
//// 1.    x		   x
//// 2.    x		   o
//// 3.    o		   x
//// 4.    o		   o
//class Tiger{
//	void m1() {
//		System.out.println(1);
//	}
//	void m2(int num) {
//		System.out.println(num);
//	}
//	// 주인에게 int를 리턴하겠다.
//	// 리턴을 하게 되면, 반드시 코드 return이라는 키워드가 있어야 한다.
//	int m3() {
//		return 100;
//	}
//	int m4() {
//		int a=10, b=20;
//		return a+b;
//	}
//	char m5(int num) {
//		if(num>=0) {
//			return '+';
//		}
//		else {
//			return '-';
//		}
//	}
//	int m6(int a, int b) {
//		if(a>b) {
//			return a;
//		}
//		else if(a==b) {
//			return 9999;
//		}
//		else {
//			return b;
//		}
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.m1();
//		t1.m2(50);
//		// ******리턴후 바로 출력 가능******
//		System.out.println(t1.m3());
//		// 실수가 일어나기 좋은 코드
//		// System.out.println(t1.m1());
//		System.out.println(t1.m4());
//		System.out.println(t1.m5(500));
//		System.out.println(t1.m5(-500));
//		System.out.println(t1.m6(20, 20));
//	}
//}
////ex39)
//class Tiger{
//	int m1() {
//		return 0;
//	}
//	int m2(int a, int b) {
//		return a+b;
//	}
//	int m3(int num) {
//		int sum=0;
//		for (int i = 1; i <=num ; i++) {
//			sum+=i;
//		}
//		return sum;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1=new Tiger();
//		System.out.println(t1.m1());
//		System.out.println(t1.m2(30,20));
//		System.out.println(t1.m2(32,26)/10);
//		System.out.println(t1.m2(32, 26)%10);
//		System.out.println(t1.m3(100)+1000);
//
//	}
//}
////ex39)
//class Tiger{
//	//void m1 (int a, int b) ->> 함수 원형이라고 한다. function prototype
//	
//	void m1 (int a, int b) {
//	}
//	void m2(int num) {
//		if(num%2==0) {
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
//	}
//	void m3() {
//		try {
//			System.out.println(1);
//			System.out.println(2);
//			// 단독으로 return이 사용되면 함수가 중단된다.
//			return;
//			// 밑의 코드는 전혀 실행될 수가 없다.
//		} finally {
//			// TODO: handle finally clause
//			System.out.println(3); // 이렇게 쓰면 실행 될 수 있다.
//		}
//		// => 아래는 원본
////		System.out.println(1);
////		System.out.println(2);
////		// 단독으로 return이 사용되면 함수가 중단된다.
////		return;
////		// 밑의 코드는 전혀 실행될 수가 없다.
////		System.out.println(3);
//
//	}
//	void m4(int num) {
//		if(num>=0) {
//			if(num%2==0) {
//				System.out.println("짝수");
//			}
//			else{
//				System.out.println("홀수");
//			}
//		}
//		else {
//			System.out.println("음수입니다.");
//		}
//	}
//	
//	// if문에서 else를 사용하지 않고도 그 결과를 동일하게 할 수 있다면
//	// 사용하지 않는 편이 좋다.
//	void m5(int num) {
//		if(num<0) {
//			System.out.println("음수입니다.");
//			return;
//		}
//		if(num%2==0) {
//			System.out.println("짝수");
//		}
//		else{
//			System.out.println("홀수");
//		}
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.m2(100);
//		t1.m3();
//		t1.m4(-20);
//	}
//}
////ex40)
//class Tiger{
//	void m1(int num) {
//		System.out.println("m1 call");
//		for (int i = 0; ; i++) {
//			System.out.println(i);
//			if(num==i) {
//				System.out.println("찾았다!");
//				break;
//			}
//		}
//		System.out.println("비트교육센터에 오신것을 환영합니다.");	
//	}
//	void m2(int num) {
//		System.out.println("m2 call");
////		for (int i = 0;i<10 ; i++) {
////			System.out.println(i);
////			if(num==i) {
////				System.out.println("찾았다!");
////				return;
////			}
////		}
////		System.out.println("비트교육센터에 오신것을 환영합니다.");	
//		// 아래는 try finally 활용이다.
//		try {
//			for (int i = 0;i<10 ; i++) {
//				System.out.println(i);
//				if(num==i) {
//					System.out.println("찾았다!");
//					return;
//				}
//			}
//		} finally {
//			System.out.println("비트교육센터에 오신것을 환영합니다.");	
//		}
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.m1(100);
//		t1.m2(8);
//	}
//}
////ex42)
//class Tiger{
//	int num =10;
//	float count= 3.14f;
//	String str="홍길동";
//	void m1(int a, char c, String s) {
//		System.out.println(a);
//		System.out.println(c);
//		System.out.println(s);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// int, char, boolean.....등은 표준 타입 8개
//		Tiger t1 = new Tiger();
//		
//		// 표준클래스이다.(F3을 누르면 내부코드 확인 가능)
//		String a="가나다라마바사";
//		String b = new String("가나다라 마바사");
//		System.out.println(a+" "+b);
//		
//		System.out.println(b.length());
//		t1.m1(100, '한', "호랑이");
//	}
//}
////ex43)
//class Tiger{
//	void test(int a, char c, String s, Lion lion) {
//		System.out.println(lion.age);
//		lion.m1();
//	}
//}
//class Lion{
//	int age = 100;
//	void m1() {
//		System.out.println("나는 사자");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		Lion l1= new Lion();
//		// 생성자로 바로 생성해도 된다.
//		t1.test(100, '가', "집가고 싶다", new Lion());
//	}
//}

////ex44)
//// 1. 생성자는 함수입니다.(생성자 함수라고 한다.)
//// 2. 생성자함수 이름은 클래스 이름과 반드시 동일하게 한다.
//// 3. 생성자 메쏘드는 리턴값을 가질수가 없다.
//// 4. 함수이기때문에, 인수전달은 할 수 있습니다.
//// 5. 인수전달이 없는 생성자를 디폴트 생성자라고 한다.
//// 6. 생성자 함수는 객체가 생성될때(new) 딱 1번 호출된다.(2번이상 안된다.)
//class Tiger{
//	// 디폴트 생성자.
//	Tiger() {	
//		System.out.println("call");
//	}
//	
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(); // 이미 생성된 객체에 대해서 다른 생성자로 호출 불가능
//		
//	}
//}

////ex45)
//// 7. 생성자의 사용 목적 : 단 한가지(필드 초기화에 사용된다.)
//class Tiger{
//	int age;
//	String name;
//	Tiger() {
//		System.out.println("생성자 call");
//		age = 100;
//		name="호랑이";
//	}
//	void showInfo() {
//		System.out.println(this.age+" "+ this.name);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(); 	
//		t1.showInfo();
//	}
//}
////ex46)
//class Tiger{
//	// 함수이름을 동일하게 사용할 수 있는 조건
//	// 1. 전달되는 인수의 개수가 다를때
//	// 2. 전달되는 인수의 개수가 같다고 하더라도 그 타입이 다를때.
//	// ***함수 오버로딩이라고 한다.(overloading)***
//	void m1() {// 일반 사각형을 그린다.(랜덤한 사각형)
//		System.out.println(1);
//	}
//	void m1(int a) {// 정사각형을 그려준다.
//		System.out.println(a);
//	}
//	void m1(int a, int b) {// 직사각형을 그려준다.
//		System.out.println(a +" "+b);
//	}
//	// 중요! -> 매개변수의 개수가 같더라도, 자료형이 다르다면 다른 함수로 간주
//	void m1(int a, float b) {// 미세하게 제어하는 사각형을 그려준다.
//		System.out.println(a +" "+b);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(); 
//		t1.m1();
//		t1.m1(100);
//		t1.m1(100,30);
//		t1.m1(3, 1.5f);
//	}
//}
////ex47)
//class Tiger{
//	Tiger(){
//		System.out.println(1);
//	}
//	Tiger(int a){
//		System.out.println(2);
//	}
//	Tiger(int a, int b){
//		System.out.println(3);
//	}
//	Tiger(String a){
//		System.out.println(4);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(); 
//		Tiger t2 = new Tiger(3);
//		Tiger t3 = new Tiger(1, 3);
//		Tiger t4 = new Tiger("가나다라");
//	}
//}
////ex48)
//class Tiger{
//	int age = 100;
//	String name = "익명의 동물";
//	Tiger(int a, String n){
//		age= a;
//		name = n;
//	}
//	void showInfo() {
//		System.out.println(age+" "+ name);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(10, "호랑이"); 
//		Tiger t2 = new Tiger(15, "코끼리");
//		Tiger t3 = new Tiger(30, "독수리");
//		t1.showInfo();
//		t2.showInfo();
//		t3.showInfo();
//	}
//}
////ex49)
//// 객체가 만들어 진다면, 그때 만들어진, 객체를 가리키는것이 this이다.
//class Tiger{
//	int age=10;
//	String name = "호랑이";
//	
//	Tiger(){
//		System.out.println(this.hashCode());
//	}
//	void showInfo() {
//		// 밑의 코드는 원래 틀린 문장이다. this를 생략한 문장이다.
//		System.out.println(age+" "+ name);
//		// 정석 문장이다.
//		System.out.println(this.age + " "+this.name);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger 홍길동 = new Tiger(); 
//		System.out.println(홍길동.hashCode());
//		System.out.println("--------------------");
//		
//		Tiger 비티에스 = new Tiger();
//		System.out.println(비티에스.hashCode());
//	}
//}
////ex50)
//// this는 3가지 용법으로 사용된다.
//// 1. this의 첫번째 용법 - 생성자에서 인수와 필드를 구분하기위해 사용
//class Tiger{
//	int age;
//	String name;
//	Tiger(int age, String name){
//		// age=age; // 자기대입이 일어나고 있다.
//		// name=name;
//		
//		// this의 첫번째 용법 - 생성자에서 인수와 필드를 구분하기위해 사용
//		this.age = age;
//		this.name = name;
//	}
//	void showInfo() {
//		System.out.println(age+" "+name);
//	}
//	void addAge(int increasement) {
//		this.age+=increasement;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t = new Tiger(30,"이순신 장군님");
//		t.showInfo();
//		t.addAge(10);
//		t.showInfo();
//	}
//}
////ex51)
////this는 3가지 용법으로 사용된다.
//class Tiger{
//	int m1() {
//		return 10;
//	}
//	String m2() {
//		return "호랑이";
//	}
//	Tiger m3() {
//		Tiger t1 = new Tiger();
//		return t1;
//	}
//	Tiger m4() {
//		return new Tiger();
//	}
//	Tiger m5() {
//		return new Tiger();
//	}
//	Tiger m6() { // ***중요***
//				 // ***m5와 같다.***
//		return this;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t = new Tiger();
//		System.out.println(t.hashCode());// 얘와
//		System.out.println(t.m3().hashCode());// 얘는 다르다. 당근
//		System.out.println(t.m6().hashCode());// 얘만 같다
//	}
//}
////ex52)
////this는 3가지 용법으로 사용된다.
//// 2. this의 2번쨰 용법 : 함수의 체이닝을 위해서 사용된다.
//class Tiger{
//	int a;
//	Tiger(){
//		System.out.println(this.hashCode());
//	}
//	Tiger m1() {
//		System.out.println(1);
//		return this;
//	}
//	Tiger m2() {
//		System.out.println(2);
//		return this;
//	}
//	void m3() {
//		System.out.println(3);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t = new Tiger();
//		t.a=999;
//		//메서드 체이닝이라고 한다.
//		t.m1().m1().m1().m1().m1().m2().m1().m2().m1().m2().m3();
//		System.out.println();
//		Tiger t1 =t.m1();
//		System.out.println();
//		System.out.println(t1.a);
//		System.out.println("---------------");
//		System.out.println(t.hashCode());
//		System.out.println(t.m1().hashCode());
//		//t1과 t는 완전히 동일한 객체이다.
//		System.out.println(t1.hashCode());
//		
//		t.m1();
//		System.out.println("독수리"); // 중간에 코드 수정 가능
//		t.m2();
//		t.m3();
//		// 는 아래와 동일하다.
//		t.m1().m2().m3();
//		t1.a=100;
//		t.a=200;
//		System.out.println(t1.a);
//		System.out.println(t.a); // -> 둘은 "완전히" 같은 객체임 멤버변수의 변동도 동일한 객체에 대한것 처럼 일어남
//	}
//}
//ex53)
////this는 3가지 용법으로 사용된다. 
//class Tiger{
//	Tiger m1() {
//		System.out.println("아침을 먹습니다.");
//		return this;
//	}
//	Tiger m2() {
//		System.out.println("점심을 먹습니다.");
//		return this;
//	}
//	Tiger m3() {
//		System.out.println("저녁을 먹습니다.");
//		return this;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t = new Tiger();
//		t.m1();
//		t.m2();
//		System.out.println("둥근해가 떴습니다.");
//		t.m3();
//		
//		t.m1().m2().m2().m3(); // 중간에 다른 코드 개입이 없음을 암시적으로 나타낼 수 있음.
//		// 실전에서는 다음과 같은 모양으로 체이닝
//		t.m1().
//		m2().
//		m3().
//		m2();
//	}
//}
////ex54)
////this는 3가지 용법으로 사용된다.
////3. this의 3번째 사용법 - 다른 클래스에 자신의 정보를 전달할때  
//class Man{
//	int money = 2000;
//	void m1() {
//		System.out.println(money);
//	}
//	void m2() {
//		System.out.println("포악함");
//	}
//	void m3() {
//		Woman w = new Woman();
//		w.iLoveYou(this);
//		if(w.iLoveYou(this)==true) {
//			System.out.println("감사합니다.");
//		}
//		else {
//			System.out.println("잉잉잉~~");
//		}
//	}
//}
//class Woman{
//	boolean iLoveYou(Man man) {
//		if(man.money > 1000) {
//			return true;
//		}
//		return false;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Man m = new Man(); 
//		m.m3(); 
//	} 
//} 
////ex55) 상속
//// 부모의 함수이름과 자식의 함수이름을 같게하는 함수 작성 방식 - 메쏘드 오버라이딩
//class Tiger{
//	void m1() {
//		System.out.println("잘 만든 함수m1");
//	}
//	void m3() {
//		System.out.println("잘 만든 함수m3");
//	}
//}
//class Lion extends Tiger{
//	void m1() {
//		super.m1(); // 부모의 원본 메쏘드 호출
//		System.out.println("덮어씌운 함수m1");
//	}
//	void m3() {
//		System.out.println("덮어씌운 함수m3");
//	}
//	void m4() {
//		// 부모의 m3()을 부르기 위해서는 super를 앞에 붙여줘야한다.
//		// 그냥 쓸 경우 자신의 m3와 구분이 되지 않는다.
//		this.m3();
//		super.m3();
//		System.out.println(4);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Lion li = new Lion();
//		li.m1();
//		li.m3();
//		li.m4();
//		// 부모의 m3은 못쓰는가? 직접적으로는 못 쓰고, 간접적으로는 쓸 수 있다.
//	}
//}
////ex56)
//// 사자는 호랑이이다. (x)
//// 사자는 동물이다. (ㅇ)
//// 딸은 아빠이다.(x)
//// 삼각형은 도형이다.(ㅇ)
//// "is" ~이다. 가 말이 되면 상속을 제대로 쓰고 있다.
//// 따라서 상속을 is a 관계라고도 부른다.
//// has a 관계
//// 경찰은 몽둥이를 갖고 있다.(ㅇ)
//// 무사는 칼을 갖고있다.(ㅇ)
//// 자동차는 바퀴를 갖고 있다.(ㅇ)
//// 부모 생성자가 호출이 되고 자식 생성자가 호출이 된다는 말은
//// 거짓말이다!!....
//class Tiger{
//	
//}
//class Animal{
//	Animal(){
//		System.out.println(1);
//	}
//	Animal(int legNumber){
//	}
//}
//class Lion extends Animal{
//	Lion(){
//		// super(); -> 부모 생성자를 의미한다. 
//		// 가 생략돼있다. 디폴트로
//		System.out.println(2);
//	}
//}
////class Lion extends Tiger{
////
////}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Lion li = new Lion();
//		//부모 생성자 호출 -> 자식 생성자 호출 순서로 이어진다.
//	}
//}
////ex57)
//class Tiger{
//	int num;
//	Tiger(){
//		num = 100;
//		System.out.println(1);
//	}
//	Tiger(int num){
//		this.num=num;
//	}
//	void showInfo() {
//		System.out.println(num);
//	}
//}
//class Lion extends Tiger{
//	Lion(){
//		System.out.println(2);
//	}
//	Lion(int num){
//		super(num);
//		System.out.println(3);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Lion li = new Lion();
//		li.showInfo();
//		
//		Lion li1 = new Lion(9999);
//		li1.showInfo();
//	}
//}
////ex58)
//class A{
//	void m1() {
//		System.out.println(1);
//	}
//}
//class B extends A{
//	void m2() {
//		System.out.println(2);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 이놈은 상속하고 아무 관계가 없다.
//		A a = new A();
//		a.m1();
//		
//		B b = new B();
//		b.m1();
//		b.m2();
//		
//		// 부모 c = new 자식(); // 부모 = 자식;
//		// 부자 관계 >> 업캐스팅 관계
//		// 이것은 중요하지만
//		A c = new B();
//		
//		// 자부 관계 >> 다운캐스팅 관계.
//		// 자바에서는 지원되지 않는 관계이다.
//		// B d = new A();
//	}
//}
////ex60) 다형성(부자관계: 업캐스팅)
//class Tiger{
//	void m1() {
//		System.out.println("부모 m1");
//	}
//	void m3() {
//		System.out.println("부모 m3");
//	}
//	void m4() {
//		System.out.println("7777");
//	}
////	void m3(int a, int b) { //  얘가 있어야 a.m3(3,5)가 에러가 안난다.
////	}
//}
//class Lion extends Tiger{
//	void m1() {
//		System.out.println("9999");
//		this.m2();
//		this.m4();// ***얘가 중요하다!!!***
//	}
//	void m2() {
//		System.out.println("m2");
//	}
//	void m3(int a, int b) {
//		System.out.println("자식 m3"+ a+" "+ b);
//	}
//	void m3() {
//		System.out.println("자식 m3");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger a = new Lion();
//		a.m1();
//		a.m3();
//		a.m4(); // 이 예제같이 업캐스팅한 객체에 한해서는 이 세가지 메소드가 사용 할 수 있는 메소드의 전부이다.
//		// a의 타입(클래스)은 타이거이다. 따라서 m1은 Tiger에서 찾아야한다.
//		// a.m2() 는 위의 이유 때문에 오류가 뜬다.
//		// 부자 관계에서 메소드 호출시 실행순서
//		// 1. 자신의 멤버중에, 해당 메쏘드가 있는지 확인 
//		// 2. 메쏘드가 있다면, 자신의 자식에게 같은 이름의 메쏘드가 있는지 확인
//		// 3. 자식에게 같은 이름의 메쏘드가 있다면, 자식의 메쏘드를 사용한다.(오버라이딩된 메쏘드를 사용한다.)
//		// 이러한 업캐스팅 과정에서 자식은 자기껄 뒤져보고 없으면 부모에게 빌릴 수 있다.
//		
//		
//		
//		// a.m2(); ***아래와 같은 이유로 호출을 할 수 없다.***
//		// a.m3(3,5);는 오류가 뜬다. 매개변수의 수가 달라서 같은 함수라고 하기 힘들기 때문
//		// ***이 예제에서 a는 언제까지나 Tiger클래스이다. 때문에, Tiger클래스에 int 매개변수 두개짜리 m3가 생성되기 전까지는 아래의 코드 a.m3(3,5)는 오류가 난다.***
//		// ***Lion a = new Lion()과 같은경우로 생성했을 경우에는 오류가 안난다. 
//	}
//}
////ex61)
//// 한 부모는 여러 자식을 둘 수 있지만, 한명이 여러명의 부모를 지닐 수 는 없다. 
//class Animal{
//	// 아주 다양한 형태의 결과가 나올 수 있는 상황이 만들어 진다면...
//	// 이것을 다형성이라고 한다.
//	void cry() {
//		System.out.println("...");
//	}
//}
//class Dog extends Animal{
//	void cry() {
//		System.out.println("멍멍");
//	}
//}
//class Cat extends Animal{
//	void cry() {
//		System.out.println("야옹");
//	}
//}
//class Snake extends Animal{
//
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Animal t1 = new Dog();
//		t1.cry();
//		Animal t2 = new Cat();
//		t2.cry();
//		Animal t3 = new Snake();
//		t3.cry();
//	}
//}
////ex62)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		int a = 10;
//		a++;
//		System.out.println(a);
//		++a;
//		System.out.println(a);
//		
//		int b= 10, d;
//		d=b++; // -> 1. 대입, 2. 증가
//		System.out.println(b+" "+d);
//		
//		int e=10,f;
//		f=++e;
//		System.out.println(e+" "+f);
//		
//		int g = 10,h;
//		d=b;
//		b++;
//		System.out.println(b+" "+d);
//	}
//}
////ex63)
//class Tiger{
//	static int a=10; // static = 정적 = 고정.
//	int b;
//	// 객체를 생성시키지 않고도 (new를 사용하지 않고도) 사용할 수 있는가? -> 예!
//	static void m1() {
//		System.out.println("m1 함수 호출");
//	}
//	void m2() {
//		
//	}
//}
//// 컴파일 이후의 모습
////static int a; // 그래서 위에서 작성한 Tiger 안의 static 변수 a 와 변수명이 겹친다는 경고가 뜬다.
////class Tiger{
////	 // static = 정적 = 고정.
////	int b;
////}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println(Tiger.a);
//		//System.out.println(Showmethemoney.k); // 첫글자 대문자 -> 클래스 -> 뒤에 도트 -> static 필드를 사용하는 것을 의미
//		//System.out.println(Tiger.b); // 얘는 오류 뜬다.
//		Tiger t1 = new Tiger();
//		t1.b =100;
//		t1.a=400;
//		
//		Tiger t2 = new Tiger();
//		t2.b = 200;
//		System.out.println(t1.a+" "+t1.b);
//		System.out.println(t2.a+" "+t2.b);
//		Tiger.m1();
//	}
//}
////ex64)
//class Tiger{
//	static int a = 0;
//	int b = 10;
//	Tiger(){
//		a++;
//		b++;
//	}
//	void show() {
//		System.out.println(a+" "+b);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		t1.show();
//		Tiger t2 = new Tiger();
//		t2.show();
//		Tiger t3 = new Tiger();
//		t3.show();
//		Tiger t4 = new Tiger();
//		t4.show();
//		// static을 이용해서 객체 생성 횟수를 기록 할 수 있다.
//	}
//}
////ex65)
//class Tiger{
//	static void m1() {
//		System.out.println("호랑이");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 1번 방법이 있고
//		Tiger.m1();
//		// 2번 방법이 있다고 했을때
//		// 객체를 생성시키는 시간이 생각보다는 아주 오래 걸린다.
//		// 시간이 오래걸린다. 메모리 소모량이 많다 : 비용이 든다.
//		Tiger t1 = new Tiger();		
//		t1.m1();
//		//public static final double PI = 3.14159265358979323846;
//		System.out.println(Math.PI);
//		
//		System.out.println(Math.abs(-999));
//		// int java.lang.Math.abs(int a)
//		
//		System.out.println(Math.min(20, 30)+ " "+ Math.max(60, 70));
//		System.out.println("-------------------------");
//		System.out.println(Math.floor(3.99)); // 내림
//		System.out.println(Math.ceil(5.2)); // 올림
//		System.out.println(Math.floor(-1.5)); // 음수일때 조심!! 천장 바닥이라는 말이 지니는 추상적인 의미를 생각해보자
//		System.out.println(Math.ceil(-1.5));
//		System.out.println(Math.round(5.5)); // 반올림
//		System.out.println(Math.round(5.4));
//	}
//}
////ex66)
//// Ctrl + F11 -> 1. 기계어로 번역된다. 2. OS가 main 함수를 부른다. -> main은 운영체제가 부른것임
//// main은 프로그램의 진입점으로 entry point라고 한다.
//// Hello he = new Hello(); // x
//// he.main(); // x
//// -> Hello.main();
//public class Hello {
//	int num =10;
//	Hello(){
//		
//	}
//	void m1() {
//		
//	}
//	static void m2() {
//		System.out.println("m2 호출");
//	}
//	public static void main(String[] args) {
//		Hello he = new Hello();
//		System.out.println(he.num);
//		// System.out.println(this.num);
//		// -> 안되는 이유, main 함수는 static 함수이기 때문에, 컴파일이 시작이 되면, 클래스 밖으로 튀어나가기 때문에 같은 클래스 내의 멤버를 지칭하는 this를 사용할 수 없다.
//		// ***정리하면, 스태틱 함수 안에서는 스태틱 변수만 사용할 수 있다.***
//		// -> num 또한 static 변수였다면 정상적으로 출력 됐을 것 이다.
//		Hello.m2();
//		m2();
//	}
//}
////ex67)
//class Tiger{
//	Tiger m1() {
//		System.out.println("호랑이");
//		return this;
//	}
//	static void main() {
//		Tiger t = new Tiger();
//		t.m1().m1().m1().m1();
//	}
//}
//public class Hello {
//	void m1() {
//		System.out.println("독수리");
//	}
//	public static void main(String[] args) {
//		Tiger.main();
//		Hello h = new Hello();
//		h.m1();
//	}
//}
////ex--)
//public class Hello {
//	static void m1() {
//	}
//	void m2() {
//		
//	}
//	public static void main(String[] args) {
//		m1();
//		Hello h = new Hello();
//		h.m2();
//	}
//}
////ex68)
//abstract class Tiger{
//	// 아래와 같이 코드가 없는 함수 원형을 abstract 함수원형이라고 한다.
//	// abstract : 추상(함수)
//	// ***클래스 내부에 추상함수가 1개라도 있으면, 그 클래스도 반드시 추상 클래스 이어야 한다.***
//	// 추상의 뜻 : 미완성. (코드가 미완성 되었다.)
//	// ***미완성된 코드를 자식은 반드시 그 코드를 완성해야한다.***
//	abstract void m1();
//	void m2() {}
//}
//class Lion extends Tiger{
//	// 따라서 m1()을 주석 처리한다면, 오류가 뜬다.
//	void m1() {
//		System.out.println("크아앙1");
//		System.out.println("크아앙2");
//		System.out.println("크아앙3");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Tiger ti = new Lion();
//		ti.m1();
//	}
//}
////ex69)
//abstract class 대장장이{
//	void 칼() {
//		System.out.println("멋진 칼... 뿜뿜");
//	}
//	abstract void 방패();
//	
//}
//class 나그네1 extends 대장장이{
//	void 방패() {
//		System.out.println("스틸 레토");
//	}
//}
//
//class 나그네2 extends 대장장이{
//	void 방패() {
//		System.out.println("억지로 만든 방패");
//		for (int i = 0; i < 5; i++) {
//			칼();
//		}
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		// 대장장이 ti = new 대장장이(); -> 코드가 완성이 되지 않았기 때문에, 당연히 메모리를 못만들고, 그래서 에러가 뜬다.
//		// 코드가 미완성인데, 어떻게 객체를 생성시키는가?
//		// -> 추상클래스는 객체 생성 불가, 안에 추상 함수가 아닌 함수가 있더라도 말이다.
//		대장장이 t1 = new 나그네1();
//		t1.칼();
//		t1.방패();
//		System.out.println("---------------");
//		대장장이 t2 = new 나그네2();
//		t2.방패();
//	}
//}
////ex70)
//// 업캐스팅을 구태여 하는 이유
//abstract class Animal{
//	abstract void cry();
//}
//class Tiger extends Animal{
//	void cry() {
//		System.out.println("호랑이 어흥");
//	}
//}
//class Lion extends Animal{
//	void cry() {
//		System.out.println("사자 어흥");
//	}
//}
//class Zoo{
////	void sound(Tiger ti) {
////		ti.cry();
////	}
////	void sound(Lion li) {
////		li.cry();
////	} -> 굳이 이렇게 쓰지말고 아래처럼 쓰면, 입력 인자의 클래스 종류에 따라 함수를 계속 만들지 않아도 된다.
//	void sound(Animal an) {
//		an.cry();
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Zoo z = new Zoo();
//		z.sound(new Tiger());
//		z.sound(new Lion());
//		
//	}
//}
////ex71)
//abstract class A{
//	abstract void m1();
//}
//class B extends A{
//	void m1() {
//		System.out.println(1);
//	}
//}
//class C extends A{
//	void m1() {
//		System.out.println(2);
//	}
//}
//class Tiger{
//	void m1() {
//		System.out.println("어흥");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		B t1 = new B();
//		A t2 = new B(); // 선호 된다. A를 애초에 abstract로 선언했기 때문에, 형식적으로 맞춰 주자
//		
//		// int a, b, c; 이 목적으로 만든게 아래의 배열
//		int[] ar = new int[3];
//
//		String[] br = new String[3];
//		for (int i = 0; i < br.length; i++) {
//			br[i]=new String();
//		}
////		Tiger o1;
////		Tiger o2;
////		Tiger o3;
//		Tiger [] cr = new Tiger[3];
//		for (int i = 0; i < cr.length; i++) {
//			cr[i]=new Tiger();
//		}
//		cr[0].m1();
//		cr[1].m1();
//		int[] dr = new int [] {1,2,3};
//		
//		Tiger [] er = new Tiger[] {new Tiger(), new Tiger(), new Tiger()};
//		B[] fr = new B[] {new B(), new B(), new B()};
//		// ***이런식으로 업캐스팅을 이용해서 다양한 타입의 클래스 배열을 생성 할 수 있다.***
//		A[] gr = new A[] {new B(), new C(), new B()};
//		gr[0].m1();
//		gr[1].m1();
//	}
//}
////ex72)
//abstract class A{abstract void m1();}
//class B extends A{
//	void m1() {System.out.println(0);}
//}
//class C extends A{
//	void m1() {System.out.println(1);}
//}
//class D extends A{
//	void m1() {System.out.println(2);}
//}
//public class Hello {
//	public static void main(String[] args) {
//		A[] a = new A[] {new B(), new C(), new D()};
//		int num = 0;
//		a[num].m1();
//		// 밑의 코드와 동일하다.
//		
////		int num = 0; // 0, 1, 2
////		B b = new B();
////		C c = new C();
////		D d = new D();
////		switch (num) {
////		case 0:
////			b.m1();
////			break;
////		case 1:
////			c.m1();
////			break;
////		case 2:
////			d.m1();
////			break;
////		}
//	}
//}

////ex73)
//// 추상클래스를 만드는 이유
//abstract class 한국은행{
//	abstract void 입금();
//	abstract void 출금();
//	abstract void 이체();
//	abstract void 대출();
//}
//class 국민은행 extends 한국은행{
//	void 입금() {
//		
//	}
//	void 출금() {
//		
//	}
//	void 이체() {
//		
//	}
//	void 대출() {
//		
//	}
//}
//class 하나은행 extends 한국은행{
//	void 입금() {
//		
//	}
//	void 출금() {
//		
//	}
//	void 이체() {
//		
//	}
//	void 대출() {
//		
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		국민은행 a = new 국민은행();
//		한국은행 b = new 국민은행();
//	}
//}
////ex74-1)
//// 기능이 없고 틀만을 갖고 있을때는 abstract class 보다 interface가 적합하다.
//interface 한국은행{
//	void 입금();// 어차피 abstract 를 생략해도 자동으로 붙여 줘서 일반적으로 쓰지 않는다.
//	abstract void 출금();
//	void 이체();
//	void 대출();
//}
//class 국민은행 implements 한국은행{ // 구현하다
//	public void 입금() {// ***interface를 implements 했을 경우 무조건 앞에 public을 붙여준다.***
//		
//	}
//	public void 출금() {
//		
//	}
//	public void 이체() {
//		
//	}
//	public void 대출() {
//		
//	}
//}
//class 하나은행 implements 한국은행{
//	public void 입금() {
//		
//	}
//	public void 출금() {
//		
//	}
//	public void 이체() {
//		
//	}
//	public void 대출() {
//		
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		국민은행 a = new 국민은행();
//		한국은행 b = new 국민은행();
//	}
//}
////ex74-2)
////기능이 없고 틀만을 갖고 있을때는 abstract class 보다 interface가 적합하다.
//interface A{
//	void m1();
//	void m2();
//}
//class B implements A{
//	public void m1() {
//		System.out.println(1);
//	}
//	public void m2() {
//		System.out.println(2);
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		B t1 = new B();
//		t1.m1();
//		t1.m2();
//		
//		A t2 = new B(); // 확장의 측면에서 왼쪽 코드 처럼 써라
//		t2.m1();
//		t2.m2();
//	
//		
//	}
//}
////ex75)
//// java에서 다중상속은 제공 되지않는다. 
//// 한 클래스로부터만 extends 가능하다.
//// 하지만, 하나의 클래스와 여러개의 인터페이스를 상속 할수는 있다.
//// -> 부모(extends)는 하나지만, 스승(implements)은 여러명일 수 있다.
//class A{
//	void m1() {
//		System.out.println(1);
//	}
//}
//class B{
//	void m2() {
//		
//	}
//}
//interface C{
//	void m3();
//}
//interface D{
//	void m4();
//}
//class E extends A implements C,D{
//	public void m3() {
//		System.out.println(3);
//	}
//	public void m4() {
//		System.out.println(4);
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		E a = new E();
//		a.m1();
//		a.m3();
//		a.m4();
//	}
//}
////ex76) final : (마지막)
//// 1.
//class Tiger{
//	int num1 =101;
//	final int num2 = 101; // 값을 더이상 변경할 수 없다.
//}
//// 2. 
//// ***클래스 앞에 final이 붙을 경우 더 이상 상속할 수 없다.***
//final class A{
//	
//}
////class B extends A{
////	
////}
//// 위와 같이 에러가 뜬다.
//
//// 3.
//// ***함수앞에 final이 붙을 경우, 더 이상 오버라이딩 할 수 없다.***
//class AA{
//	final void m1() {
//		
//	}
//}
//class BB extends AA{
////  아래와 같이 m1()을 오버라이딩 할 경우 에러가 뜬다.
////	void m1() {
////		
////	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		t1.num1= 201; // num1(변수)
//		//t1.num2 = 201; // num2(상수) 에러가 뜬다, final 변수는 값을 변경 할 수 없다.
//		System.out.println(Math.PI);
//		String s;
//		
//	}
//}
////ex77)
//class A{void m1() {System.out.println("A");}}
//class B extends A{void m2() {System.out.println("B");}}
//class C extends B{void m3() {System.out.println("C");}}
//class D extends B{void m4() {System.out.println("D");}}
//public class Hello {
//	public static void main(String[] args) {
//		C t1 = new C();
//		t1.m1();
//		t1.m2();
//		t1.m3();
//		
//		D t2 = new D();
//		t2.m1();
//		t2.m2();
//		t2.m4();
//		//t2.m3(); 는 안된다.
//	}
//}
////ex78) -> 실전에서 많이 쓰이는 문법
//// 1. interface 안에는 실행코드가 있을 수가 없다.
//// 2. interface 는 객체를 생성시킬 수 없다.(abstract class와 마찬가지)
//// 3. interface 는 implements를 이용해서 상속한다.
//// 4. 반드시 부모의 메쏘드를 구현해야 한다.
//// 5. 구현된 메쏘드 앞에 public을 붙여야 한다.
//
//interface Tiger{
//	void m1();
//}
//class Lion implements Tiger{
//	public void m1() {
//		System.out.println(999);
//	}
//}
//
//public class Hello {
//	public static void main(String[] args) {
//		Lion t = new Lion();
//		t.m1();
//		
//		Tiger t2 = new Lion();
//		t2.m1();
//		
//		// 원칙대로면 아래의 코드는 성립이 안된다. -> 하지만 가능하다.
//		// Tiger t3 = new Tiger();
//		// 익명 클래스 생성.
//		// 1. 익명클래스의 첫번째 사용법
//		Tiger t3 = new Tiger() {
//			public void m1() {
//				System.out.println(888);
//			}
//		};
//		t3.m1();
//		Tiger t4 = new Tiger() {
//			public void m1() {
//				System.out.println(777);
//			}
//		};
//		t4.m1();
//		// 2. 익명클래스의 두번째 사용법(익명객체를 사용한다.)
//		new Tiger() {
//			public void m1() {
//				System.out.println(666);
//			}
//		}.m1();
//		// 익명클래스는 인터페이스나 앱스트랙트 클래스와 관련된 것만 가능하다. 상속을 받지 않은 일반 클래스에 대해서는 사용할 수 없다.
//		// Lion도 인터페이스를 상속받았으므로 아래와 같은 익명클래스 생성이 가능하다.
//		new Lion() {
//			public void m1() {
//				System.out.println(555);
//			}
//		}.m1();
//		}
//	}
////ex79) 익명 클래스의 주 사용 용도
//// ***함수에 코드를 전달한다.***
//interface Tiger{
//	void m1();
//}
//class Lion{
//	// Tiger t = new Tiger(){.......};
//	void m2(Tiger t) {
//		t.m1();
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Lion t = new Lion();
//		t.m2(new Tiger() {
//			public void m1() {
//				System.out.println("나는 익명 클래스");
//			}
//		});
//		}
//	}
////ex80) 
//public class Hello {
//	public static void main(String[] args) {
//		//ex1)
//		int a = 20, b = 10;
//		int c;
//		if( a> b) {
//			c=1000;
//		}else {
//			c=2000;
//		}
//		System.out.println(c);
//		// 삼항연산으로 바꾸는 것이 좋다.
//		c= (a>b)?1000:2000;
//		// 위의 한줄 코드는 더 위의 if else와 완전히 동일한 프로그램이다.
//		// 사용할 수 있으면, 삼항연산을 사용하는 습관을 갖자\
//		// 코드를 압축해서 간단하게 나타내는 코드 (sugar code)
//		System.out.println(c);
//
//		//ex2)
//		if( a>b) {
//			System.out.println("호랑이");
//		}else {
//			System.out.println("코끼리");
//		}
//		// 같은 코드들임
//		String k = (a>b)?"호랑이":"코끼리";
//		System.out.println(k);
//		// 같은 코드들임
//		System.out.println((a>b)?"호랑이":"코끼리");
//		System.out.println(m1(20,30));
//	}
//	static int m1(int a, int b) {
////		if(a>b) {
////			return 1000; 
////		}else {
////			return 2000;
////		}
//		// ***이런식으로도 사용한다. 삼항연산이 또다른 리터럴을 리턴하는 함수로 간주-> syso 안에서나 return 뒤에서 쓰일 수 있다.***
//		return (a>b)?1000:2000;
//	}
//}
////ex81-1) 문제점 : 아래의 경우에서 인공지능이 수정/ 버전업 된다면, 기존 클래스의 코드를 손으로 전면 수정해주어야 한다.
//class Baduk{
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play() {
//		System.out.println("인공 지능은 알파고 입니다.");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		// ***클래스 타입 적고 띄어쓰고 ctrl + space 하면 클래스 이름을 첫글자 소문자로 바꾸어 적어준다.***
//		Baduk baduk = new Baduk();
//		baduk.play();
//	}
//}
////ex81-2) 문제점 : 인공지능이 나올때마다 Baduk 클래스에 void play 함수를 추가해야한다. if 인공지능이 1200개라면, 중복되는 play코드를 1200개를 만들어야한다.
//class Baduk{
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play(AlphaGo al) {
//		al.play();
//	}
//	void play(BetaGo be) {
//		be.play();
//	}
//	void play(GammaGo ga) {
//		ga.play();
//	}
//}
//
//class AlphaGo {
//	void play() {
//		System.out.println("인공지능은 알파고입니다.");
//	}
//}
//class BetaGo {
//	void play() {
//		System.out.println("인공지능은 베타고입니다.");
//	}
//}
//class GammaGo {
//	void play() {
//		System.out.println("인공지능은 감마고입니다.");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Baduk baduk = new Baduk();
//		baduk.play(new AlphaGo());
//		baduk.play(new BetaGo());
//		baduk.play(new GammaGo());
//	}
//}
////ex81-3) 문제점 : Ai의 void 함수의 스코프 안이 비어 있다.
//class Baduk{
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play(Ai ai) {
//		ai.play();
//	}
//}
//
//class Ai{
//	void play() {
//		
//	}
//}
//
//class AlphaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 알파고입니다.");
//	}
//}
//class BetaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 베타고입니다.");
//	}
//}
//class GammaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 감마고입니다.");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Baduk baduk = new Baduk();
//		baduk.play(new AlphaGo());
//		baduk.play(new BetaGo());
//		baduk.play(new GammaGo());
//	}
//}
////ex81-4) 문제점 : Ai가 인터페이스만 갖고 있기 때문에 더 적절한 형태로 수정해 보자.
//class Baduk{
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play(Ai ai) {
//		ai.play();
//	}
//}
//
//abstract class Ai{
//	abstract void play();
//}
//
//class AlphaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 알파고입니다.");
//	}
//}
//class BetaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 베타고입니다.");
//	}
//}
//class GammaGo extends Ai {
//	void play() {
//		System.out.println("인공지능은 감마고입니다.");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Baduk baduk = new Baduk();
//		baduk.play(new AlphaGo());
//		baduk.play(new BetaGo());
//		baduk.play(new GammaGo());
//	}
//}
////ex81-5) 문제점 : 
//// 1. 함수를 만들때 마다, 인공지능 객체를 계속 넘겨야 하는가?
//// 2. 한 게임의 플레이와 스탑이 서로 다른 객체를 사용하고 있다.
//class Baduk{
//	Baduk(){
//		System.out.println("대국을 시작합니다.");
//	}
//	void play(Ai ai) {
//		ai.play();
//	}
//	void stop(Ai ai) {
//		ai.stop();
//	}
//}
//
//interface Ai{
//	void play();
//	void stop();
//}
//
//class AlphaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 알파고입니다.");
//	}
//	public void stop() {
//		System.out.println("알파고가 점수계산을 합니다.");
//	}
//}
//class BetaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 베타고입니다.");
//	}
//	public void stop() {
//		System.out.println("베타고가 점수계산을 합니다.");
//	}
//}
//class GammaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 감마고입니다.");
//	}
//	public void stop() {
//		System.out.println("감마고가 점수계산을 합니다.");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Baduk baduk = new Baduk();
//		baduk.play(new AlphaGo());
//		baduk.play(new BetaGo());
//		baduk.play(new GammaGo());
//		baduk.stop(new AlphaGo());
//		baduk.stop(new BetaGo());
//		baduk.stop(new GammaGo());
//	}
//}
////ex81-6) 
//// ***중요!!!***
//class Baduk{
//	Ai ai;
//	// 주입 -> injection 이라고 한다.
//	// ***Baduk 과 Ai는 의존 관계이다.***
//	// ***이런 의존관계가 얽혀있는 프로그래밍을 객체 지향 프로그램이라고한다.***
//	Baduk(Ai ai){
//		this.ai=ai;
//		System.out.println("대국을 시작합니다.");
//	}
//	void play() {
//		this.ai.play();
//	}
//	void stop() {
//		this.ai.stop();
//	}
//}
//
//interface Ai{
//	void play();
//	void stop();
//}
//
//class AlphaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 알파고입니다.");
//	}
//	public void stop() {
//		System.out.println("알파고가 점수계산을 합니다.");
//	}
//}
//class BetaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 베타고입니다.");
//	}
//	public void stop() {
//		System.out.println("베타고가 점수계산을 합니다.");
//	}
//}
//class GammaGo implements Ai {
//	public void play() {
//		System.out.println("인공지능은 감마고입니다.");
//	}
//	public void stop() {
//		System.out.println("감마고가 점수계산을 합니다.");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Baduk baduk1 = new Baduk(new AlphaGo());
//		baduk1.play();
//		baduk1.stop();
//		
//		System.out.println("-------------------");
//		Baduk baduk2 = new Baduk(new BetaGo());
//		baduk2.play();
//		baduk2.stop();		
//		
//		System.out.println("-------------------");
//		Baduk baduk3 = new Baduk(new GammaGo());		
//		baduk2.play();
//		baduk2.stop();
//	}
//}
////ex82) 예외처리 -> 지금하는 문법은 -> 마지막에 1가지를 하기 위한
//// 중간과정일뿐이다.
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("프로그램을 시작합니다.");
//		// 1. 어? Exception이 발생했다네??
//		// 2. 어? 프로그램이 중단되었네?....
//		// 3. 프로그램에서 문제가 발생했을 때
//		// 운영체제는 예외를 발생시키는데
//		// 프로그램을 중단시키는 것이 주 목적이 아니고
//		// 예외가 발생했다는것을 프로그래머에게 알리는것이 목적입니다.
//		
//		// 이때 아래와같은 상황에서 프로그램을 ***중단시키길 원하지 않는다면***
//		
//		//2
//		try {
//			// int a = 7/1; 일때는 catch의 명령문이 실행되지않는다. 
//			// int a = 7/0; 일때는 catch의 명령문 "분모에는 0이 올 수 없습니다."가 출력된다.
//			int a = 7/0;
//		} catch (Exception e) {
//			System.out.println("분모에는 0이 올 수 없습니다.");
//			//Arithmatic Exception
//			e.printStackTrace(); // 예외를 출력해주는 명령어 -> 이를 통해서 예외의 종류를 알 수 있다.
//		}
//		System.out.println("-------------------------");
//		//1
//		int[] ar = new int[3];
//		try {
//			ar[3] = 100;
//		} catch (Exception e) {
//			//ArrayIndexOutOfBoundsException
//			e.printStackTrace();
//		}
//		System.out.println("호랑이");
//		System.out.println("-------------------------");
//		//3
//		// s는 객체가 아니다. (명시적인 표현)
//		String s = null;
//		s= "무궁화 꽃이 피었습니다.";
//		System.out.println(s.length());
//		s=null;
//		// 객체가 아닌 놈은 도트 찍어 먹을 수 없다. 이경우에는 Exception이 뜬다.
//		try {
//			System.out.println(s.length());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//NullPointerException -> 객체가 아닌 놈을 객체처럼 사용할 경우
//		System.out.println("호랑이");
//	}
//}
////ex83) 
//class Tiger{
//	void m1() {
//		System.out.println("함수 1 콜");
//		// 기억하세요 : Unhandled exception -> 왜 예외가 발생했는데 받을 수 있는 조치를 취하지 않는가? -> try catch를 왜 안쓰는가?
//		try {
//			throw new Exception(); // 의도적으로 예외를 던져주는 코드
//		} catch (Exception e) {
//			
//		}
//
//	}
//	void m2() throws Exception { // 이런 방식으로도 Exception이 있더라도 코드를 실행할 수 있다.
//		// 그렇다면 얘가하는 일이 뭘까? -> 떠넘기기 -> 이 함수를 사용하는 놈이 Exception 처리를 해라
//		System.out.println("함수 2 콜");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t = new Tiger();
//		t.m1();
//		// 이런식으로 사용하는 놈에게 떠넘기는게 throws Exception 함수이다. -> 이런 경우에는 한줄처리한다.
//		try {t.m2();} catch (Exception e) {}
//		System.out.println("호랑이");
//		
//	}
//}
////ex84) 
//// 시간지연을 시켜보자
//// sleep : 개발자가 설정한 특정조건을 만족할때까지
//// 프로그램을 더이상 진행시키지 못하는 함수이다. (블로킹함수라고 한다.)
//// try catch를 사용하는 함수 : Thread.sleep(); -> 이외에도 자바에는 (try catch가 필요한, Unhandled Exception이 뜨는, throw Exception류 함수)가 많다.
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("강아지");
//		// 인자 1000 은 1000 밀리세컨, 1초를 의미한다. -> 1초 쉬어라
//		try {Thread.sleep(1000);} catch (Exception e) {}
//		System.out.println("호랑이");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("호랑이 "+i);
//			try {Thread.sleep(1000);} catch (Exception e) {}
//		}
//	}
//}
////ex85) 
//class Tiger{
//	int m1() {
//		System.out.println(1);
//		return 100;
//	}
//	void m2(int a, int b) {
//		System.out.println("코끼리");
//		System.out.println((a>b)?"앵무새1":"앵무새2");
//		System.out.println("독수리");
//	}
//	void m3(int a, int b) {
//		System.out.println("코끼리");
//		try {
//			if (a>b) {
//				System.out.println("앵무새1");
//			} else {
//				return;
//			}			
//		} catch (Exception e) {
//
//		}finally { // try 안에서 무슨사건이 벌어지던간에, finally의 코드는 무조건 실행하게된다.
//			// 이 코드와 같이 무조건 실행하고 싶은 코드가 있을 경우에 사용해 보자
//			System.out.println("독수리");			
//		}
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t = new Tiger();
//		t.m2(20, 10);
//		System.out.println("--------------------------");
//		t.m3(20, 10);
//		System.out.println("--------------------------");
//		t.m3(10, 20);
//	}
//}
//ex86) [숫자] 그리고 [문자열]
//public class Hello{
//	public static void main(String[] args) {
//		int a = 10;
//		String b = "호랑이"; // 문자열
//		String c = "1234"; // ? -> 문자열이다.
//		
//		System.out.println(a+10);
//		System.out.println(b+10);
//		System.out.println(c+10);
//		
//		// 형변환 : 숫자 -> 문자
//		int n1 = 123;
//		String s1 = Integer.toString(n1);
//		// sugar code
//		String s2 =""+n1;
//		
//		String s3 = "8888";
//		int n3 = Integer.parseInt(s3);
//		// 아래는 변경이 잘 됐는지 확인하는 코드이다.
//		System.out.println(n3+1);
//	}
//}
////ex87) String 클래스의 함수들
//public class Hello{
//	public static void main(String[] args) {
//		
//		String s = "무궁화꽃이피었습니다꽃이";
//		// 1번째 함수
//		System.out.println(s.length());
//		// 2번째 함수
//		System.out.println(s.charAt(1));
//		// 유효범위를 벗어날 경우에는 Exception이 발생한다.
//		
//		// 검색에 실패했을 경우에 나타나는 현상
//		// 1. Exception이 발생하던지
//		// 2. 아니면 음수값이 리턴 -> 대부분 -1이 출력
//		// System.out.println(s.charAt(100));
//		// 3번째 함수
//		System.out.println(s.indexOf("화꽃이"));
//		// 아래처럼 s.indexOf()의 검색이 실패(검색어가 문장내에 없을 경우) -> -1 이뜬다.
//		System.out.println(s.indexOf("화 꽃이"));
//		int num = s.indexOf("화꽃이");
//		if(num==-1) {
//			System.out.println("검색에 실패했습니다.");
//		}else {
//			System.out.println(num+"번에서 찾았습니다.");
//		}
//		// 4번째 함수 -> replace
//		// 못찾으면
//		String s2 = s.replaceAll("꽃이", "나무가");
//		System.out.println(s2);
//		// 아래 처럼 첫번째 인자가 문장내에 없으면 바꿔치기가 안된다.
//		// 모두가 변경된다. -> s문장에서 "꽃이"가 여러개라면 모두 "나무가"로 변경된다.
//		// 원본데이터는 변경되지 않는다.(중요) 내용을 복사해서 리턴할뿐
//		String s3 = s.replaceAll("꽃이토끼", "나무가");
//		System.out.println(s3);
//		
//		// 5번째 함수 -> substring
//		String s4= s.substring(5);
//		System.out.println(s4);
//		
//		// 오버로딩 문법이 성립되었다.
//		// 인덱스 번호 3번부터 5번앞까지 잘라온다.
//		// 인수 두개짜리 substring 은 끝자리 숫자를 넣지 않는다.
//		String s5= s.substring(3,5);
//		System.out.println(s5);
//		
//		// 6번쨰 함수
//		// .toUpperCase()는 모든 소문자를 대문자로 바꿔준다. -> 대문자만 있는 문장/단어로 만들어준다.
//		// .toLowerCase()는 모든 대문자를 소문자로 바꿔준다. -> 소문자만 있는 문장/단어로 만들어준다.
//		String s6 = "Apple";
//		System.out.println(s6.toUpperCase());
//		// 단 이함수도 마찬가지로 원래의 문장을 변화시키지는 않는다.
//		System.out.println(s6);
//		System.out.println(s6.toLowerCase());
//		
//		String s7 = "   App   le   ";
//		// 7번째 함수
//		// 문장 맨앞과, 맨뒤의 공백을 없애주는 함수 .trim()
//		System.out.println(s7.trim());
//		
//		// 8번쨰 함수 배열을 문자열로 변환하는 코드이다.
//		// -문자를 다루기 위해서 사용한 타입은(char)
//		byte[] data1 = new byte[] {65, 'B', 'C', 'D'};
//		char[] data2 = new char[] {'E','F','G'};
//		String s8 = new String(data1, 0, data1.length);
//		String s9 = new String(data2, 0, data2.length);
//		System.out.println(s8);
//		System.out.println(s9);
//		
//		// 이렇게 쓰는 이유 -> 데이터 통신에서는 유일하게 "byte"타입만을 이용해서 통신한다.
//		String s10 = "Banana";
//		byte [] recv1 = s10.getBytes();
//		for (byte b : recv1) {
//			System.out.println((char)b);
//		}
//		System.out.println("---------------------");
//		String s11 = "Banana";
//		char [] recv2 = s11.toCharArray();
//		for (char c : recv2) {
//			System.out.println(c);
//		}
//	}
//}
////ex88) 진법
//// 인간이 사용하기 편한 진법은 10진법이다.
//// 컴퓨터가 사용하기 편한 진법은 2진법이다.
//// 인간과 컴퓨터가 상호절충한 진법이 16진법이다.
//// 10진법 : 숫자를 사용할 때 사용할 수 있는 문자의 개수가 10개이다.
////			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
//// 16진법: 숫자를 사용할때 사용할 수 있는 문자의 개수가 16개이다.
////			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F}
//// 2진법 : 숫자를 사용할때 사용할 수 있는 문자의 개수가 2개이다.
////			{0, 1}
//
//public class Hello{
//	public static void main(String[] args) {
//		
//	}
//}
////ex89) 
//public class Hello{
//	public static void main(String[] args) {
//		int n1 = 13;
//		int n2 = 0x13; // 16진수 13 = 10진수 19 // 16진수를 나타내기 위해서는 앞에 0x를 붙이면 된다.
//		int n3 = 0xAB;
//		System.out.println(n1+" "+n2+" "+n3);
//		// 10진수든지, 혹은 16진수이던간에
//		// 2진수를 나타낼 수 있는 표준클래스가 없는가?
//		int n4 =0x1234af;
//		// 0001 0010 0011 0100 1010 1010 1111
//		// 0001001000110100101010101111
//		String s = Integer.toBinaryString(n4);
//		System.out.println(s);
//		// 이거를 4개씩 띄어서 쓸수는 없을까?
//		// 직접 짜야한다!.....
//		// 총 32비트를 유지하면서, 4자리씩 끊어서 출력
//		System.out.println("------------------------------");
//		
//		System.out.println(hexaToBinary(n4));
//		String s7 = "호랑이";
//		System.out.println(s7);
//		System.out.println(s7.hashCode());
//		// "호랑", "코랑이", "0호랑이" -> 할수 없다.
//		s7 = "0"+s7;
//		// 되는데요?
//		System.out.println(s7);
//		System.out.println(s7.hashCode());
//		// 해쉬코드를 비교해봐라, 변수명만 같다 뿐이지, 새로만들어진 객체이다.
//		// 즉 String은 데이터를 수정/ 갱신할 수 없다.
//		
//		// 이런상황에서 사용할 수 있는것이 스트링 버퍼이다.
//	}
//	static String hexaToBinary(int n) {
//		String s= Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
//		while(s.length()<32) {
//			s = "0"+s;
//		}
//		System.out.println(s);
//		// 첫번째 방법
//		String s2 = "";
//		for (int i = 0; i < 8; i++) {
//			s2=s2+s.substring(i*4, i*4+4)+" ";
//		}
//		System.out.println(s2);
//		
//		// 두번째 방법
//		StringBuffer s1 = new StringBuffer(s);
//		for (int i = 0; i < 7; i++) {
//			s1.insert((7-i)*4, ' ');
//		}
//		System.out.println(s1);
////		 // 세번째 방법 -> 이 아니라 이거는 틀린 방법이다!!!!!!!
////		 // 앞에서부터 스페이스를 넣어 버린다면 뒤로갈수록 index의 오차가 한칸씩 나게 된다.
////		StringBuffer s3 = new StringBuffer(s);
////		for (int i = 0; i < 7; i++) {
////			s1.insert((i+1)*4, ' ');
////		}
////		System.out.println(s3);
//		// 세번째 방법
//		// 위의 문제를 인식하고 있기에, 이를 고려하여 인덱스에 들어갈 i 변수를 지정해 준다.
//		StringBuffer s3 = new StringBuffer(s);
//		System.out.println(s3+": 기존의 s3");
//		System.out.println(s3.hashCode()+": 기존의 s3의 해쉬코드");
//		for (int i = 0; i < 7; i++) {
//			s3.insert((i+1)*4+i, ' ');
//		}
//		System.out.println(s3+": for문 이후의 s3");
//		System.out.println(s3.hashCode()+": for문 이후의 s3의 해쉬코드");
//		// String은 안의 내용을 갱신할 수 없으며, 갱신한것 처럼 보여도 다른객체이지만, 
//		// String버퍼는 출력을 보면 알 수 있듯이, hash코드가 유지되는 것을 통해 동일한 객체가 안의 데이터만 변경됐음을 알 수 있다.
//		return s1.toString();
//
//	}
//}
////ex90) 
//public class Hello{
//	public static void main(String[] args) {
//		// 동일한 물건들이 들어가는 상자 -> 컨테이너
//		// 컬렉션중에 1개 LinkedList를 사용한다.
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//		int num = mm.size();
//		System.out.println(num);
//		System.out.println(mm.size());
//		
//		mm.add(100);
//		System.out.println(mm.size());
//		for (int i = 0; i < 10; i++) {
//			mm.add(i*10+1);
//		}
//		System.out.println(mm.size());
//		// CRUD -> Read
//		// 3가지 방법이 있다.
//		// 1. 활용성이 없다.
//		System.out.println(mm);
//		
//		// 2. 활용빈도수가 가장 높다.
//		// for문을 이용하는 방법
//		for (int i = 0; i < mm.size(); i++) {
//			System.out.print(mm.get(i)+", ");
//		}System.out.println();
//		
//		// 3. forEach(간략화된 for문)
//		// 주로 data, value, item 이라는 변수를 사용한다.
//		for (Integer item : mm) {
//			System.out.print(item+" ,");
//		}System.out.println();
//		
//		int data = mm.get(4);
//		System.out.println(data);
//		
//		// 참고 - 배열도 forEach문 사용가능
//		int[] ar = {10, 20, 30};
//		for (int value : ar) {
//			System.out.print(value+", ");
//		}System.out.println();
//		
//		System.out.println("--------------------------------------------");
//		
//		// CRUD -> Update
//		mm.set(5, 999);
//		System.out.println(mm);
//		System.out.println("--------------------------------------------");
//		
//		// CRUD -> Delete
//		// (Delete, Remove, Erase)
//		mm.remove(5);
//		System.out.println(mm);
//	}
//}
////ex91) 검색관련 프로그램
//public class Hello{
//	public static void main(String[] args) {
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//		for (int i = 0; i < 20; i++) {
//			mm.add(i*10+1);
//		}
//		System.out.println(mm);
//		System.out.println("-----------------------------------------------------------------------------------------");
//		int num = 191;
//		for (int i = 0; i < mm.size(); i++) {
//			if(mm.get(i)==num) {
//				System.out.println(mm);
//				System.out.println(i+"번 인덱스의 숫자가 찾으시는 숫자 "+num+"입니다.");
//				System.out.println("삭제하겠습니다.");
//				mm.remove(i);
//				System.out.println(mm);
//				break;
//			}
//			if(i==mm.size()-1) {
//				System.out.println("못 찾았습니다.");
//			}
//		}
//	}
//}
////ex92) 
//public class Hello{
//	public static void main(String[] args) {
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//		mm.add(33);
//		mm.add(44);
//		mm.add(77);
//		for (int i = 0; i < 10; i++) {
//			mm.add(i*2);
//		}
//		mm.add(101);
//		mm.add(102);
//		mm.add(103);
//		System.out.println(mm);
//		System.out.println(mm.size()+"개의 데이터가 들어있습니다.");
//		System.out.println("-----------------------------------------------------------------------------------------");
//		
//		//eliminateEven1(mm);
//		eliminateEven2(mm);
//	}
//	static void eliminateEven1(LinkedList<Integer> A) {
//		for (int i = A.size()-1; i >=0; i--) {
//			if(A.get(i)%2==0) {
//				System.out.println(i+"번 index의 데이터"+A.get(i)+"를 삭제하겠습니다.");
//				A.remove(i);
//				
//			}
//		}
//		System.out.println("짝수 데이터의 삭제를 완료했습니다.");
//		System.out.println(A);
//	}
//	static void eliminateEven2(LinkedList<Integer> A) {
//		int j = 0;
//		for (int i =0;i<A.size(); i++) {
//			if(A.get(i)%2==0) {
//				System.out.println(j+"번 index의 데이터"+A.get(i)+"를 삭제하겠습니다.");
//				A.remove(i);
//				i--;
//			}
//			j++;
//		}
//		System.out.println("짝수 데이터의 삭제를 완료했습니다.");
//		System.out.println(A);
//	}
//}
////ex92) 
//public class Hello{
//	public static void main(String[] args) {
//		// 프로그램 검증을 하기 위하여 일반적으로
//		// 랜덤한 데이터를 생성시켜서 테스트를 많이 한다.
//		// 시뮬레이션 데이터( 모사 데이터 )
//		Random rand = new Random();
//		for (int i = 0; i < 10; i++) {
//			int num = rand.nextInt(100)+1;  // 1~100 까지 랜덤한 숫자 생성, 0~100을 원한다면 rand.nexInt(101);
//			System.out.println(num);
//		}
//		System.out.println("---------------------");
//
//	for (int i = 0; i < 10; i++) {
//		
//		System.out.println(new Random().nextInt(100)+1);
//	}
//	System.out.println("---------------------");
//	}
//}
////ex94) 
//public class Hello{
//	public static void main(String[] args) {
//		Random rand = new Random();
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//		for (int i = 0; i < 10; i++) {
//			mm.add(rand.nextInt(100));
//		}
//		System.out.println(mm);
//		System.out.println("---------------------");
//		eliminateEven1(mm);
//	}
//	static void eliminateEven1(LinkedList<Integer> A) {
//		for (int i = A.size()-1; i >=0; i--) {
//			if(A.get(i)%2==0) {
//				System.out.println(i+"번 index의 데이터"+A.get(i)+"를 삭제하겠습니다.");
//				A.remove(i);
//				
//			}
//		}
//		System.out.println("짝수 데이터의 삭제를 완료했습니다.");
//		System.out.println(A);
//	}
//	static void eliminateEven2(LinkedList<Integer> A) {
//		int j = 0;
//		for (int i =0;i<A.size(); i++) {
//			if(A.get(i)%2==0) {
//				System.out.println(j+"번 index의 데이터"+A.get(i)+"를 삭제하겠습니다.");
//				A.remove(i);
//				i--;
//			}
//			j++;
//		}
//		System.out.println("짝수 데이터의 삭제를 완료했습니다.");
//		System.out.println(A);
//	}
//}
////ex95) 
//class Tiger{
//	// private, public,... 접근제한자.
//	private int a;
//	public int b;
//	int c; // 앞에 default가 생략돼있습니다.
//	private void m2() {
//		
//	}
//	void insert() {
//		this.a=10;
//	}
//	void print() {
//		System.out.println(this.a);
//	}
//}
//
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		// System.out.println(t1.a); // a는 프라이빗 변수
//		t1.insert();
//		t1.print();
//		// t1.m2(); // m2()는 private 함수
//		System.out.println(t1.b);
//	}
//}
////ex97) 
//class Tiger{
//	int money;			// 1. 욕을 얻어먹을 가능성이 높다. -> 게임을 예시로 일반 이용자가 자신의 돈을 임의로 늘릴 수 있다고 생각해보자
//	private int num;	// 2. 1번보다 일반적이다. -> 데이터 은닉
//	// 아래와 같이 객체의 변수를 수정하는 함수를 setter 함수라고 한다.
//	void setNum(int num) {
//		this.num=num;
//	}
//	// 아래와 같이 객체의 변수를 반환하는 함수를 getter함수라고한다.
//	int getNum() {
//		return this.num;
//	}
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		// t1.num = 100; -> 이런 프라이빗 변수를 외부에서 어떻게 조정해줄까?
//		// 이럴때는 함수를 이용해서 외부에서 변수에 접근한다.
//		t1.setNum(100);
//		System.out.println(t1.getNum());
//	}
//}
////ex97) -> 외부에 변수를 노출시키지 않는 것 -> 데이터 은닉
//class Tiger{
//	private int age;
//	private String name;
//	int getAge() {
//		return age;
//	}
//	void setAge(int age) {
//		this.age = age;
//	}
//	String getName() {
//		return name;
//	}
//	void setName(String name) {
//		this.name = name;
//	}
//	void showInfo() {
//		System.out.println(age+" "+name);
//	}
//	// 오른쪽 마우스 -> source ->generate getter and setter -> 게터 세터 자동생성!!
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		t1.setAge(10);
//		t1.setName("홍길동");
//		System.out.println(t1.getAge());
//		System.out.println(t1.getName());
//		t1.showInfo();
//	}
//}
////ex98) 
//// ************GoF 디자인 패턴************ 인터넷에서 찾아보자!!!!
//// 싱글톤 패턴 : 프로그램내부에서 객체를 단 1개만 생성시킬 수 있도록
//// 클래스를 제작하는 기법(패턴)을 싱글톤 패턴이라고 한다.
//// 대체로 클래스의 규모가 크다. -> 이러한 클래스의 객체를 여러개 생성한다면, 자원을 많이 소모하게된다.
//class Tiger{
//	static Tiger t = null;
//	private Tiger(){}// 객체 생성을 막을 수 있다. -> 싱글톤 패턴으로 갈 확률이 높다!
//	static Tiger getObject() {
//		System.out.println(1);
//		if( t==null) {		
//			System.out.println(2);
//			Tiger.t = new Tiger();
//		}
//		return Tiger.t;
//	}
//	void m1() {
//		System.out.println("호랑이");
//	}
//}
//class Apple{}
//public class Hello{
//	public static void main(String[] args) {
//		
//		// Tiger t2 = new Tiger(); // -> 싱글톤 패턴이 아니다 -> 실수라고 해석할 수 있다.
//		Tiger t1 = Tiger.getObject();
//		Tiger t2 = Tiger.getObject();
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
//		
//		Apple a1 = new Apple();
//		Apple a2 = new Apple();
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		if(a1==a2) {
//			System.out.println("O");
//		}else {
//			System.out.println("X");
//		}
//		System.out.println((t1==t2)?"O":"x");
//		t1.m1();
//	}
//
//}
////ex99) 파일 입출력( File I/O ) : 싸인펜을 사용하는것과 같다. -> 사용 다하면 뚜껑을 닫아줘야한다.
//public class Hello{
//	public static void main(String[] args) {
//		// 싸인펜 뚜껑을 열었다.
//		try {Writer w = new FileWriter("test01.txt");
//		w.write("바나나\n");
//		w.write("호랑이");
//		// 싸인펜 뚜껑을 닫는다.
//		w.close();
//		} catch (Exception e) {}
//		// ***프로그램이 끊기지 않고 끝까지 진행됐음을 확인하는 코드다***
//		System.out.println("Exit");
//	}
//}

////ex100) 
//public class Hello{
//	public static void main(String[] args) {
//		// 싸인펜 뚜껑을 열었다.
//		try {
//		Writer w = new FileWriter("test01.txt");
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 8; j++) {
//				w.write((i+j)%2==0?"한":"글");
//			}
//			w.write("\n");
//		}
//		w.close();
//		} catch (Exception e) {}
//		// *** 프로그램이 끊기지 않고 끝까지 진행됐음을 확인하는 코드다 ***
//		System.out.println("Exit");
//	}
//}

////ex101) 
//public class Hello{
//	public static void main(String[] args) {
//		int a = 100000;
//		short b;
//		
//		b=(short)a; // 타입 캐스팅이라고 한다.
//		System.out.println(b);
//		System.out.println("--------------------------------");
//		try {
//			Reader r = new FileReader("test01.txt");		
//			while(true) {
//				int readData = r.read();
//				if(readData == -1) {
//					System.out.println("파일을 끝까지 읽음");
//					break;
//				}
//				System.out.println((char)readData);
//			}
//			r.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println("Exit");
//	}
//}
////ex102) 
//class A{
//	void greenColor() {
//		System.out.println(1);
//	}
//}
//
//// 아래의 어노테이션은 interface안의 함수는 한개만 있어야 한다라는 제한사항을 걸어준다.
//@FunctionalInterface
//interface C{
//	void m1();
//}
//class B extends A{
//	// 어노테이션 문법
//	// 아래의 함수는 오버라이드 함수라는 것을 알려주는 코드
//	// 실수를 미연에 방지하기위한 문법
//	@Override
////	void greencolor() { -> 이런식으로 오타가 떴을때 수정하라고 알려줌
////		
////	}
//	void greenColor() {
//		
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		
//	}
//}

////ex103-2) 
//class AA{}
//class BB extends AA{}
//class CC extends AA{}
//public class Hello{
//	public static void main(String[] args) {
//		AA a1 = new BB();
//		AA a2 = new CC();
//		
//		//
//		AA a3 = new BB();
//		System.out.println(a3.hashCode());
//		a3 = new CC();
//		// 둘의 해쉬코드는 다르다. -> 둘은 다른 객체이다.
//		System.out.println(a3.hashCode());
//		a3 = new BB();
//		System.out.println(a3.hashCode());
//	}
//}
////ex103-3) 103-2)와 달리 새로이 객체를 덮어 씌우더라도 객체 내부에 기존의 객체정보를 백업할 수 있도록 하는 방법을 제시한다.
//// Gof 의 decoration 패턴이다.
//class A{
//	int num = 30;
//	int run() {
//		System.out.println("A run");
//		return num;
//	}
//}
//class B extends A{
//	int num = 20;
//	A a;
//	B(A a){
//		this.a = a;
//	}
//	int run() {
//		System.out.println("B run");
//		return num+a.run();
//	}
//}
//class C extends A{
//	int num = 20;
//	A a;
//	C(A a){
//		this.a = a;
//	}
//	int run() {
//		System.out.println("C run");
//		return num+a.run();
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		A a = new A();
//		// a.run();
//		a = new B(a); // 새로운 객체를 대입받아 처음의 객체가 소멸되기 직전에 새로이 생성된 객체 내부에 백업을 받았다
//		System.out.println(a.run());
//		a = new C(a);
//		System.out.println(a.run());
//	}
//}
////ex103-3)
//class 커피{
//	int 가격 = 30;
//
//	int 계산() {
//		System.out.println("커피 주문");
//		return 가격;
//	}
//}
//class 설탕 extends 커피{
//	int 가격 = 20;
//	커피 a;
//	설탕(커피 a){
//		this.a = a;
//	}
//	int 계산() {
//		System.out.println("설탕 주문");
//		return 가격+a.계산();
//	}
//}
//class 프림 extends 커피{
//	int 가격 = 10;
//	커피 a;
//	프림(커피 a){
//		this.a = a;
//	}
//	int 계산() {
//		System.out.println("프림 주문");
//		return 가격+a.계산();
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		커피 손님 = new 커피();
//		//System.out.println(손님.계산());
//		손님 = new 설탕(손님);
//		손님 = new 프림(손님);
//		손님 = new 프림(손님);
//		손님 = new 설탕(손님);
//		손님 = new 설탕(손님);
//		System.out.println(손님.계산());
//	}
//}
////ex104-1) 문제점 : 사용하는 데이터의 타입이 바뀔 때 마다 새로운 클래스를 만들어야한다.
//class A{
//	private int data;
//	int getData() {return data;}
//	void setData(int data) {this.data = data;}
//	
//}
//class B{
//	private String data;
//	String getData() {return data;}
//	void setData(String data) {this.data = data;}
//	
//}
//class C{
//	private float data;
//	float getData() {return data;}
//	void setData(float data) {this.data = data;}
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		A a = new A();
//		a.setData(100);
//		System.out.println(a.getData());
//		
//		B b = new B();
//		b.setData("호랑이");
//		System.out.println(b.getData());
//		
//		C c = new C();
//		c.setData(0.3f);
//		System.out.println(c.getData());
//	}
//}
////ex104-2) 
//class Tiger<T>{ // -> 사용하고 싶은 타입을 컨테이너 안에 명시해서 써라 -> 이 문법을 generic 문법이라고 한다. 
//	// -> 메모리/속도 적인 측면에서는 이득을 볼 수는 없다, 단지 프로그래머 입장에서 작성의 용이성때문에 사용하는 문법
//	private T data;
//	T getData() {return data;}
//	void setData(T data) {this.data = data;}
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger<Integer> t1 = new Tiger<Integer>();
//		t1.setData(100);
//		System.out.println(t1.getData());
//		
//		Tiger<String> t2 = new Tiger<String>();
//		t2.setData("호랑이");
//		System.out.println(t2.getData());
//		
//		Tiger<Float> t3 = new Tiger<Float>();
//		t3.setData(3.14f);
//		System.out.println(t3.getData());
//		
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//	}
//}
////ex105) // 여러개의 프로세스를 이용해 작성하는 프로그램 -> 쓰레드 프로그램이라고 한다. // ex) 프로그램 A와 프로그램 B를 와리가리 타면서 하는 프로그램
//// 동시에 실행되는 것 처럼 느껴지는 게 장점이다.
//class A{
//	void start() {
//		System.out.println("start call");
//		run();
//	}
//	void run() {
//		System.out.println("A run call");
//	}
//}
//class B extends A{
//	@Override
//	void run() {
//		System.out.println("Thread start");
//		System.out.println("B run call");
//		System.out.println("Thread End");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		A a = new B();
//		a.start();
//	}
//}
////ex106) 
////(105번의)B              A
//class Tiger extends Thread{
//	Tiger(String name){
//		super(name);
//	}
//	public void run() {
//		System.out.println("Thread start");
//		System.out.println("B run call");
//		System.out.println("Thread End");
//		System.out.println(currentThread().getName());
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("자바");
//		Thread t = new Tiger("양민재");
//		t.start();
//		//try {Thread.sleep(1000);} catch (Exception e) {}
//		try {t.join();} catch (Exception e) {}
//		// 이런경우에는 단순히 1000이라는 상수를 주어 sleep시키기보다는 join을 통해 코드를 작성하는것이 바람직하다.
//		// ** sleep 주석 전 **
////		자바
////		Thread start
////		B run call
////		Thread End
////		main 프로그램 종료
//		
//		// ** sleep 주석 후 **
////		자바
////		main 프로그램 종료
////		Thread start
////		B run call
////		Thread End
//		System.out.println("main 프로그램 종료");
//	}
//}
////ex107) 
//class Tiger extends Thread{
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("호랑이"+i);
//			// 0초 쉬세요가 아니다. -> 쉬지마세요 이말이 아니다.
//			// 0에 가까운 최소의 시간을 쉬어라
//			//try {Thread.sleep(0);} catch (Exception e) {}
//		}
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("main start");
//		Thread t = new Tiger();
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println("코끼리"+i);
//			try {Thread.sleep(0);} catch (Exception e) {}
//		}
//	}
//}
////ex108-1) 
//class Tiger extends Thread{
//
//}
//public class Hello{
//	public static void main(String[] args) {
//		// try {Thread.sleep(2000);} catch (Exception e) {} // 블로킹 함수 -> 특정 조건이 만족되기 전까지, 프로그램 실행을 중단시키는 함수
//		Scanner sc  = new Scanner(System.in); 
//		System.out.print("숫자를 입력하시오:");
//		int num = sc.nextInt(); // 얘도 숫자를 입력할때 까지 기다리니깐 블로킹 함수 -> 블로킹 함수사용시에는 프로그램이 항상 중복실행 될 수 있으므로, 디버그 창 열고 프로그램 실행
//		System.out.println(num*20);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("숫자를 입력하시오:");
//			int n = sc.nextInt();
//			if(n == 999) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//			System.out.println(n*1000);
//		}
//		sc.close();
//	}
//}
////ex108-2) 
//class Tiger extends Thread{
//
//}
//public class Hello{
//	public static void main(String[] args) {
//		// try {Thread.sleep(2000);} catch (Exception e) {} // 블로킹 함수 -> 특정 조건이 만족되기 전까지, 프로그램 실행을 중단시키는 함수
//		Scanner sc  = new Scanner(System.in); 
//		System.out.println(1);
//		// Scanner의 목적
//		// 1. 블로킹만 잡는게 목적.
//		sc.nextInt();
//		System.out.println(2);
//		new Scanner(System.in).nextInt();
//		System.out.println(3);
//	}
//}
////ex109) 
//class Tiger extends Thread{
//	public void run() {
//		System.out.println("호랑이가 발동됨");
//		Thread t = new Lion();
//		t.start();
//		new Scanner(System.in).nextInt();
//		System.out.println("호랑이가 종료됨");
//	}
//}
//class Lion extends Thread{
//	public void run() {
//		System.out.println("사자가 발동됨");
//		new Scanner(System.in).nextInt();
//		System.out.println("사자가 종료됨");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("메인이 발동됨");
//		Thread t = new Tiger();
//		t.start();
//		new Scanner(System.in).nextInt();
//		System.out.println("메인이 종료됨");
////		메인이 발동됨
////		호랑이가 발동됨
////		사자가 발동됨
//		
////-------여기까지는 고정-------
//		
////		1
////		메인이 종료됨
////		1
////		1
////		호랑이가 종료됨
////		사자가 종료됨
//
//	}
//}
////ex110) 
//// 프로그래머 들의 협업을 위한 사이트 -> 깃허브
//class Lion extends Thread{
//	public void run(){
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}
//		System.out.println("사자 종료됨");
//	}
//}
//class Tiger extends Thread{
//	public void run(){
//		for (int i = 0; i < 3; i++) {
//			System.out.println("네트워크 접속을 기다립니다.");
//			// 오랜시간동안 접속을 기다리고 있는 상태를 상정
//			try {Thread.sleep(500);} catch (Exception e) {}
//			
//			System.out.println(i+"번째 사자가 접속하였습니다.");
//			Thread lion = new Lion();
//			lion.start();
//			try {
//				lion.join();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Thread t = new Tiger();
//		t.start();
//	}
//}

////ex111) 
//interface A{
//	void m1();
//}
//class Tiger extends Thread{
//	public void run() {
//		
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		A t1 = new A() {
//			public void m1() {
//				System.out.println(1);
//			}
//		};
//		t1.m1();
//		new A() {
//			public void m1() {
//				System.out.println(2);
//			}
//		}
//		.m1();
//		Thread t2 = new Thread() {
//			public void run() {
//				System.out.println(3);
//			}
//		};
//		t2.start();
//		new Thread() {
//			public void run() {
//				System.out.println(4);
//			}
//		}.start();
//	}
//}
////ex112) 도서 관리 프로그램
//class Book{
//	String name;
//	String author;
//	String publisher;
//	int price;
//	Book(String name, String author, String publisher, int price) {
//		this.name = name;
//		this.author = author;
//		this.publisher = publisher;
//		this.price = price;
//	}
//	void showInfo() {
//		System.out.println(
//				name+" / "+
//				author+" / "+
//				publisher+" / "+
//				price
//				);
//	}
//
//}
//public class Hello{
//	public static void main(String[] args) {
//		
//		// Create
//		LinkedList<Book> mm = new LinkedList<Book>();
//		mm.add( new Book("자바를 배우자", "홍길동", "열심히 출판사1", 2500));
//		mm.add( new Book("선녀와 나무꾼", "전래씨", "열심히 출판사4", 2000));
//		mm.add( new Book("토끼와 거북이", "작자미상", "열심히 출판사1", 1000));
//		mm.add( new Book("늦잠자는법", "게으름", "열심히 출판사2", 1500));
//		mm.add( new Book("젊은 베르테르의 슬픔", "몰라", "열심히 출판사3", 5000));
//		System.out.println("책의 권수: "+mm.size());
//		
//		// Read
//		for (Book book : mm) {
//			book.showInfo();
//		}
//		System.out.println("--------------------------------------");
//		Book book = mm.get(2);
//		book.showInfo();
//		System.out.println("--------------------------------------");
//		
//		// Update
//		mm.set(3, new Book("일찍 일어나는법", "일찍이", "열심히 출판사6", 4500));
//		for (Book item : mm) {
//			item.showInfo();
//		}
//		System.out.println("--------------------------------------");
//		
//		// search
//		Book findBook = search(mm,"몰라");
//		if(findBook!=null) {
//			System.out.println("찾았다");
//			findBook.showInfo();
//		}else {
//			System.out.println("저자를 찾지 못했습니다.");
//		}
//	}
//	static Book search(LinkedList<Book> bookList, String name) {
//		for (Book book : bookList) {
//			if(book.author.equals(name)) {//  String 비교는 .equals로 한다.
//				return book;
//			} 
//		}
//		return null;// 이런식으로 if에 걸리지 않았을 경우도 리턴할 수 있도록 해야지 오류가 안뜬다.
//	}
//}
////ex113-1)
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println(false||false);
//		System.out.println(false||true);
//		System.out.println(true||false);
//		System.out.println(true||true);
//		System.out.println("------------------------");
//		System.out.println(false&&false);
//		System.out.println(false&&true);
//		System.out.println(true&&false);
//		System.out.println(true&&true);
//		System.out.println("------------------------");
//		System.out.println(!true);
//		System.out.println(!(3>2));
//	}
//}
////ex113-2)
//public class Hello{
//	static String hexaToBinary(int n) {
//		String s= Integer.toBinaryString(n);
//		while(s.length()<32) {
//			s = "0"+s;
//		}
//		String s2 = "";
//		for (int i = 0; i < 8; i++) {
//			s2=s2+s.substring(i*4, i*4+4)+" ";
//		}
//		return s2;
//	}
//	public static void main(String[] args) {
//		int n1 = 0x3b12cd59;
//		System.out.println(hexaToBinary(n1));
//		int n2 = 0x12345678;
//		System.out.println(hexaToBinary(n2));
//		System.out.println("_______________________________________");
//		System.out.println(hexaToBinary(n1|n2)); // 비트 or
//		System.out.println(hexaToBinary(n1&n2)); // 비트 and
//		System.out.println(n1);
//		System.out.println(Integer.toHexString(n1));
//		System.out.println("_______________________________________");
//		System.out.println(hexaToBinary(n1&0x0000ffff));
//		System.out.println(Integer.toHexString(n1&0x0000ffff));
//		// 이런식으로 비트 and연산은 특정부분의 정보를 용도에 맞게 필터링 하기 위해서 많이 쓰인다.
//		System.out.println(hexaToBinary(n1|0xffff0000));
//		// 특정 비트의 내용을 모두 1로 만들고 싶을때, 비트 or연산 사용
//		// 비트 시프트: ">>" "<<"
//		// ex ">>3" 오른쪽으로 3비트 시프트 하시오
//		System.out.println("_______________________________________");
//		System.out.println(hexaToBinary(n1));
//		System.out.println(hexaToBinary(n1>>4));
//	}
//}
////ex113-3)
//public class Hello{
//	static String hexaToBinary(int n) {
//		String s= Integer.toBinaryString(n);
//		while(s.length()<32) {
//			s = "0"+s;
//		}
//		String s2 = "";
//		for (int i = 0; i < 8; i++) {
//			s2=s2+s.substring(i*4, i*4+4)+" ";
//		}
//		return s2;
//	}
//	public static void main(String[] args) {
//		System.out.println("테스트1");
//		int n1 = 0x3b12cd59;
//		System.out.println(n1);
//		System.out.println(Integer.toHexString(n1));
//		System.out.println(hexaToBinary(n1));
//		// 0x 3b 12 cd 59;
//		// 0x59 -> 10진수로 얼마인가?
//		// 0xcd -> 10진수로 얼마인가?
//		// 0x12 -> 10진수로 얼마인가?
//		// 0x3b -> 10진수로 얼마인가?
//		System.out.println(Integer.toHexString(n1&0x000000ff));
//		System.out.println(n1&0x000000ff);
//		System.out.println();
//		System.out.println(Integer.toHexString(n1&0x0000ff00));
//		System.out.println(n1&0x0000ff00);
//		// 이렇게 하면 안된다. 비트 시프트로 cd 뒤의 00를 없애주자.
//		System.out.println("->");
//		System.out.println(Integer.toHexString((n1&0x0000ff00)>>8));
//		System.out.println((n1&0x0000ff00)>>8);
//		System.out.println();
//		System.out.println(Integer.toHexString((n1&0x00ff0000)>>16));
//		System.out.println((n1&0x00ff0000)>>16);
//		System.out.println();
//		System.out.println(Integer.toHexString((n1&0xff000000)>>24));
//		System.out.println((n1&0xff000000)>>24);
//	}
//}
////ex114)
//public class Hello {
//    public static void main(String[] args) {
//	ThreadEX threadex = new ThreadEX();
//	ThreadEX threadex2 = new ThreadEX();
//	Thread thread1 = new Thread(threadex,"A");
//	Thread thread2 = new Thread(threadex2,"B");
//		
//	thread1.start();
//	thread2.start();
//		
//	Thread.currentThread().getName();
//    }
//}
//
//class ThreadEX implements Runnable{
//
//    int TestNum=0;
//    @Override
//    public void run() {
//	// TODO Auto-generated method stub
//	for(int i=0;i<10;i++){
//		if(Thread.currentThread().getName().equals("A")){
//			System.out.println("=======================");
//			TestNum++;
//		}
//		System.out.println("ThreadName ="+Thread.currentThread().getName()+"TestNum ="+TestNum);
//			
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	 }
//      }
//}
////ex115)
//public class Hello {
//	 
//    public static void main(String[] args) {
//    // TODO Auto-generated method stub
//        Task task = new Task();
//            Thread t1 = new Thread(task);
//            Thread t2 = new Thread(task);
//            t1.setName("t1-Thread");
//            t2.setName("t2-Thread");
//             
//            t1.start();
//            t2.start();
//    }
// 
//}
// 
//class Account{
//    int balance = 1000;
//      
//    public synchronized void withDraw(int money){
//     
//        if(balance >= money){
//            try{
//                Thread thread = Thread.currentThread();
//                System.out.println(thread.getName() + " 출금 금액 ->> "+money);
//                balance -= money;
//                System.out.println(thread.getName()+" balance:" + balance);
//                 
//            }catch (Exception e) {}
//       
//        }
//    }
//}
//  
//class Task implements Runnable{
//    Account acc = new Account();
//      
//    @Override
//    public void run() {
//        while(acc.balance > 0){
//            // 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withDraw)한다.
//            int money = (new Random().nextInt(3)+1) * 100;
//            acc.withDraw(money);
//       
//        }
//    }
//}
////ex116)
//public class Hello{
//	static long startTime =0;
//	
//	public static void main(String[] args) {
//		ThreadEx th1 = new ThreadEx();
//		th1.start();
//		
//		startTime = System.currentTimeMillis();
////		try {
////			th1.join();
////		} catch (InterruptedException e) {
////		}
//		System.out.println("startTime-main : "+startTime);
//
//		for (int i = 0; i < 300; i++) {
//			System.out.print("|");
//		}
//		System.out.println("소요시간2:"+(System.currentTimeMillis()-startTime));
//		
//	}
//}
//class ThreadEx extends Thread{
//	static long startTime = 0;
//	public void run() {
//		startTime = System.currentTimeMillis();
//		System.out.println("startTime-Th : "+startTime);
//		for (int i = 0; i < 300; i++) {
//			System.out.print("-");
//		}
//		System.out.println("소요시간2:"+(System.currentTimeMillis()-startTime));
//	}
//}
////ex117-1)
//public class Hello{
//	public static void main(String[] args) {
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은 "+input+"입니다.");
//		
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//	}
//}
////ex117-2)
//public class Hello{
//	public static void main(String[] args) {
//		ThreadEx th1 = new ThreadEx();
//		th1.start();
//		
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은 "+input+"입니다.");
//	}
//}
//class ThreadEx extends Thread{
//	public void run() {
//		for (int i = 10; i >0 ; i--) {
//			System.out.println(i);
//			try {
//				sleep(1000);
//			} catch (Exception e) {
//			}
//			
//		}
//	}
//}
