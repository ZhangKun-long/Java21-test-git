package com.neuedu.part03;

import java.util.Scanner;

/**
 * 
 * ���̿������
 * 1.������䣬�ڳ������й����У����������Ƿ������ִ�д���Ĺ���
 * if���if(���ʽ)��ִ������;�����б��ʽ���ֻ��Ϊtrue��false��������ʽΪ��ʱ��������ִ��
 *��if��else����ֻ��һ�����ʱ�����Բ�д����
 */
public class Testpart301 {
	public static void main(String[] args) {
		/*System.out.println("������һ�����֣�");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); 
		if (a%2 == 0) {
			System.out.println(a+"Ϊż��");
		}else {
			System.out.println(a+"Ϊ����");
		}*/
		
		//men1 women2 chid3
		/*int type = 1;
		if(type == 1){
			System.out.println("men");
			}else if (type == 2) {
				System.out.println("women");
			}else if(type == 3){
				System.out.println("child");
			}else {
				System.out.println("error");
			}
		*/
		
		//����̨���һ���ɼ�������óɼ��ĵȼ���90-100��  80-89��  70-79�е� 60-69����  0-60������
		System.out.println("������ɼ�����ʾ�ȼ���");
		Scanner soc = new Scanner(System.in);
		int a = soc.nextInt();
		//�ж�������Ƿ�Ϸ�
		if (a < 0 || a > 100) {
			System.out.println("����������������룡");
			 a = soc.nextInt();
			if(a < 0 || a > 100){
				System.out.println("Ƶ������������������");
				return;
			}
		}
		
		if(a<60&&a>=0){
			System.out.println("�ɼ�������");
		}else if (a >= 60&&a<=69) {
			System.out.println("�ɼ�����");
		}else if (a >= 70&&a<=79) {
			System.out.println("�ɼ��е�");
		}else if (a >= 80&&a<=89) {
			System.out.println("�ɼ�����");
		}else if (a >= 90&&a<=100) {
			System.out.println("�ɼ�����");
		}
	}
}
