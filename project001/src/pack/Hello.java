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
	private double ����_��緮=0;
	private double ����_Į�θ�=0;
	private double ����_Į�θ�=0;
	private int ��������=0;
	private int ź;
	private int ��;
	private int ��;
	void register_ur_rate(int a) {
		this.��������=a;
	}
	void register_ur_weight(double a) {
		this.weight=a;
	}
	void ���ʴ�緮() {
		double a=66+13.7*this.weight+5*height-6.8*age;
		this.����_��緮=a;
	}
	void ����Į�θ�() {
		double a= 1.55*this.����_��緮;
		this.����_Į�θ�=a;
	}
	void ����Į�θ�() {
		double a=this.����_Į�θ�*(100-this.��������)/100;
		this.����_Į�θ�=a;
	}
	void ź����() {
		this.ź=(int)this.����_Į�θ�*5/10/4;
		this.��=(int)this.����_Į�θ�*3/10/4;
		this.��=(int)this.����_Į�θ�*2/10/9;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight;
		int rate;
		System.out.print("����� �����Ը� �Է��Ͻÿ�:");
		weight=sc.nextDouble();
		System.out.print("Į�θ� ���� ������ �Է��Ͻÿ�:");
		rate=sc.nextInt();
		Hello C=new Hello();
		C.register_ur_weight(weight);
		C.register_ur_rate(rate);
		C.���ʴ�緮();
		C.����Į�θ�();
		C.����Į�θ�();;
		C.ź����();
		System.out.println("����� �Ϸ翡"+C.����_Į�θ�+"Į�θ��� �����ϰ�");
		System.out.println(C.ź+"g�� ź��ȭ��");
		System.out.println(C.��+"g�� �ܹ���");
		System.out.println(C.��+"g�� ������ �����ؾ��մϴ�.");
		sc.close();;
	}

}

/*
public class Hello 
{
	public static void main(String[] args) 
	{
		System.out.print("�ڹ�");
	}
}*/
//ex4)
/*public class Hello
{
	public static void main(String[] args) {
		//�������
		System.out.println(13+3);
		System.out.println(13-3);
		System.out.println(13*3);
		System.out.println(13/3);
		System.out.println(13%3);
		//�񱳿���(���迬��)
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
		// ������ ��ȿ����:-128~127
		// "=": ���Կ�����
		// ��� = ����;
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
		// ���� + ����
		System.out.println( 10 + 20);	// 30
		// ���� + ���ڿ�(	"ȣ����"	)
		System.out.println(10 + "ȣ����");	// 10ȣ����
		// ���ڿ� + ����
		System.out.println("ȣ����" + 10);	// ȣ����10
		// ���ڿ� + ���ڿ�
		System.out.println("ȣ����" + "�ڳ���");	// ȣ�����ڳ���
		System.out.println(3 + 4 + "ȣ����");		// 7ȣ����
		System.out.println(3 + "ȣ����" + 4);		// 3ȣ����4
		System.out.println("ȣ����" + 3 + 4);		// ȣ����34 // �߿�

		// ���ڸ� ����Ѵ�.
		System.out.println(123); //123
		// ���ڿ��� ����ϰ� �ִ�.
		System.out.println("123"); //123

		// + - << * /(�켱������ ����) << ()�� �켱������ ���� ����.
		System.out.println( 3 + 4 * 2 );	// 11
		System.out.println((3 + 4) * 2);	// 14

		System.out.println(2 + 3 * 4 + 5);	// 19
		System.out.println((2 + 3) * (4 + 5));	// 45

		System.out.println("100 + 200");	// 100 +200

		// ���� ����ϴ� �ڵ�
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
//		a = 20;// (20�� ���ͷ� �̶�� �Ѵ�.)
//		//
//		//	������ ������.
//		//
//
//		//
//		byte b;
//		b = 127;
//		System.out.println(Byte.MAX_VALUE ); // ����ض�
//		System.out.println(Byte.MIN_VALUE ); // ����ض� // Ŭ����.MIN_VALUE (����ƽ)
//		// 2����Ʈ �ּ���
//		short c;
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE );
//
//		// 4����Ʈ �ּ���
//		int d;
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE );
//
//		// 8����Ʈ �ּ���
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

		// �̰͵� ���������� 4����Ʈ �ּ���
		float b; // �Ҽ��� ���
		b = 10f;
		System.out.println(b);

		long c; // 8����Ʈ
		double d; // ���������� 8����Ʈ
		c = 20;
		d = 20;
		System.out.println(d);

		b = 3.14f;
		d = 3.14;

		//2����Ʈ �ּ���
		short e; // ����
		char f;  // ����
		f = 'A';
		f = '��';
		System.out.println(f);

		// 1����Ʈ �ּ���
		byte g;
		boolean h;
		h = false;

		// ǥ�� Ÿ��(type)
		// byte(1), short(2), int(4), long(8)/ float(4), double(8)/ char(2)/ boolean(1)
	}
}*/

////ex10)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		short a = 65; // int���� �������. �� �ڷ����� ũ�Ⱑ ��� 2����Ʈ���� ������� �ƴϴ�.
//		char b = 'A';
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println( (char)a ); // ����� ����ȯ
//		System.out.println( (short)b ); // ĳ������ �ƽ�Ű�ڵ带 �˱����ؼ��� �տ� (int) Ȥ�� (short)�� �ٿ�����
//		System.out.println("----------------------------");
//		char c = 'A' + 1; // �̷������� char���� ������ ���ϸ� �ٸ� ���ڷ� ���Ѵ�. 
//		// ���������δ� char���� ������ ���ϸ� char���� ��� ���������� ����ȯ�Ǿ� ��Ģ����� ��, ������� �ٽ� char������ ����ȯ���ش�.
//		// char c= 65 + 1
//		// (short)c = 66 
//		System.out.println(c); // B
//
//		char d = '��' + 5;
//		System.out.println(d);
//
//		char x = '��';
//		char y = '��';
//		char z = '��';
//		System.out.println((int)x);
//		System.out.println((int)y);
//		System.out.println((int)z);
//
//		char xx;
//		xx = 'A'; // (o)
//		char yy; 
//		yy = 65; // (x) // �������� ������� ������, (����) �Ϲ������� �̷������� �ڵ������� �ʴ´�.
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
//		System.out.println( app % bpp );// ��ⷯ��
//	}
//}
//ex12) ���� �۸��
/*public class Hello 
{
	public static void main(String[] args) 
	{
		// 1. �����̸��� �ߺ��ؼ� �۸��� �� ����.
		int apple;
		// int apple;

		// 2. ��ҹ��ڴ� (���������δ�) ���� �ٸ� �̸����� �ؼ��Ѵ�.
		// **������ ���ϴ� �۸���̴�.**
		int banana;
		int Banana;
		int baNana;

		// 3. **ù ���ڰ� ���ڰ� �ƴ϶�� ���ڸ� ����� �� �ִ�.**
		int kiwi2345;
		// int 9kiwi; (x)

		// 4. ( _, $ )�� ������ Ư�����ڴ� ����� �� ����.
		int _tiger;
		int lion_;
		int dog$;
		// int !cat;

		// 5. �ѱ��� ����� �� ������, ������� �ʴ°��� ����.
		int ���;
		��� = 10;
		System.out.println(���);

		// 6. �Ѵܾ� �̻��ϋ��� ��Ÿ(ī��) ǥ����� ����Ѵ�.
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
		int temp;// �ӽ�
		System.out.println(a + " " + b );

		// �ʱⰪ�� ������ ���� �ʴ� ������ ����� ������� �ؼ��� �ȵȴ�
		// System.out.println(temp);

		// ������ ��ȯ �˰���
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
//		// ������� >> �񱳿��� >> ������
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
//		// ��� �ȿ��� ����� ����� �� �ִ�.
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
		// 2�߿� 1���� �ݵ�� �����Ѵ�.
		if(true) {
			System.out.println("ȣ����");
		}
		else {
			System.out.println("�ڳ���");
		}
		int num = 199999;
		if( num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		int dn = 2109211;
		if( dn / 1000000 == 1 ) {
			System.out.println("����");
		}
		else {
			System.out.println("����");
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
//			System.out.println("����� ������ A�Դϴ�.");
//		}
//		else if( jumsu >= 80 ) {
//			System.out.println("����� ������ B�Դϴ�.");
//		}
//		else if( jumsu >= 70) {
//			System.out.println("����� ������ C�Դϴ�.");
//		}
//		else if( jumsu >= 60 ) {
//			System.out.println("����� ������ D�Դϴ�.");
//		}
//		else {
//			System.out.println("����� ������ F�Դϴ�.");
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
//		System.out.println("ȣ����");
//		// ex2) ���ٿ� �����͸� ��� ���� ������
//		for (int i = 0; i < 4; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("ȣ����1");
//		// ex3)
//		int num=8;
//		for (int i = 0; i < 10; i++) {
//			System.out.println(num + " * " + i + " = " + num*i);
//		}
//		// ex4)
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i+"ȣ����"+i*10);
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
//		// 2�� 8���� ����ϴ� ���α׷��̴�.
//		
//		// 3�� 4��
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
//		// ���丮�� ���ϴ� �ڵ�
//		int k,sum3;
//		k=5;
//		sum3=1;
//		for (int i = 0; i < k; i++) {
//			sum3=sum3*(i+1);
//		}
//		System.out.println(k+"���丮��="+sum3);
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
//				System.out.println(i+"�� 3�� ����Դϴ�."); // 0�� ��� �ڿ����� ����̴�.
//			}
//			else {
//				System.out.println(i+"�� 3�� ����� �ƴմϴ�.");
//			}
//		}
//	}
//}
////ex22)
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// while �ݺ���
//		// �ݺ�Ƚ���� �˰� ���α׷��� �ۼ��Ҷ� : for
//		// �ݺ�Ƚ���� �𸦶� : while�� ����Ѵ�.
//		
//		// ex1)
////		boolean state = false;
////		while(state) {
////			System.out.println("ȣ����");
////		}
////		System.out.println("����");
//		
//		// ex2) -> �̷������� ���ٿ��� for�� ����. ex3)�� �����ض�
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
//				System.out.println("�ݺ����� Ż���մϴ�.");
//				break;
//			}
//			num1++;
//		}
//	}
//}
////ex23) ��ڼ��� ����ϼ���.
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
//				System.out.println("Ż�� �Ϻ� ����");
//				break;
//			}
//		}
//		System.out.println("���α׷��� �����մϴ�.");
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
//		System.out.println(temp+"�� �������� : "+sum+"�Դϴ�.");
//		int a=4;
//		a=a/10;
//		System.out.println(a); // n���� ���� ���� n���� ���� ���� 0�̴�.
//		
//	}
//}
////ex25) 
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// break�� �ݺ������� ����� �� �ִ�.
//		// for������ break;�� ����� �� �ִ�.
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
//				System.out.println(n+"ȣ����");
//				continue;
//			}
//			System.out.println("������");
//			if(n>5) {
//				break;
//			}
//		}
//		System.out.println("����");
//		System.out.println("----------------------");
//		//ex2)
//		for (int i = 0; i < 20; i++) {
//			System.out.println(i);
//			if(i<4) {
//				continue;
//			}
//			System.out.println(i+"ȣ����");
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
//		// 1. switch �ȿ� ������ ����� �� �ִ�.
//		// 2. case �ڿ� ������ ����� �� ����.
//		// 3. ������ ���� ���������� �ƹ��͵� ������� �ʴ´�.
//		// 4. ������ ���� ��, default: break;�� ����� �� �ִ�.
//		// 5. Ȥ�� �Ǽ��� break;�� �����ϸ� ���� ������ �����մϴ�.
//		int num = 40;
//		int temp = 10;
//		switch (num) {
//		// ex) case temp: -> ����� �� ����.
//		case 10:
//			System.out.println("ȣ����");
//			break;
//		case 20:
//			System.out.println("�ڳ���");
//			break;
//		case 30:
//			System.out.println("�޹���");
//			break;
//		default:
//			System.out.println("�ش��ϴ� ���� �����ϴ�.");
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
//		// ������ ���� ������ ���� �۸���̴�.
//		int a1, a2, a3, a4, a5;
//		int a6, a7, a8, a9, a10;
//		// ��ó�� ���α׷��� �ۼ��ϴ� ������ �־���.
//		// ������ �Ѳ����� ���� �䱸�� �� �ִ� ������ �������.
//		// �̰��� �ٷ� �迭(array)�̶�� �մϴ�.
//		
//		// new
//		// int Ÿ������ �޸� 10�� �ּ���
//		// �׸��� �� �̸��� ar�̶�� �̸����� ����ϰڴ�.
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
//		// ���� �ڵ�� ����(exception)�� �߻��Ѵ�.
//		
//		System.out.println("ȣ����");
//		
//		// ****�޸𸮸� �䱸�Ҷ� �⺻������ 0���� ä������.****
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
//		// �迭�� for���� ��︱ �� �ִ�.
//		for (int i = 0; i < 5; i++) {
//			ar[i]=i*10+i;
//			System.out.println("ar["+i+"]:"+ar[i]);
//		}
//		System.out.println("----------------------");
//		//System.out.println(ar.length);
//		
//		for (int i = 0; i < ar.length; i++) {// �̷��� ���°� ����.
//			ar[i]=i*10+i;
//			System.out.println("ar["+i+"]:"+ar[i]);
//		}
//		System.out.println("----------------------");
//		// ��°� �����ؼ� �ٸ��� ����ϴ� ���
//		// ***for each ��***
//		// ���2
//		int a=0;
//		for (int i : ar) {
//			System.out.println("ar["+a+"]:"+i);
//			a++;
//		}
//		char[] z= "�����ٶ�".toCharArray();
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
//		// �迭�� �����ϴ� 3���� ���
//		// ���1 - ���� ���뼺 �а� ���� ����
//		int[] arr = new int[5];
//
//		// ���2
//		int[] arr1 = new int[] {10, 20, 50, 90};
//		for(int data: arr1) {
//			System.out.print(data+ " ");
//		}
//		System.out.println();
//		// ���3
//		int[] arr2 = {11, 22, 55, 99};
//		for (int i : arr2) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//
//		// �ؿ��� ���� 2�� �迭�� ÷��(�ε���)��� �Ѵ�.
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
//// ��ü���� ����
//class Airplane{
//	// 1. ����(�ʵ�: field)
//	int num;
//	
//	// 2. ������
//	
//	// 3. �޼ҵ�(method) :�Լ�(function)
//}
//
//// Ŭ���� �̸��� ù�ڴ� �빮�ڸ� ����ϴ� ���� �Ϲ����� ����̴�.
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
//		// "."�� ü�̴��̶�� �Ѵ�. chaining
//		t1.num=999;
//		System.out.println(t1.num);
//	}
//}
////ex33)
//class Airplane{
//	//�ʵ�
//	//1
//	int a; // ���
//	//2
//	int b, c;
//	//3
//	int d = 10, e=20;
//	//4
//	int f, g=30;
//	
//	//5
//	int fuel; // <- ������ ���Ǵ� ��� �ʵ�
//	int windowNumber;
//}// ���������� ��ü�� �������� �ʴ� �̻� �޸𸮴� ������� �ʴ´�.
//
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// ��ü�� �����Ǹ鼭 �޸𸮰� �ʿ��ϰ� �ȴ�.
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
//		// {} �ȿ��� �˰��ִ� ��� ������ ������ �� �ִ�.
//		System.out.println("�޽�� ȣ��(call)1");
//		System.out.println("�޽�� ȣ��(call)2");
//		System.out.println("�޽�� ȣ��(call)3");
//	}
//}
//
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		// �޽�� ȣ��
//		t1.method01();
//		System.out.println("ȣ����");
//		System.out.println("----------------------------");
//		for (int i = 0; i < 3; i++) {
//			t1.method01();
//		}
//		System.out.println("�ڳ���");
//	}
//}
////ex35)
//class Car{
//	int fuel = 100;
//	
//	void move() {
//		System.out.println("�ڵ����� �޸��ϴ�.");
//		fuel-=13;
//	}
//	void stop() {
//		System.out.println("�ڵ����� ������ϴ�.");
//		fuel-=3;
//	}
//	void inject() {
//		System.out.println("���Ḧ �����մϴ�.");
//		fuel = fuel + 50;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		//fuel = 2000; �̷��� ���� �ȵȴ�.
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
////ex36) ��ü = �Ӽ� + ����
//class ClassName{
//	// �ʵ�(����) : ��ü�� �Ӽ��� ������.
//	int �Ӽ�= 100;
//	// �޽��(�Լ�) : ������ ������.(���� �̵��� ����)
//	void �޽��() {
//		System.out.println("��ü = �Ӽ� + ����");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		ClassName c1= new ClassName();
//		System.out.println(c1.�Ӽ�);
//		c1.�޽��();
//	}
//}
////ex37)
//class Tiger{
//	void m1() {
//		System.out.println("m1 call");
//		System.out.println();
//	}
//	void m2(int num) {// num�� �Ű�����
//		
//		for (int i = 0; i < num; i++) {
//			System.out.println("m2 call"+num);
//		}
//		System.out.println();
//	}
//	void happy(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.print("�� ");
//		}
//		System.out.println();
//	}
//	// �μ��� 1���̻� ������ �� �ִ°�? -> �� �� �ִ�.
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
//		t1.m2(3);// 3�� ���ڶ�� �Ѵ�.
//		t1.happy(5);
//		t1.m3(8, 4);
//		t1.m4(7);
//		t1.m5(1000);
//		t1.m6(2, 8);
//		t1.m7(6, 6, '��', '��');
//	}
//}
////ex38)
////      ���� �Լ��̸�(�����μ�)
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
//	// ���ο��� int�� �����ϰڴ�.
//	// ������ �ϰ� �Ǹ�, �ݵ�� �ڵ� return�̶�� Ű���尡 �־�� �Ѵ�.
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
//		// ******������ �ٷ� ��� ����******
//		System.out.println(t1.m3());
//		// �Ǽ��� �Ͼ�� ���� �ڵ�
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
//	//void m1 (int a, int b) ->> �Լ� �����̶�� �Ѵ�. function prototype
//	
//	void m1 (int a, int b) {
//	}
//	void m2(int num) {
//		if(num%2==0) {
//			System.out.println("¦��");
//		}
//		else {
//			System.out.println("Ȧ��");
//		}
//	}
//	void m3() {
//		try {
//			System.out.println(1);
//			System.out.println(2);
//			// �ܵ����� return�� ���Ǹ� �Լ��� �ߴܵȴ�.
//			return;
//			// ���� �ڵ�� ���� ����� ���� ����.
//		} finally {
//			// TODO: handle finally clause
//			System.out.println(3); // �̷��� ���� ���� �� �� �ִ�.
//		}
//		// => �Ʒ��� ����
////		System.out.println(1);
////		System.out.println(2);
////		// �ܵ����� return�� ���Ǹ� �Լ��� �ߴܵȴ�.
////		return;
////		// ���� �ڵ�� ���� ����� ���� ����.
////		System.out.println(3);
//
//	}
//	void m4(int num) {
//		if(num>=0) {
//			if(num%2==0) {
//				System.out.println("¦��");
//			}
//			else{
//				System.out.println("Ȧ��");
//			}
//		}
//		else {
//			System.out.println("�����Դϴ�.");
//		}
//	}
//	
//	// if������ else�� ������� �ʰ� �� ����� �����ϰ� �� �� �ִٸ�
//	// ������� �ʴ� ���� ����.
//	void m5(int num) {
//		if(num<0) {
//			System.out.println("�����Դϴ�.");
//			return;
//		}
//		if(num%2==0) {
//			System.out.println("¦��");
//		}
//		else{
//			System.out.println("Ȧ��");
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
//				System.out.println("ã�Ҵ�!");
//				break;
//			}
//		}
//		System.out.println("��Ʈ�������Ϳ� ���Ű��� ȯ���մϴ�.");	
//	}
//	void m2(int num) {
//		System.out.println("m2 call");
////		for (int i = 0;i<10 ; i++) {
////			System.out.println(i);
////			if(num==i) {
////				System.out.println("ã�Ҵ�!");
////				return;
////			}
////		}
////		System.out.println("��Ʈ�������Ϳ� ���Ű��� ȯ���մϴ�.");	
//		// �Ʒ��� try finally Ȱ���̴�.
//		try {
//			for (int i = 0;i<10 ; i++) {
//				System.out.println(i);
//				if(num==i) {
//					System.out.println("ã�Ҵ�!");
//					return;
//				}
//			}
//		} finally {
//			System.out.println("��Ʈ�������Ϳ� ���Ű��� ȯ���մϴ�.");	
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
//	String str="ȫ�浿";
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
//		// int, char, boolean.....���� ǥ�� Ÿ�� 8��
//		Tiger t1 = new Tiger();
//		
//		// ǥ��Ŭ�����̴�.(F3�� ������ �����ڵ� Ȯ�� ����)
//		String a="�����ٶ󸶹ٻ�";
//		String b = new String("�����ٶ� ���ٻ�");
//		System.out.println(a+" "+b);
//		
//		System.out.println(b.length());
//		t1.m1(100, '��', "ȣ����");
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
//		System.out.println("���� ����");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger();
//		Lion l1= new Lion();
//		// �����ڷ� �ٷ� �����ص� �ȴ�.
//		t1.test(100, '��', "������ �ʹ�", new Lion());
//	}
//}

////ex44)
//// 1. �����ڴ� �Լ��Դϴ�.(������ �Լ���� �Ѵ�.)
//// 2. �������Լ� �̸��� Ŭ���� �̸��� �ݵ�� �����ϰ� �Ѵ�.
//// 3. ������ �޽��� ���ϰ��� �������� ����.
//// 4. �Լ��̱⶧����, �μ������� �� �� �ֽ��ϴ�.
//// 5. �μ������� ���� �����ڸ� ����Ʈ �����ڶ�� �Ѵ�.
//// 6. ������ �Լ��� ��ü�� �����ɶ�(new) �� 1�� ȣ��ȴ�.(2���̻� �ȵȴ�.)
//class Tiger{
//	// ����Ʈ ������.
//	Tiger() {	
//		System.out.println("call");
//	}
//	
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t1 = new Tiger(); // �̹� ������ ��ü�� ���ؼ� �ٸ� �����ڷ� ȣ�� �Ұ���
//		
//	}
//}

////ex45)
//// 7. �������� ��� ���� : �� �Ѱ���(�ʵ� �ʱ�ȭ�� ���ȴ�.)
//class Tiger{
//	int age;
//	String name;
//	Tiger() {
//		System.out.println("������ call");
//		age = 100;
//		name="ȣ����";
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
//	// �Լ��̸��� �����ϰ� ����� �� �ִ� ����
//	// 1. ���޵Ǵ� �μ��� ������ �ٸ���
//	// 2. ���޵Ǵ� �μ��� ������ ���ٰ� �ϴ��� �� Ÿ���� �ٸ���.
//	// ***�Լ� �����ε��̶�� �Ѵ�.(overloading)***
//	void m1() {// �Ϲ� �簢���� �׸���.(������ �簢��)
//		System.out.println(1);
//	}
//	void m1(int a) {// ���簢���� �׷��ش�.
//		System.out.println(a);
//	}
//	void m1(int a, int b) {// ���簢���� �׷��ش�.
//		System.out.println(a +" "+b);
//	}
//	// �߿�! -> �Ű������� ������ ������, �ڷ����� �ٸ��ٸ� �ٸ� �Լ��� ����
//	void m1(int a, float b) {// �̼��ϰ� �����ϴ� �簢���� �׷��ش�.
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
//		Tiger t4 = new Tiger("�����ٶ�");
//	}
//}
////ex48)
//class Tiger{
//	int age = 100;
//	String name = "�͸��� ����";
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
//		Tiger t1 = new Tiger(10, "ȣ����"); 
//		Tiger t2 = new Tiger(15, "�ڳ���");
//		Tiger t3 = new Tiger(30, "������");
//		t1.showInfo();
//		t2.showInfo();
//		t3.showInfo();
//	}
//}
////ex49)
//// ��ü�� ����� ���ٸ�, �׶� �������, ��ü�� ����Ű�°��� this�̴�.
//class Tiger{
//	int age=10;
//	String name = "ȣ����";
//	
//	Tiger(){
//		System.out.println(this.hashCode());
//	}
//	void showInfo() {
//		// ���� �ڵ�� ���� Ʋ�� �����̴�. this�� ������ �����̴�.
//		System.out.println(age+" "+ name);
//		// ���� �����̴�.
//		System.out.println(this.age + " "+this.name);
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger ȫ�浿 = new Tiger(); 
//		System.out.println(ȫ�浿.hashCode());
//		System.out.println("--------------------");
//		
//		Tiger ��Ƽ���� = new Tiger();
//		System.out.println(��Ƽ����.hashCode());
//	}
//}
////ex50)
//// this�� 3���� ������� ���ȴ�.
//// 1. this�� ù��° ��� - �����ڿ��� �μ��� �ʵ带 �����ϱ����� ���
//class Tiger{
//	int age;
//	String name;
//	Tiger(int age, String name){
//		// age=age; // �ڱ������ �Ͼ�� �ִ�.
//		// name=name;
//		
//		// this�� ù��° ��� - �����ڿ��� �μ��� �ʵ带 �����ϱ����� ���
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
//		Tiger t = new Tiger(30,"�̼��� �屺��");
//		t.showInfo();
//		t.addAge(10);
//		t.showInfo();
//	}
//}
////ex51)
////this�� 3���� ������� ���ȴ�.
//class Tiger{
//	int m1() {
//		return 10;
//	}
//	String m2() {
//		return "ȣ����";
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
//	Tiger m6() { // ***�߿�***
//				 // ***m5�� ����.***
//		return this;
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger t = new Tiger();
//		System.out.println(t.hashCode());// ���
//		System.out.println(t.m3().hashCode());// ��� �ٸ���. ���
//		System.out.println(t.m6().hashCode());// �길 ����
//	}
//}
////ex52)
////this�� 3���� ������� ���ȴ�.
//// 2. this�� 2���� ��� : �Լ��� ü�̴��� ���ؼ� ���ȴ�.
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
//		//�޼��� ü�̴��̶�� �Ѵ�.
//		t.m1().m1().m1().m1().m1().m2().m1().m2().m1().m2().m3();
//		System.out.println();
//		Tiger t1 =t.m1();
//		System.out.println();
//		System.out.println(t1.a);
//		System.out.println("---------------");
//		System.out.println(t.hashCode());
//		System.out.println(t.m1().hashCode());
//		//t1�� t�� ������ ������ ��ü�̴�.
//		System.out.println(t1.hashCode());
//		
//		t.m1();
//		System.out.println("������"); // �߰��� �ڵ� ���� ����
//		t.m2();
//		t.m3();
//		// �� �Ʒ��� �����ϴ�.
//		t.m1().m2().m3();
//		t1.a=100;
//		t.a=200;
//		System.out.println(t1.a);
//		System.out.println(t.a); // -> ���� "������" ���� ��ü�� ��������� ������ ������ ��ü�� ���Ѱ� ó�� �Ͼ
//	}
//}
//ex53)
////this�� 3���� ������� ���ȴ�. 
//class Tiger{
//	Tiger m1() {
//		System.out.println("��ħ�� �Խ��ϴ�.");
//		return this;
//	}
//	Tiger m2() {
//		System.out.println("������ �Խ��ϴ�.");
//		return this;
//	}
//	Tiger m3() {
//		System.out.println("������ �Խ��ϴ�.");
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
//		System.out.println("�ձ��ذ� �����ϴ�.");
//		t.m3();
//		
//		t.m1().m2().m2().m3(); // �߰��� �ٸ� �ڵ� ������ ������ �Ͻ������� ��Ÿ�� �� ����.
//		// ���������� ������ ���� ������� ü�̴�
//		t.m1().
//		m2().
//		m3().
//		m2();
//	}
//}
////ex54)
////this�� 3���� ������� ���ȴ�.
////3. this�� 3��° ���� - �ٸ� Ŭ������ �ڽ��� ������ �����Ҷ�  
//class Man{
//	int money = 2000;
//	void m1() {
//		System.out.println(money);
//	}
//	void m2() {
//		System.out.println("������");
//	}
//	void m3() {
//		Woman w = new Woman();
//		w.iLoveYou(this);
//		if(w.iLoveYou(this)==true) {
//			System.out.println("�����մϴ�.");
//		}
//		else {
//			System.out.println("������~~");
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
////ex55) ���
//// �θ��� �Լ��̸��� �ڽ��� �Լ��̸��� �����ϴ� �Լ� �ۼ� ��� - �޽�� �������̵�
//class Tiger{
//	void m1() {
//		System.out.println("�� ���� �Լ�m1");
//	}
//	void m3() {
//		System.out.println("�� ���� �Լ�m3");
//	}
//}
//class Lion extends Tiger{
//	void m1() {
//		super.m1(); // �θ��� ���� �޽�� ȣ��
//		System.out.println("����� �Լ�m1");
//	}
//	void m3() {
//		System.out.println("����� �Լ�m3");
//	}
//	void m4() {
//		// �θ��� m3()�� �θ��� ���ؼ��� super�� �տ� �ٿ�����Ѵ�.
//		// �׳� �� ��� �ڽ��� m3�� ������ ���� �ʴ´�.
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
//		// �θ��� m3�� �����°�? ���������δ� �� ����, ���������δ� �� �� �ִ�.
//	}
//}
////ex56)
//// ���ڴ� ȣ�����̴�. (x)
//// ���ڴ� �����̴�. (��)
//// ���� �ƺ��̴�.(x)
//// �ﰢ���� �����̴�.(��)
//// "is" ~�̴�. �� ���� �Ǹ� ����� ����� ���� �ִ�.
//// ���� ����� is a ������ �θ���.
//// has a ����
//// ������ �����̸� ���� �ִ�.(��)
//// ����� Į�� �����ִ�.(��)
//// �ڵ����� ������ ���� �ִ�.(��)
//// �θ� �����ڰ� ȣ���� �ǰ� �ڽ� �����ڰ� ȣ���� �ȴٴ� ����
//// �������̴�!!....
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
//		// super(); -> �θ� �����ڸ� �ǹ��Ѵ�. 
//		// �� �������ִ�. ����Ʈ��
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
//		//�θ� ������ ȣ�� -> �ڽ� ������ ȣ�� ������ �̾�����.
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
//		// �̳��� ����ϰ� �ƹ� ���谡 ����.
//		A a = new A();
//		a.m1();
//		
//		B b = new B();
//		b.m1();
//		b.m2();
//		
//		// �θ� c = new �ڽ�(); // �θ� = �ڽ�;
//		// ���� ���� >> ��ĳ���� ����
//		// �̰��� �߿�������
//		A c = new B();
//		
//		// �ں� ���� >> �ٿ�ĳ���� ����.
//		// �ڹٿ����� �������� �ʴ� �����̴�.
//		// B d = new A();
//	}
//}
////ex60) ������(���ڰ���: ��ĳ����)
//class Tiger{
//	void m1() {
//		System.out.println("�θ� m1");
//	}
//	void m3() {
//		System.out.println("�θ� m3");
//	}
//	void m4() {
//		System.out.println("7777");
//	}
////	void m3(int a, int b) { //  �갡 �־�� a.m3(3,5)�� ������ �ȳ���.
////	}
//}
//class Lion extends Tiger{
//	void m1() {
//		System.out.println("9999");
//		this.m2();
//		this.m4();// ***�갡 �߿��ϴ�!!!***
//	}
//	void m2() {
//		System.out.println("m2");
//	}
//	void m3(int a, int b) {
//		System.out.println("�ڽ� m3"+ a+" "+ b);
//	}
//	void m3() {
//		System.out.println("�ڽ� m3");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		Tiger a = new Lion();
//		a.m1();
//		a.m3();
//		a.m4(); // �� �������� ��ĳ������ ��ü�� ���ؼ��� �� ������ �޼ҵ尡 ��� �� �� �ִ� �޼ҵ��� �����̴�.
//		// a�� Ÿ��(Ŭ����)�� Ÿ�̰��̴�. ���� m1�� Tiger���� ã�ƾ��Ѵ�.
//		// a.m2() �� ���� ���� ������ ������ ���.
//		// ���� ���迡�� �޼ҵ� ȣ��� �������
//		// 1. �ڽ��� ����߿�, �ش� �޽�尡 �ִ��� Ȯ�� 
//		// 2. �޽�尡 �ִٸ�, �ڽ��� �ڽĿ��� ���� �̸��� �޽�尡 �ִ��� Ȯ��
//		// 3. �ڽĿ��� ���� �̸��� �޽�尡 �ִٸ�, �ڽ��� �޽�带 ����Ѵ�.(�������̵��� �޽�带 ����Ѵ�.)
//		// �̷��� ��ĳ���� �������� �ڽ��� �ڱⲬ �������� ������ �θ𿡰� ���� �� �ִ�.
//		
//		
//		
//		// a.m2(); ***�Ʒ��� ���� ������ ȣ���� �� �� ����.***
//		// a.m3(3,5);�� ������ ���. �Ű������� ���� �޶� ���� �Լ���� �ϱ� ����� ����
//		// ***�� �������� a�� ���������� TigerŬ�����̴�. ������, TigerŬ������ int �Ű����� �ΰ�¥�� m3�� �����Ǳ� �������� �Ʒ��� �ڵ� a.m3(3,5)�� ������ ����.***
//		// ***Lion a = new Lion()�� �������� �������� ��쿡�� ������ �ȳ���. 
//	}
//}
////ex61)
//// �� �θ�� ���� �ڽ��� �� �� ������, �Ѹ��� �������� �θ� ���� �� �� ����. 
//class Animal{
//	// ���� �پ��� ������ ����� ���� �� �ִ� ��Ȳ�� ����� ���ٸ�...
//	// �̰��� �������̶�� �Ѵ�.
//	void cry() {
//		System.out.println("...");
//	}
//}
//class Dog extends Animal{
//	void cry() {
//		System.out.println("�۸�");
//	}
//}
//class Cat extends Animal{
//	void cry() {
//		System.out.println("�߿�");
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
//		d=b++; // -> 1. ����, 2. ����
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
//	static int a=10; // static = ���� = ����.
//	int b;
//	// ��ü�� ������Ű�� �ʰ� (new�� ������� �ʰ�) ����� �� �ִ°�? -> ��!
//	static void m1() {
//		System.out.println("m1 �Լ� ȣ��");
//	}
//	void m2() {
//		
//	}
//}
//// ������ ������ ���
////static int a; // �׷��� ������ �ۼ��� Tiger ���� static ���� a �� �������� ��ģ�ٴ� ��� ���.
////class Tiger{
////	 // static = ���� = ����.
////	int b;
////}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println(Tiger.a);
//		//System.out.println(Showmethemoney.k); // ù���� �빮�� -> Ŭ���� -> �ڿ� ��Ʈ -> static �ʵ带 ����ϴ� ���� �ǹ�
//		//System.out.println(Tiger.b); // ��� ���� ���.
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
//		// static�� �̿��ؼ� ��ü ���� Ƚ���� ��� �� �� �ִ�.
//	}
//}
////ex65)
//class Tiger{
//	static void m1() {
//		System.out.println("ȣ����");
//	}
//}
//public class Hello 
//{
//	public static void main(String[] args) 
//	{
//		// 1�� ����� �ְ�
//		Tiger.m1();
//		// 2�� ����� �ִٰ� ������
//		// ��ü�� ������Ű�� �ð��� �������ٴ� ���� ���� �ɸ���.
//		// �ð��� �����ɸ���. �޸� �Ҹ��� ���� : ����� ���.
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
//		System.out.println(Math.floor(3.99)); // ����
//		System.out.println(Math.ceil(5.2)); // �ø�
//		System.out.println(Math.floor(-1.5)); // �����϶� ����!! õ�� �ٴ��̶�� ���� ���ϴ� �߻����� �ǹ̸� �����غ���
//		System.out.println(Math.ceil(-1.5));
//		System.out.println(Math.round(5.5)); // �ݿø�
//		System.out.println(Math.round(5.4));
//	}
//}
////ex66)
//// Ctrl + F11 -> 1. ����� �����ȴ�. 2. OS�� main �Լ��� �θ���. -> main�� �ü���� �θ�����
//// main�� ���α׷��� ���������� entry point��� �Ѵ�.
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
//		System.out.println("m2 ȣ��");
//	}
//	public static void main(String[] args) {
//		Hello he = new Hello();
//		System.out.println(he.num);
//		// System.out.println(this.num);
//		// -> �ȵǴ� ����, main �Լ��� static �Լ��̱� ������, �������� ������ �Ǹ�, Ŭ���� ������ Ƣ����� ������ ���� Ŭ���� ���� ����� ��Ī�ϴ� this�� ����� �� ����.
//		// ***�����ϸ�, ����ƽ �Լ� �ȿ����� ����ƽ ������ ����� �� �ִ�.***
//		// -> num ���� static �������ٸ� ���������� ��� ���� �� �̴�.
//		Hello.m2();
//		m2();
//	}
//}
////ex67)
//class Tiger{
//	Tiger m1() {
//		System.out.println("ȣ����");
//		return this;
//	}
//	static void main() {
//		Tiger t = new Tiger();
//		t.m1().m1().m1().m1();
//	}
//}
//public class Hello {
//	void m1() {
//		System.out.println("������");
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
//	// �Ʒ��� ���� �ڵ尡 ���� �Լ� ������ abstract �Լ������̶�� �Ѵ�.
//	// abstract : �߻�(�Լ�)
//	// ***Ŭ���� ���ο� �߻��Լ��� 1���� ������, �� Ŭ������ �ݵ�� �߻� Ŭ���� �̾�� �Ѵ�.***
//	// �߻��� �� : �̿ϼ�. (�ڵ尡 �̿ϼ� �Ǿ���.)
//	// ***�̿ϼ��� �ڵ带 �ڽ��� �ݵ�� �� �ڵ带 �ϼ��ؾ��Ѵ�.***
//	abstract void m1();
//	void m2() {}
//}
//class Lion extends Tiger{
//	// ���� m1()�� �ּ� ó���Ѵٸ�, ������ ���.
//	void m1() {
//		System.out.println("ũ�ƾ�1");
//		System.out.println("ũ�ƾ�2");
//		System.out.println("ũ�ƾ�3");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Tiger ti = new Lion();
//		ti.m1();
//	}
//}
////ex69)
//abstract class ��������{
//	void Į() {
//		System.out.println("���� Į... �ջ�");
//	}
//	abstract void ����();
//	
//}
//class ���׳�1 extends ��������{
//	void ����() {
//		System.out.println("��ƿ ����");
//	}
//}
//
//class ���׳�2 extends ��������{
//	void ����() {
//		System.out.println("������ ���� ����");
//		for (int i = 0; i < 5; i++) {
//			Į();
//		}
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		// �������� ti = new ��������(); -> �ڵ尡 �ϼ��� ���� �ʾұ� ������, �翬�� �޸𸮸� �������, �׷��� ������ ���.
//		// �ڵ尡 �̿ϼ��ε�, ��� ��ü�� ������Ű�°�?
//		// -> �߻�Ŭ������ ��ü ���� �Ұ�, �ȿ� �߻� �Լ��� �ƴ� �Լ��� �ִ��� ���̴�.
//		�������� t1 = new ���׳�1();
//		t1.Į();
//		t1.����();
//		System.out.println("---------------");
//		�������� t2 = new ���׳�2();
//		t2.����();
//	}
//}
////ex70)
//// ��ĳ������ ���¿� �ϴ� ����
//abstract class Animal{
//	abstract void cry();
//}
//class Tiger extends Animal{
//	void cry() {
//		System.out.println("ȣ���� ����");
//	}
//}
//class Lion extends Animal{
//	void cry() {
//		System.out.println("���� ����");
//	}
//}
//class Zoo{
////	void sound(Tiger ti) {
////		ti.cry();
////	}
////	void sound(Lion li) {
////		li.cry();
////	} -> ���� �̷��� �������� �Ʒ�ó�� ����, �Է� ������ Ŭ���� ������ ���� �Լ��� ��� ������ �ʾƵ� �ȴ�.
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
//		System.out.println("����");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		B t1 = new B();
//		A t2 = new B(); // ��ȣ �ȴ�. A�� ���ʿ� abstract�� �����߱� ������, ���������� ���� ����
//		
//		// int a, b, c; �� �������� ����� �Ʒ��� �迭
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
//		// ***�̷������� ��ĳ������ �̿��ؼ� �پ��� Ÿ���� Ŭ���� �迭�� ���� �� �� �ִ�.***
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
//		// ���� �ڵ�� �����ϴ�.
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
//// �߻�Ŭ������ ����� ����
//abstract class �ѱ�����{
//	abstract void �Ա�();
//	abstract void ���();
//	abstract void ��ü();
//	abstract void ����();
//}
//class �������� extends �ѱ�����{
//	void �Ա�() {
//		
//	}
//	void ���() {
//		
//	}
//	void ��ü() {
//		
//	}
//	void ����() {
//		
//	}
//}
//class �ϳ����� extends �ѱ�����{
//	void �Ա�() {
//		
//	}
//	void ���() {
//		
//	}
//	void ��ü() {
//		
//	}
//	void ����() {
//		
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		�������� a = new ��������();
//		�ѱ����� b = new ��������();
//	}
//}
////ex74-1)
//// ����� ���� Ʋ���� ���� �������� abstract class ���� interface�� �����ϴ�.
//interface �ѱ�����{
//	void �Ա�();// ������ abstract �� �����ص� �ڵ����� �ٿ� �༭ �Ϲ������� ���� �ʴ´�.
//	abstract void ���();
//	void ��ü();
//	void ����();
//}
//class �������� implements �ѱ�����{ // �����ϴ�
//	public void �Ա�() {// ***interface�� implements ���� ��� ������ �տ� public�� �ٿ��ش�.***
//		
//	}
//	public void ���() {
//		
//	}
//	public void ��ü() {
//		
//	}
//	public void ����() {
//		
//	}
//}
//class �ϳ����� implements �ѱ�����{
//	public void �Ա�() {
//		
//	}
//	public void ���() {
//		
//	}
//	public void ��ü() {
//		
//	}
//	public void ����() {
//		
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		�������� a = new ��������();
//		�ѱ����� b = new ��������();
//	}
//}
////ex74-2)
////����� ���� Ʋ���� ���� �������� abstract class ���� interface�� �����ϴ�.
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
//		A t2 = new B(); // Ȯ���� ���鿡�� ���� �ڵ� ó�� ���
//		t2.m1();
//		t2.m2();
//	
//		
//	}
//}
////ex75)
//// java���� ���߻���� ���� �����ʴ´�. 
//// �� Ŭ�����κ��͸� extends �����ϴ�.
//// ������, �ϳ��� Ŭ������ �������� �������̽��� ��� �Ҽ��� �ִ�.
//// -> �θ�(extends)�� �ϳ�����, ����(implements)�� �������� �� �ִ�.
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
////ex76) final : (������)
//// 1.
//class Tiger{
//	int num1 =101;
//	final int num2 = 101; // ���� ���̻� ������ �� ����.
//}
//// 2. 
//// ***Ŭ���� �տ� final�� ���� ��� �� �̻� ����� �� ����.***
//final class A{
//	
//}
////class B extends A{
////	
////}
//// ���� ���� ������ ���.
//
//// 3.
//// ***�Լ��տ� final�� ���� ���, �� �̻� �������̵� �� �� ����.***
//class AA{
//	final void m1() {
//		
//	}
//}
//class BB extends AA{
////  �Ʒ��� ���� m1()�� �������̵� �� ��� ������ ���.
////	void m1() {
////		
////	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		t1.num1= 201; // num1(����)
//		//t1.num2 = 201; // num2(���) ������ ���, final ������ ���� ���� �� �� ����.
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
//		//t2.m3(); �� �ȵȴ�.
//	}
//}
////ex78) -> �������� ���� ���̴� ����
//// 1. interface �ȿ��� �����ڵ尡 ���� ���� ����.
//// 2. interface �� ��ü�� ������ų �� ����.(abstract class�� ��������)
//// 3. interface �� implements�� �̿��ؼ� ����Ѵ�.
//// 4. �ݵ�� �θ��� �޽�带 �����ؾ� �Ѵ�.
//// 5. ������ �޽�� �տ� public�� �ٿ��� �Ѵ�.
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
//		// ��Ģ��θ� �Ʒ��� �ڵ�� ������ �ȵȴ�. -> ������ �����ϴ�.
//		// Tiger t3 = new Tiger();
//		// �͸� Ŭ���� ����.
//		// 1. �͸�Ŭ������ ù��° ����
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
//		// 2. �͸�Ŭ������ �ι�° ����(�͸�ü�� ����Ѵ�.)
//		new Tiger() {
//			public void m1() {
//				System.out.println(666);
//			}
//		}.m1();
//		// �͸�Ŭ������ �������̽��� �۽�Ʈ��Ʈ Ŭ������ ���õ� �͸� �����ϴ�. ����� ���� ���� �Ϲ� Ŭ������ ���ؼ��� ����� �� ����.
//		// Lion�� �������̽��� ��ӹ޾����Ƿ� �Ʒ��� ���� �͸�Ŭ���� ������ �����ϴ�.
//		new Lion() {
//			public void m1() {
//				System.out.println(555);
//			}
//		}.m1();
//		}
//	}
////ex79) �͸� Ŭ������ �� ��� �뵵
//// ***�Լ��� �ڵ带 �����Ѵ�.***
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
//				System.out.println("���� �͸� Ŭ����");
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
//		// ���׿������� �ٲٴ� ���� ����.
//		c= (a>b)?1000:2000;
//		// ���� ���� �ڵ�� �� ���� if else�� ������ ������ ���α׷��̴�.
//		// ����� �� ������, ���׿����� ����ϴ� ������ ����\
//		// �ڵ带 �����ؼ� �����ϰ� ��Ÿ���� �ڵ� (sugar code)
//		System.out.println(c);
//
//		//ex2)
//		if( a>b) {
//			System.out.println("ȣ����");
//		}else {
//			System.out.println("�ڳ���");
//		}
//		// ���� �ڵ����
//		String k = (a>b)?"ȣ����":"�ڳ���";
//		System.out.println(k);
//		// ���� �ڵ����
//		System.out.println((a>b)?"ȣ����":"�ڳ���");
//		System.out.println(m1(20,30));
//	}
//	static int m1(int a, int b) {
////		if(a>b) {
////			return 1000; 
////		}else {
////			return 2000;
////		}
//		// ***�̷������ε� ����Ѵ�. ���׿����� �Ǵٸ� ���ͷ��� �����ϴ� �Լ��� ����-> syso �ȿ����� return �ڿ��� ���� �� �ִ�.***
//		return (a>b)?1000:2000;
//	}
//}
////ex81-1) ������ : �Ʒ��� ��쿡�� �ΰ������� ����/ ������ �ȴٸ�, ���� Ŭ������ �ڵ带 ������ ���� �������־�� �Ѵ�.
//class Baduk{
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
//	}
//	void play() {
//		System.out.println("�ΰ� ������ ���İ� �Դϴ�.");
//	}
//}
//public class Hello {
//	public static void main(String[] args) {
//		// ***Ŭ���� Ÿ�� ���� ���� ctrl + space �ϸ� Ŭ���� �̸��� ù���� �ҹ��ڷ� �ٲپ� �����ش�.***
//		Baduk baduk = new Baduk();
//		baduk.play();
//	}
//}
////ex81-2) ������ : �ΰ������� ���ö����� Baduk Ŭ������ void play �Լ��� �߰��ؾ��Ѵ�. if �ΰ������� 1200�����, �ߺ��Ǵ� play�ڵ带 1200���� �������Ѵ�.
//class Baduk{
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
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
//		System.out.println("�ΰ������� ���İ��Դϴ�.");
//	}
//}
//class BetaGo {
//	void play() {
//		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
//	}
//}
//class GammaGo {
//	void play() {
//		System.out.println("�ΰ������� �������Դϴ�.");
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
////ex81-3) ������ : Ai�� void �Լ��� ������ ���� ��� �ִ�.
//class Baduk{
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
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
//		System.out.println("�ΰ������� ���İ��Դϴ�.");
//	}
//}
//class BetaGo extends Ai {
//	void play() {
//		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
//	}
//}
//class GammaGo extends Ai {
//	void play() {
//		System.out.println("�ΰ������� �������Դϴ�.");
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
////ex81-4) ������ : Ai�� �������̽��� ���� �ֱ� ������ �� ������ ���·� ������ ����.
//class Baduk{
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
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
//		System.out.println("�ΰ������� ���İ��Դϴ�.");
//	}
//}
//class BetaGo extends Ai {
//	void play() {
//		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
//	}
//}
//class GammaGo extends Ai {
//	void play() {
//		System.out.println("�ΰ������� �������Դϴ�.");
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
////ex81-5) ������ : 
//// 1. �Լ��� ���鶧 ����, �ΰ����� ��ü�� ��� �Ѱܾ� �ϴ°�?
//// 2. �� ������ �÷��̿� ��ž�� ���� �ٸ� ��ü�� ����ϰ� �ִ�.
//class Baduk{
//	Baduk(){
//		System.out.println("�뱹�� �����մϴ�.");
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
//		System.out.println("�ΰ������� ���İ��Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("���İ� ��������� �մϴ�.");
//	}
//}
//class BetaGo implements Ai {
//	public void play() {
//		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("��Ÿ�� ��������� �մϴ�.");
//	}
//}
//class GammaGo implements Ai {
//	public void play() {
//		System.out.println("�ΰ������� �������Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("������ ��������� �մϴ�.");
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
//// ***�߿�!!!***
//class Baduk{
//	Ai ai;
//	// ���� -> injection �̶�� �Ѵ�.
//	// ***Baduk �� Ai�� ���� �����̴�.***
//	// ***�̷� �������谡 �����ִ� ���α׷����� ��ü ���� ���α׷��̶���Ѵ�.***
//	Baduk(Ai ai){
//		this.ai=ai;
//		System.out.println("�뱹�� �����մϴ�.");
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
//		System.out.println("�ΰ������� ���İ��Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("���İ� ��������� �մϴ�.");
//	}
//}
//class BetaGo implements Ai {
//	public void play() {
//		System.out.println("�ΰ������� ��Ÿ���Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("��Ÿ�� ��������� �մϴ�.");
//	}
//}
//class GammaGo implements Ai {
//	public void play() {
//		System.out.println("�ΰ������� �������Դϴ�.");
//	}
//	public void stop() {
//		System.out.println("������ ��������� �մϴ�.");
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
////ex82) ����ó�� -> �����ϴ� ������ -> �������� 1������ �ϱ� ����
//// �߰������ϻ��̴�.
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("���α׷��� �����մϴ�.");
//		// 1. ��? Exception�� �߻��ߴٳ�??
//		// 2. ��? ���α׷��� �ߴܵǾ���?....
//		// 3. ���α׷����� ������ �߻����� ��
//		// �ü���� ���ܸ� �߻���Ű�µ�
//		// ���α׷��� �ߴܽ�Ű�� ���� �� ������ �ƴϰ�
//		// ���ܰ� �߻��ߴٴ°��� ���α׷��ӿ��� �˸��°��� �����Դϴ�.
//		
//		// �̶� �Ʒ��Ͱ��� ��Ȳ���� ���α׷��� ***�ߴܽ�Ű�� ������ �ʴ´ٸ�***
//		
//		//2
//		try {
//			// int a = 7/1; �϶��� catch�� ��ɹ��� ��������ʴ´�. 
//			// int a = 7/0; �϶��� catch�� ��ɹ� "�и𿡴� 0�� �� �� �����ϴ�."�� ��µȴ�.
//			int a = 7/0;
//		} catch (Exception e) {
//			System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
//			//Arithmatic Exception
//			e.printStackTrace(); // ���ܸ� ������ִ� ��ɾ� -> �̸� ���ؼ� ������ ������ �� �� �ִ�.
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
//		System.out.println("ȣ����");
//		System.out.println("-------------------------");
//		//3
//		// s�� ��ü�� �ƴϴ�. (������� ǥ��)
//		String s = null;
//		s= "����ȭ ���� �Ǿ����ϴ�.";
//		System.out.println(s.length());
//		s=null;
//		// ��ü�� �ƴ� ���� ��Ʈ ��� ���� �� ����. �̰�쿡�� Exception�� ���.
//		try {
//			System.out.println(s.length());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//NullPointerException -> ��ü�� �ƴ� ���� ��üó�� ����� ���
//		System.out.println("ȣ����");
//	}
//}
////ex83) 
//class Tiger{
//	void m1() {
//		System.out.println("�Լ� 1 ��");
//		// ����ϼ��� : Unhandled exception -> �� ���ܰ� �߻��ߴµ� ���� �� �ִ� ��ġ�� ������ �ʴ°�? -> try catch�� �� �Ⱦ��°�?
//		try {
//			throw new Exception(); // �ǵ������� ���ܸ� �����ִ� �ڵ�
//		} catch (Exception e) {
//			
//		}
//
//	}
//	void m2() throws Exception { // �̷� ������ε� Exception�� �ִ��� �ڵ带 ������ �� �ִ�.
//		// �׷��ٸ� �갡�ϴ� ���� ����? -> ���ѱ�� -> �� �Լ��� ����ϴ� ���� Exception ó���� �ض�
//		System.out.println("�Լ� 2 ��");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t = new Tiger();
//		t.m1();
//		// �̷������� ����ϴ� �𿡰� ���ѱ�°� throws Exception �Լ��̴�. -> �̷� ��쿡�� ����ó���Ѵ�.
//		try {t.m2();} catch (Exception e) {}
//		System.out.println("ȣ����");
//		
//	}
//}
////ex84) 
//// �ð������� ���Ѻ���
//// sleep : �����ڰ� ������ Ư�������� �����Ҷ�����
//// ���α׷��� ���̻� �����Ű�� ���ϴ� �Լ��̴�. (���ŷ�Լ���� �Ѵ�.)
//// try catch�� ����ϴ� �Լ� : Thread.sleep(); -> �̿ܿ��� �ڹٿ��� (try catch�� �ʿ���, Unhandled Exception�� �ߴ�, throw Exception�� �Լ�)�� ����.
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("������");
//		// ���� 1000 �� 1000 �и�����, 1�ʸ� �ǹ��Ѵ�. -> 1�� �����
//		try {Thread.sleep(1000);} catch (Exception e) {}
//		System.out.println("ȣ����");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("ȣ���� "+i);
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
//		System.out.println("�ڳ���");
//		System.out.println((a>b)?"�޹���1":"�޹���2");
//		System.out.println("������");
//	}
//	void m3(int a, int b) {
//		System.out.println("�ڳ���");
//		try {
//			if (a>b) {
//				System.out.println("�޹���1");
//			} else {
//				return;
//			}			
//		} catch (Exception e) {
//
//		}finally { // try �ȿ��� ��������� ������������, finally�� �ڵ�� ������ �����ϰԵȴ�.
//			// �� �ڵ�� ���� ������ �����ϰ� ���� �ڵ尡 ���� ��쿡 ����� ����
//			System.out.println("������");			
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
//ex86) [����] �׸��� [���ڿ�]
//public class Hello{
//	public static void main(String[] args) {
//		int a = 10;
//		String b = "ȣ����"; // ���ڿ�
//		String c = "1234"; // ? -> ���ڿ��̴�.
//		
//		System.out.println(a+10);
//		System.out.println(b+10);
//		System.out.println(c+10);
//		
//		// ����ȯ : ���� -> ����
//		int n1 = 123;
//		String s1 = Integer.toString(n1);
//		// sugar code
//		String s2 =""+n1;
//		
//		String s3 = "8888";
//		int n3 = Integer.parseInt(s3);
//		// �Ʒ��� ������ �� �ƴ��� Ȯ���ϴ� �ڵ��̴�.
//		System.out.println(n3+1);
//	}
//}
////ex87) String Ŭ������ �Լ���
//public class Hello{
//	public static void main(String[] args) {
//		
//		String s = "����ȭ�����Ǿ����ϴٲ���";
//		// 1��° �Լ�
//		System.out.println(s.length());
//		// 2��° �Լ�
//		System.out.println(s.charAt(1));
//		// ��ȿ������ ��� ��쿡�� Exception�� �߻��Ѵ�.
//		
//		// �˻��� �������� ��쿡 ��Ÿ���� ����
//		// 1. Exception�� �߻��ϴ���
//		// 2. �ƴϸ� �������� ���� -> ��κ� -1�� ���
//		// System.out.println(s.charAt(100));
//		// 3��° �Լ�
//		System.out.println(s.indexOf("ȭ����"));
//		// �Ʒ�ó�� s.indexOf()�� �˻��� ����(�˻�� ���峻�� ���� ���) -> -1 �̶��.
//		System.out.println(s.indexOf("ȭ ����"));
//		int num = s.indexOf("ȭ����");
//		if(num==-1) {
//			System.out.println("�˻��� �����߽��ϴ�.");
//		}else {
//			System.out.println(num+"������ ã�ҽ��ϴ�.");
//		}
//		// 4��° �Լ� -> replace
//		// ��ã����
//		String s2 = s.replaceAll("����", "������");
//		System.out.println(s2);
//		// �Ʒ� ó�� ù��° ���ڰ� ���峻�� ������ �ٲ�ġ�Ⱑ �ȵȴ�.
//		// ��ΰ� ����ȴ�. -> s���忡�� "����"�� ��������� ��� "������"�� ����ȴ�.
//		// ���������ʹ� ������� �ʴ´�.(�߿�) ������ �����ؼ� �����һ�
//		String s3 = s.replaceAll("�����䳢", "������");
//		System.out.println(s3);
//		
//		// 5��° �Լ� -> substring
//		String s4= s.substring(5);
//		System.out.println(s4);
//		
//		// �����ε� ������ �����Ǿ���.
//		// �ε��� ��ȣ 3������ 5���ձ��� �߶�´�.
//		// �μ� �ΰ�¥�� substring �� ���ڸ� ���ڸ� ���� �ʴ´�.
//		String s5= s.substring(3,5);
//		System.out.println(s5);
//		
//		// 6���� �Լ�
//		// .toUpperCase()�� ��� �ҹ��ڸ� �빮�ڷ� �ٲ��ش�. -> �빮�ڸ� �ִ� ����/�ܾ�� ������ش�.
//		// .toLowerCase()�� ��� �빮�ڸ� �ҹ��ڷ� �ٲ��ش�. -> �ҹ��ڸ� �ִ� ����/�ܾ�� ������ش�.
//		String s6 = "Apple";
//		System.out.println(s6.toUpperCase());
//		// �� ���Լ��� ���������� ������ ������ ��ȭ��Ű���� �ʴ´�.
//		System.out.println(s6);
//		System.out.println(s6.toLowerCase());
//		
//		String s7 = "   App   le   ";
//		// 7��° �Լ�
//		// ���� �Ǿհ�, �ǵ��� ������ �����ִ� �Լ� .trim()
//		System.out.println(s7.trim());
//		
//		// 8���� �Լ� �迭�� ���ڿ��� ��ȯ�ϴ� �ڵ��̴�.
//		// -���ڸ� �ٷ�� ���ؼ� ����� Ÿ����(char)
//		byte[] data1 = new byte[] {65, 'B', 'C', 'D'};
//		char[] data2 = new char[] {'E','F','G'};
//		String s8 = new String(data1, 0, data1.length);
//		String s9 = new String(data2, 0, data2.length);
//		System.out.println(s8);
//		System.out.println(s9);
//		
//		// �̷��� ���� ���� -> ������ ��ſ����� �����ϰ� "byte"Ÿ�Ը��� �̿��ؼ� ����Ѵ�.
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
////ex88) ����
//// �ΰ��� ����ϱ� ���� ������ 10�����̴�.
//// ��ǻ�Ͱ� ����ϱ� ���� ������ 2�����̴�.
//// �ΰ��� ��ǻ�Ͱ� ��ȣ������ ������ 16�����̴�.
//// 10���� : ���ڸ� ����� �� ����� �� �ִ� ������ ������ 10���̴�.
////			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
//// 16����: ���ڸ� ����Ҷ� ����� �� �ִ� ������ ������ 16���̴�.
////			{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F}
//// 2���� : ���ڸ� ����Ҷ� ����� �� �ִ� ������ ������ 2���̴�.
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
//		int n2 = 0x13; // 16���� 13 = 10���� 19 // 16������ ��Ÿ���� ���ؼ��� �տ� 0x�� ���̸� �ȴ�.
//		int n3 = 0xAB;
//		System.out.println(n1+" "+n2+" "+n3);
//		// 10��������, Ȥ�� 16�����̴�����
//		// 2������ ��Ÿ�� �� �ִ� ǥ��Ŭ������ ���°�?
//		int n4 =0x1234af;
//		// 0001 0010 0011 0100 1010 1010 1111
//		// 0001001000110100101010101111
//		String s = Integer.toBinaryString(n4);
//		System.out.println(s);
//		// �̰Ÿ� 4���� �� ������ ������?
//		// ���� ¥���Ѵ�!.....
//		// �� 32��Ʈ�� �����ϸ鼭, 4�ڸ��� ��� ���
//		System.out.println("------------------------------");
//		
//		System.out.println(hexaToBinary(n4));
//		String s7 = "ȣ����";
//		System.out.println(s7);
//		System.out.println(s7.hashCode());
//		// "ȣ��", "�ڶ���", "0ȣ����" -> �Ҽ� ����.
//		s7 = "0"+s7;
//		// �Ǵµ���?
//		System.out.println(s7);
//		System.out.println(s7.hashCode());
//		// �ؽ��ڵ带 ���غ���, ������ ���� ������, ���θ������ ��ü�̴�.
//		// �� String�� �����͸� ����/ ������ �� ����.
//		
//		// �̷���Ȳ���� ����� �� �ִ°��� ��Ʈ�� �����̴�.
//	}
//	static String hexaToBinary(int n) {
//		String s= Integer.toBinaryString(n);
//		System.out.println(s);
//		System.out.println(s.length());
//		while(s.length()<32) {
//			s = "0"+s;
//		}
//		System.out.println(s);
//		// ù��° ���
//		String s2 = "";
//		for (int i = 0; i < 8; i++) {
//			s2=s2+s.substring(i*4, i*4+4)+" ";
//		}
//		System.out.println(s2);
//		
//		// �ι�° ���
//		StringBuffer s1 = new StringBuffer(s);
//		for (int i = 0; i < 7; i++) {
//			s1.insert((7-i)*4, ' ');
//		}
//		System.out.println(s1);
////		 // ����° ��� -> �� �ƴ϶� �̰Ŵ� Ʋ�� ����̴�!!!!!!!
////		 // �տ������� �����̽��� �־� �����ٸ� �ڷΰ����� index�� ������ ��ĭ�� ���� �ȴ�.
////		StringBuffer s3 = new StringBuffer(s);
////		for (int i = 0; i < 7; i++) {
////			s1.insert((i+1)*4, ' ');
////		}
////		System.out.println(s3);
//		// ����° ���
//		// ���� ������ �ν��ϰ� �ֱ⿡, �̸� ����Ͽ� �ε����� �� i ������ ������ �ش�.
//		StringBuffer s3 = new StringBuffer(s);
//		System.out.println(s3+": ������ s3");
//		System.out.println(s3.hashCode()+": ������ s3�� �ؽ��ڵ�");
//		for (int i = 0; i < 7; i++) {
//			s3.insert((i+1)*4+i, ' ');
//		}
//		System.out.println(s3+": for�� ������ s3");
//		System.out.println(s3.hashCode()+": for�� ������ s3�� �ؽ��ڵ�");
//		// String�� ���� ������ ������ �� ������, �����Ѱ� ó�� ������ �ٸ���ü������, 
//		// String���۴� ����� ���� �� �� �ֵ���, hash�ڵ尡 �����Ǵ� ���� ���� ������ ��ü�� ���� �����͸� ��������� �� �� �ִ�.
//		return s1.toString();
//
//	}
//}
////ex90) 
//public class Hello{
//	public static void main(String[] args) {
//		// ������ ���ǵ��� ���� ���� -> �����̳�
//		// �÷����߿� 1�� LinkedList�� ����Ѵ�.
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
//		// 3���� ����� �ִ�.
//		// 1. Ȱ�뼺�� ����.
//		System.out.println(mm);
//		
//		// 2. Ȱ��󵵼��� ���� ����.
//		// for���� �̿��ϴ� ���
//		for (int i = 0; i < mm.size(); i++) {
//			System.out.print(mm.get(i)+", ");
//		}System.out.println();
//		
//		// 3. forEach(����ȭ�� for��)
//		// �ַ� data, value, item �̶�� ������ ����Ѵ�.
//		for (Integer item : mm) {
//			System.out.print(item+" ,");
//		}System.out.println();
//		
//		int data = mm.get(4);
//		System.out.println(data);
//		
//		// ���� - �迭�� forEach�� ��밡��
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
////ex91) �˻����� ���α׷�
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
//				System.out.println(i+"�� �ε����� ���ڰ� ã���ô� ���� "+num+"�Դϴ�.");
//				System.out.println("�����ϰڽ��ϴ�.");
//				mm.remove(i);
//				System.out.println(mm);
//				break;
//			}
//			if(i==mm.size()-1) {
//				System.out.println("�� ã�ҽ��ϴ�.");
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
//		System.out.println(mm.size()+"���� �����Ͱ� ����ֽ��ϴ�.");
//		System.out.println("-----------------------------------------------------------------------------------------");
//		
//		//eliminateEven1(mm);
//		eliminateEven2(mm);
//	}
//	static void eliminateEven1(LinkedList<Integer> A) {
//		for (int i = A.size()-1; i >=0; i--) {
//			if(A.get(i)%2==0) {
//				System.out.println(i+"�� index�� ������"+A.get(i)+"�� �����ϰڽ��ϴ�.");
//				A.remove(i);
//				
//			}
//		}
//		System.out.println("¦�� �������� ������ �Ϸ��߽��ϴ�.");
//		System.out.println(A);
//	}
//	static void eliminateEven2(LinkedList<Integer> A) {
//		int j = 0;
//		for (int i =0;i<A.size(); i++) {
//			if(A.get(i)%2==0) {
//				System.out.println(j+"�� index�� ������"+A.get(i)+"�� �����ϰڽ��ϴ�.");
//				A.remove(i);
//				i--;
//			}
//			j++;
//		}
//		System.out.println("¦�� �������� ������ �Ϸ��߽��ϴ�.");
//		System.out.println(A);
//	}
//}
////ex92) 
//public class Hello{
//	public static void main(String[] args) {
//		// ���α׷� ������ �ϱ� ���Ͽ� �Ϲ�������
//		// ������ �����͸� �������Ѽ� �׽�Ʈ�� ���� �Ѵ�.
//		// �ùķ��̼� ������( ��� ������ )
//		Random rand = new Random();
//		for (int i = 0; i < 10; i++) {
//			int num = rand.nextInt(100)+1;  // 1~100 ���� ������ ���� ����, 0~100�� ���Ѵٸ� rand.nexInt(101);
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
//				System.out.println(i+"�� index�� ������"+A.get(i)+"�� �����ϰڽ��ϴ�.");
//				A.remove(i);
//				
//			}
//		}
//		System.out.println("¦�� �������� ������ �Ϸ��߽��ϴ�.");
//		System.out.println(A);
//	}
//	static void eliminateEven2(LinkedList<Integer> A) {
//		int j = 0;
//		for (int i =0;i<A.size(); i++) {
//			if(A.get(i)%2==0) {
//				System.out.println(j+"�� index�� ������"+A.get(i)+"�� �����ϰڽ��ϴ�.");
//				A.remove(i);
//				i--;
//			}
//			j++;
//		}
//		System.out.println("¦�� �������� ������ �Ϸ��߽��ϴ�.");
//		System.out.println(A);
//	}
//}
////ex95) 
//class Tiger{
//	// private, public,... ����������.
//	private int a;
//	public int b;
//	int c; // �տ� default�� �������ֽ��ϴ�.
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
//		// System.out.println(t1.a); // a�� �����̺� ����
//		t1.insert();
//		t1.print();
//		// t1.m2(); // m2()�� private �Լ�
//		System.out.println(t1.b);
//	}
//}
////ex97) 
//class Tiger{
//	int money;			// 1. ���� ������ ���ɼ��� ����. -> ������ ���÷� �Ϲ� �̿��ڰ� �ڽ��� ���� ���Ƿ� �ø� �� �ִٰ� �����غ���
//	private int num;	// 2. 1������ �Ϲ����̴�. -> ������ ����
//	// �Ʒ��� ���� ��ü�� ������ �����ϴ� �Լ��� setter �Լ���� �Ѵ�.
//	void setNum(int num) {
//		this.num=num;
//	}
//	// �Ʒ��� ���� ��ü�� ������ ��ȯ�ϴ� �Լ��� getter�Լ�����Ѵ�.
//	int getNum() {
//		return this.num;
//	}
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		// t1.num = 100; -> �̷� �����̺� ������ �ܺο��� ��� �������ٱ�?
//		// �̷����� �Լ��� �̿��ؼ� �ܺο��� ������ �����Ѵ�.
//		t1.setNum(100);
//		System.out.println(t1.getNum());
//	}
//}
////ex97) -> �ܺο� ������ �����Ű�� �ʴ� �� -> ������ ����
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
//	// ������ ���콺 -> source ->generate getter and setter -> ���� ���� �ڵ�����!!
//	
//}
//public class Hello{
//	public static void main(String[] args) {
//		Tiger t1 = new Tiger();
//		t1.setAge(10);
//		t1.setName("ȫ�浿");
//		System.out.println(t1.getAge());
//		System.out.println(t1.getName());
//		t1.showInfo();
//	}
//}
////ex98) 
//// ************GoF ������ ����************ ���ͳݿ��� ã�ƺ���!!!!
//// �̱��� ���� : ���α׷����ο��� ��ü�� �� 1���� ������ų �� �ֵ���
//// Ŭ������ �����ϴ� ���(����)�� �̱��� �����̶�� �Ѵ�.
//// ��ü�� Ŭ������ �Ը� ũ��. -> �̷��� Ŭ������ ��ü�� ������ �����Ѵٸ�, �ڿ��� ���� �Ҹ��ϰԵȴ�.
//class Tiger{
//	static Tiger t = null;
//	private Tiger(){}// ��ü ������ ���� �� �ִ�. -> �̱��� �������� �� Ȯ���� ����!
//	static Tiger getObject() {
//		System.out.println(1);
//		if( t==null) {		
//			System.out.println(2);
//			Tiger.t = new Tiger();
//		}
//		return Tiger.t;
//	}
//	void m1() {
//		System.out.println("ȣ����");
//	}
//}
//class Apple{}
//public class Hello{
//	public static void main(String[] args) {
//		
//		// Tiger t2 = new Tiger(); // -> �̱��� ������ �ƴϴ� -> �Ǽ���� �ؼ��� �� �ִ�.
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
////ex99) ���� �����( File I/O ) : �������� ����ϴ°Ͱ� ����. -> ��� ���ϸ� �Ѳ��� �ݾ�����Ѵ�.
//public class Hello{
//	public static void main(String[] args) {
//		// ������ �Ѳ��� ������.
//		try {Writer w = new FileWriter("test01.txt");
//		w.write("�ٳ���\n");
//		w.write("ȣ����");
//		// ������ �Ѳ��� �ݴ´�.
//		w.close();
//		} catch (Exception e) {}
//		// ***���α׷��� ������ �ʰ� ������ ��������� Ȯ���ϴ� �ڵ��***
//		System.out.println("Exit");
//	}
//}

////ex100) 
//public class Hello{
//	public static void main(String[] args) {
//		// ������ �Ѳ��� ������.
//		try {
//		Writer w = new FileWriter("test01.txt");
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 8; j++) {
//				w.write((i+j)%2==0?"��":"��");
//			}
//			w.write("\n");
//		}
//		w.close();
//		} catch (Exception e) {}
//		// *** ���α׷��� ������ �ʰ� ������ ��������� Ȯ���ϴ� �ڵ�� ***
//		System.out.println("Exit");
//	}
//}

////ex101) 
//public class Hello{
//	public static void main(String[] args) {
//		int a = 100000;
//		short b;
//		
//		b=(short)a; // Ÿ�� ĳ�����̶�� �Ѵ�.
//		System.out.println(b);
//		System.out.println("--------------------------------");
//		try {
//			Reader r = new FileReader("test01.txt");		
//			while(true) {
//				int readData = r.read();
//				if(readData == -1) {
//					System.out.println("������ ������ ����");
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
//// �Ʒ��� ������̼��� interface���� �Լ��� �Ѱ��� �־�� �Ѵٶ�� ���ѻ����� �ɾ��ش�.
//@FunctionalInterface
//interface C{
//	void m1();
//}
//class B extends A{
//	// ������̼� ����
//	// �Ʒ��� �Լ��� �������̵� �Լ���� ���� �˷��ִ� �ڵ�
//	// �Ǽ��� �̿��� �����ϱ����� ����
//	@Override
////	void greencolor() { -> �̷������� ��Ÿ�� ������ �����϶�� �˷���
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
//		// ���� �ؽ��ڵ�� �ٸ���. -> ���� �ٸ� ��ü�̴�.
//		System.out.println(a3.hashCode());
//		a3 = new BB();
//		System.out.println(a3.hashCode());
//	}
//}
////ex103-3) 103-2)�� �޸� ������ ��ü�� ���� ������� ��ü ���ο� ������ ��ü������ ����� �� �ֵ��� �ϴ� ����� �����Ѵ�.
//// Gof �� decoration �����̴�.
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
//		a = new B(a); // ���ο� ��ü�� ���Թ޾� ó���� ��ü�� �Ҹ�Ǳ� ������ ������ ������ ��ü ���ο� ����� �޾Ҵ�
//		System.out.println(a.run());
//		a = new C(a);
//		System.out.println(a.run());
//	}
//}
////ex103-3)
//class Ŀ��{
//	int ���� = 30;
//
//	int ���() {
//		System.out.println("Ŀ�� �ֹ�");
//		return ����;
//	}
//}
//class ���� extends Ŀ��{
//	int ���� = 20;
//	Ŀ�� a;
//	����(Ŀ�� a){
//		this.a = a;
//	}
//	int ���() {
//		System.out.println("���� �ֹ�");
//		return ����+a.���();
//	}
//}
//class ���� extends Ŀ��{
//	int ���� = 10;
//	Ŀ�� a;
//	����(Ŀ�� a){
//		this.a = a;
//	}
//	int ���() {
//		System.out.println("���� �ֹ�");
//		return ����+a.���();
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		Ŀ�� �մ� = new Ŀ��();
//		//System.out.println(�մ�.���());
//		�մ� = new ����(�մ�);
//		�մ� = new ����(�մ�);
//		�մ� = new ����(�մ�);
//		�մ� = new ����(�մ�);
//		�մ� = new ����(�մ�);
//		System.out.println(�մ�.���());
//	}
//}
////ex104-1) ������ : ����ϴ� �������� Ÿ���� �ٲ� �� ���� ���ο� Ŭ������ �������Ѵ�.
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
//		b.setData("ȣ����");
//		System.out.println(b.getData());
//		
//		C c = new C();
//		c.setData(0.3f);
//		System.out.println(c.getData());
//	}
//}
////ex104-2) 
//class Tiger<T>{ // -> ����ϰ� ���� Ÿ���� �����̳� �ȿ� ����ؼ� ��� -> �� ������ generic �����̶�� �Ѵ�. 
//	// -> �޸�/�ӵ� ���� ���鿡���� �̵��� �� ���� ����, ���� ���α׷��� ���忡�� �ۼ��� ���̼������� ����ϴ� ����
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
//		t2.setData("ȣ����");
//		System.out.println(t2.getData());
//		
//		Tiger<Float> t3 = new Tiger<Float>();
//		t3.setData(3.14f);
//		System.out.println(t3.getData());
//		
//		LinkedList<Integer> mm = new LinkedList<Integer>();
//	}
//}
////ex105) // �������� ���μ����� �̿��� �ۼ��ϴ� ���α׷� -> ������ ���α׷��̶�� �Ѵ�. // ex) ���α׷� A�� ���α׷� B�� �͸����� Ÿ�鼭 �ϴ� ���α׷�
//// ���ÿ� ����Ǵ� �� ó�� �������� �� �����̴�.
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
////(105����)B              A
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
//		System.out.println("�ڹ�");
//		Thread t = new Tiger("�����");
//		t.start();
//		//try {Thread.sleep(1000);} catch (Exception e) {}
//		try {t.join();} catch (Exception e) {}
//		// �̷���쿡�� �ܼ��� 1000�̶�� ����� �־� sleep��Ű�⺸�ٴ� join�� ���� �ڵ带 �ۼ��ϴ°��� �ٶ����ϴ�.
//		// ** sleep �ּ� �� **
////		�ڹ�
////		Thread start
////		B run call
////		Thread End
////		main ���α׷� ����
//		
//		// ** sleep �ּ� �� **
////		�ڹ�
////		main ���α׷� ����
////		Thread start
////		B run call
////		Thread End
//		System.out.println("main ���α׷� ����");
//	}
//}
////ex107) 
//class Tiger extends Thread{
//	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("ȣ����"+i);
//			// 0�� �����䰡 �ƴϴ�. -> ���������� �̸��� �ƴϴ�.
//			// 0�� ����� �ּ��� �ð��� �����
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
//			System.out.println("�ڳ���"+i);
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
//		// try {Thread.sleep(2000);} catch (Exception e) {} // ���ŷ �Լ� -> Ư�� ������ �����Ǳ� ������, ���α׷� ������ �ߴܽ�Ű�� �Լ�
//		Scanner sc  = new Scanner(System.in); 
//		System.out.print("���ڸ� �Է��Ͻÿ�:");
//		int num = sc.nextInt(); // �굵 ���ڸ� �Է��Ҷ� ���� ��ٸ��ϱ� ���ŷ �Լ� -> ���ŷ �Լ����ÿ��� ���α׷��� �׻� �ߺ����� �� �� �����Ƿ�, ����� â ���� ���α׷� ����
//		System.out.println(num*20);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("���ڸ� �Է��Ͻÿ�:");
//			int n = sc.nextInt();
//			if(n == 999) {
//				System.out.println("���α׷��� �����մϴ�.");
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
//		// try {Thread.sleep(2000);} catch (Exception e) {} // ���ŷ �Լ� -> Ư�� ������ �����Ǳ� ������, ���α׷� ������ �ߴܽ�Ű�� �Լ�
//		Scanner sc  = new Scanner(System.in); 
//		System.out.println(1);
//		// Scanner�� ����
//		// 1. ���ŷ�� ��°� ����.
//		sc.nextInt();
//		System.out.println(2);
//		new Scanner(System.in).nextInt();
//		System.out.println(3);
//	}
//}
////ex109) 
//class Tiger extends Thread{
//	public void run() {
//		System.out.println("ȣ���̰� �ߵ���");
//		Thread t = new Lion();
//		t.start();
//		new Scanner(System.in).nextInt();
//		System.out.println("ȣ���̰� �����");
//	}
//}
//class Lion extends Thread{
//	public void run() {
//		System.out.println("���ڰ� �ߵ���");
//		new Scanner(System.in).nextInt();
//		System.out.println("���ڰ� �����");
//	}
//}
//public class Hello{
//	public static void main(String[] args) {
//		System.out.println("������ �ߵ���");
//		Thread t = new Tiger();
//		t.start();
//		new Scanner(System.in).nextInt();
//		System.out.println("������ �����");
////		������ �ߵ���
////		ȣ���̰� �ߵ���
////		���ڰ� �ߵ���
//		
////-------��������� ����-------
//		
////		1
////		������ �����
////		1
////		1
////		ȣ���̰� �����
////		���ڰ� �����
//
//	}
//}
////ex110) 
//// ���α׷��� ���� ������ ���� ����Ʈ -> �����
//class Lion extends Thread{
//	public void run(){
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}
//		System.out.println("���� �����");
//	}
//}
//class Tiger extends Thread{
//	public void run(){
//		for (int i = 0; i < 3; i++) {
//			System.out.println("��Ʈ��ũ ������ ��ٸ��ϴ�.");
//			// �����ð����� ������ ��ٸ��� �ִ� ���¸� ����
//			try {Thread.sleep(500);} catch (Exception e) {}
//			
//			System.out.println(i+"��° ���ڰ� �����Ͽ����ϴ�.");
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
////ex112) ���� ���� ���α׷�
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
//		mm.add( new Book("�ڹٸ� �����", "ȫ�浿", "������ ���ǻ�1", 2500));
//		mm.add( new Book("����� ������", "������", "������ ���ǻ�4", 2000));
//		mm.add( new Book("�䳢�� �ź���", "���ڹ̻�", "������ ���ǻ�1", 1000));
//		mm.add( new Book("�����ڴ¹�", "������", "������ ���ǻ�2", 1500));
//		mm.add( new Book("���� �����׸��� ����", "����", "������ ���ǻ�3", 5000));
//		System.out.println("å�� �Ǽ�: "+mm.size());
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
//		mm.set(3, new Book("���� �Ͼ�¹�", "������", "������ ���ǻ�6", 4500));
//		for (Book item : mm) {
//			item.showInfo();
//		}
//		System.out.println("--------------------------------------");
//		
//		// search
//		Book findBook = search(mm,"����");
//		if(findBook!=null) {
//			System.out.println("ã�Ҵ�");
//			findBook.showInfo();
//		}else {
//			System.out.println("���ڸ� ã�� ���߽��ϴ�.");
//		}
//	}
//	static Book search(LinkedList<Book> bookList, String name) {
//		for (Book book : bookList) {
//			if(book.author.equals(name)) {//  String �񱳴� .equals�� �Ѵ�.
//				return book;
//			} 
//		}
//		return null;// �̷������� if�� �ɸ��� �ʾ��� ��쵵 ������ �� �ֵ��� �ؾ��� ������ �ȶ��.
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
//		System.out.println(hexaToBinary(n1|n2)); // ��Ʈ or
//		System.out.println(hexaToBinary(n1&n2)); // ��Ʈ and
//		System.out.println(n1);
//		System.out.println(Integer.toHexString(n1));
//		System.out.println("_______________________________________");
//		System.out.println(hexaToBinary(n1&0x0000ffff));
//		System.out.println(Integer.toHexString(n1&0x0000ffff));
//		// �̷������� ��Ʈ and������ Ư���κ��� ������ �뵵�� �°� ���͸� �ϱ� ���ؼ� ���� ���δ�.
//		System.out.println(hexaToBinary(n1|0xffff0000));
//		// Ư�� ��Ʈ�� ������ ��� 1�� ����� ������, ��Ʈ or���� ���
//		// ��Ʈ ����Ʈ: ">>" "<<"
//		// ex ">>3" ���������� 3��Ʈ ����Ʈ �Ͻÿ�
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
//		System.out.println("�׽�Ʈ1");
//		int n1 = 0x3b12cd59;
//		System.out.println(n1);
//		System.out.println(Integer.toHexString(n1));
//		System.out.println(hexaToBinary(n1));
//		// 0x 3b 12 cd 59;
//		// 0x59 -> 10������ ���ΰ�?
//		// 0xcd -> 10������ ���ΰ�?
//		// 0x12 -> 10������ ���ΰ�?
//		// 0x3b -> 10������ ���ΰ�?
//		System.out.println(Integer.toHexString(n1&0x000000ff));
//		System.out.println(n1&0x000000ff);
//		System.out.println();
//		System.out.println(Integer.toHexString(n1&0x0000ff00));
//		System.out.println(n1&0x0000ff00);
//		// �̷��� �ϸ� �ȵȴ�. ��Ʈ ����Ʈ�� cd ���� 00�� ��������.
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
//                System.out.println(thread.getName() + " ��� �ݾ� ->> "+money);
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
//            // 100, 200, 300 ���� �� ���� ���Ƿ� �����ؼ� ���(withDraw)�Ѵ�.
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
//		System.out.println("�ҿ�ð�2:"+(System.currentTimeMillis()-startTime));
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
//		System.out.println("�ҿ�ð�2:"+(System.currentTimeMillis()-startTime));
//	}
//}
////ex117-1)
//public class Hello{
//	public static void main(String[] args) {
//		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
//		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
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
//		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
//		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
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
