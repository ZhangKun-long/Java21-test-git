package com.neuedu.part03;

import java.util.Scanner;

/**
 * 
 * switch �����ж� ���ṹ switch(���ʽ) {case ֵ: �����;[break;]��д�ɲ�д������ִ�е���ֹͣ case ֵ:
 * �����;[break;]��д�ɲ�д������ִ�е���ֹͣ ..... default: �����; } ע�����
 * 1.���ʽ��ֵ����Ϊbyte,short,char,int��String 2.case�����ֵ����Ϊ���������ƣ��Ҳ����ظ� 3.���ܴ�������Ϊ����
 * 4.default�൱��if else�е�else ���������ɱ�������̶�ֵ���ڶ������ʱǰ�����final
 *
 */
public class TestPart302 {
	public static void main(String[] args) {
		/*
		 * final int i = 2;
		 * 
		 * switch(i){ case 1: System.out.println("1"); case 2:
		 * System.out.println("2"); break; default: System.out.println("Ĭ��ֵ");
		 * 
		 * }
		 */

		// ����̨���һ���ɼ�������óɼ��ĵȼ���90-100�� 80-89�� 70-79�е� 60-69���� 0-60������
		/*
		 * int score; final Scanner rd=new Scanner(System.in);
		 * System.out.println("������ɼ���"); score=rd.nextInt(); if(score <0 ||
		 * score>100){ System.out.println("��������"); return; }
		 * 
		 * 
		 * switch(score/10) { case 10: case 9:System.out.println("�ɼ�Ϊ��="+score);
		 * break; case 8:System.out.println("�ɼ�Ϊ��="+score); break; case
		 * 7:System.out.println("�ɼ�Ϊ��="+score); break; case
		 * 6:System.out.println("�ɼ�Ϊ����="+score); break;
		 * default:System.out.println("�ɼ�Ϊ������="+score);
		 * 
		 * }
		 */

		// ����һ����ݣ��ж��Ƿ������� ����4�����ܱ�100�������ܱ�400������
		System.out.println("������һ����ݣ�");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();

		// ����һ���·ݣ��ж��������·�������ͬ���·ݣ�switch��
		// 1,3,5,7,8,10,12 ����31��
		// 4,6,9,11 ����31��
		// 2����29��
		System.out.println("������һ���·ݣ�");
		Scanner month = new Scanner(System.in);
		int mon = month.nextInt();
		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("1,3,5,7,8,10,12  ����31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("4,6,9,11����30��");
			break;
		default:
			if ((s1 % 4 == 0 && s1 % 100 != 0) || (s1 % 400 == 0)) {
				System.out.println(mon + "��29�죡");
			} else {
				System.out.println(mon + "��28�죡");
			}

		}

	}
}
