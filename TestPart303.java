package com.neuedu.part03;

import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

/**
 * 
 * ѭ�� 1.while(���ʽ){�����} //������ʽ���Ϊ���ִ�д����,�������������ʽ����ʱѭ��ֹͣ 2.do...while();
 * do{�����} while(); ��Ĭ��ִ��һ�Σ���ȥУ��������� 3.for(���ʽ1�����ʽ2�����ʽ3){�����} ���ʽ1�����ڳ�ʼ����ִֻ��һ��
 * ���ʽ2��ѭ��������Ϊ������ ���ʽ3��������� debug �ȼӶϵ� F6ִ�д��� F8�����ϵ� ѭ���ǿ���Ƕ�׵ģ����ʽ���Բ�д���ֺű���д
 * ѭ�����ն�break:�жϵ�ǰѭ��
 * continueֻ��������ѭ��
 * ��ʽ�����룺Ctrl+shift+F
 *
 *
 */
public class TestPart303 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		// ��ѭ�� ��Զ����ֹͣ��ѭ��
		do {
			System.out.println("ִ����ѭ����");

		} while (a > b);

		// ���1-100�ĺ�
		int sum = 0;
		a = 1;
		while (a <= 100) {
			sum += a;
			a++;
		}
		System.out.println(sum);

		sum = 0;
		a = 1;
		do {
			sum += a;
			a++;
		} while (a <= 100);
		System.out.println(sum);

		// ����1-1000��������
		sum = 0;
		a = 1;
		while (a < 1000) {
			sum += a;
			a += 2;
		}
		System.out.println(sum);

		sum = 0;
		for (int k = 1; k < 1000; k += 2) {
			sum += k;
		}
		System.out.println(sum);

		// �������7�е�*
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			System.out.println("*******");
		}

		// �ж�һ�����Ƿ�Ϊ����������������1������1��������֮��û������������������
		// ����˴�дreturn������������䲻���У�return�ǽ���������break��������ѭ��
		System.out.println("������һ������");
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		for (j = 2; j < i; j++) {
			if (i % j == 0) {
				System.out.println("��������");
				break;
			} else {
				System.out.println("������");
				break;
			}
		}

		// һ���� ��3�� ÿ��4%������(����) �������Ϣ����
		float money = 1000000f;
		for (j = 0; j < 3; j++) {
			money = money + money * 0.04f;
		}
		System.out.println(money);

		// �������7�е�*
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 7; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}

		// ���1+1/2+1/3+1/4+...+1/100�ĺ�
		double su = 0;
		double i1 = 0;
		for (i1 = 1; i1 <= 100; i1++) {
			su = su + 1 / i1;
		}
		System.out.println(su);

		// ����99�˷���
		i = 1;
		j = 1;
		sum = 0;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= i; j++) {
				sum = i * j;
				System.out.print(i + "*" + j + "=" + sum + "\t");
			}
			System.out.print("\n");
		}

		// 1+2+3+4+...�ۼӶ��ٴ��ܳ���666 һ�㲻֪��ѭ�������� �Ƽ���whileѭ��
		// ѭ�����ն�
		i = 1;
		sum = 0;
		while (sum < 666) { // �������i�Ĵ��������1�����Դ�1��ʼ��<666
			sum += i;
			i++;
		}
		System.out.println(i);

		i = 1;
		j = 0;
		sum = 0;
		while (true) {
			j++;
			sum += i;
			i++;
			if (sum > 666) {
				break;
			}
		}
		System.out.println(i);

		// ��дһ�������ҳ�����200����С��������
		int n = 201;
		while (true) {
			boolean c = true;
			for (i = 2; i < n; i++) {
				if (n % i == 0)
					c = false;
			}
			if (c)
				break;
			n++;
		}
		System.out.println(n);

		i = 200;
		while (true) {
			int cout = 0;
			i++;
			for (int g = 2; g < i; g++) {
				if (i % g == 0) {
					cout++;
					break;
				}
			}
			if (cout == 0) {
				System.out.println(i);
				break;
			}
		}

		//continue
		//ָ��ѭ��λ����������Ŀ��λ�ô�������label��ʶ����ð�ţ��ڹؼ��ֺ����
		//break label��ָ��ѭ����ֹ
		//continue label��ָ��ѭ����ʼ
		 inner:for (i = 1; i < 20; i++) {
	            if ((i % 2) == 0) {
	                continue inner;
	            }
	            System.out.print(i + " ");
	        }
		
		
		 outer: for ( i = 0; i < 10; i++) {
	            System.out.println("Outer loop");
	            inner: while (true) {
	                Scanner sc = new Scanner(System.in);
	                String t = sc.next();
	                System.out.println("inner Loop:" + t);
	                if (s.equals("hello"))
	                    break inner;
	                if (s.equals("kitty"))
	                    break outer;
	            }
	        }
		
		//��չ���������ģʽ�еĲ���ģʽ		����ģʽ���else if����  ����ԭ�򣺶���չ���ţ����޸Ĺر�  �������޸Ĵ��룬����
	        
	        
	        
	        
	}
}
