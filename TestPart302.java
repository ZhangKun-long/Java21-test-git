package com.neuedu.part03;

import java.util.Scanner;

/**
 * 
 * switch 流程判断 语句结构 switch(表达式) {case 值: 代码块;[break;]可写可不写，作用执行到这停止 case 值:
 * 代码块;[break;]可写可不写，作用执行到这停止 ..... default: 代码块; } 注意事项：
 * 1.表达式的值必须为byte,short,char,int和String 2.case后面的值必须为常量，定制，且不能重复 3.功能代码块可以为多行
 * 4.default相当于if else中的else 常量：不可变的量，固定值，在定义变量时前面加上final
 *
 */
public class TestPart302 {
	public static void main(String[] args) {
		/*
		 * final int i = 2;
		 * 
		 * switch(i){ case 1: System.out.println("1"); case 2:
		 * System.out.println("2"); break; default: System.out.println("默认值");
		 * 
		 * }
		 */

		// 控制台输出一个成绩，输出该成绩的等级：90-100优 80-89良 70-79中等 60-69及格 0-60不及格
		/*
		 * int score; final Scanner rd=new Scanner(System.in);
		 * System.out.println("请输入成绩："); score=rd.nextInt(); if(score <0 ||
		 * score>100){ System.out.println("输入有误"); return; }
		 * 
		 * 
		 * switch(score/10) { case 10: case 9:System.out.println("成绩为优="+score);
		 * break; case 8:System.out.println("成绩为良="+score); break; case
		 * 7:System.out.println("成绩为中="+score); break; case
		 * 6:System.out.println("成绩为及格="+score); break;
		 * default:System.out.println("成绩为不及格="+score);
		 * 
		 * }
		 */

		// 给定一个年份，判断是否是闰年 （被4但不能被100整除，能被400整除）
		System.out.println("请输入一个年份：");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();

		// 输入一个月份，判断输出与此月份天数相同的月份（switch）
		// 1,3,5,7,8,10,12 这是31天
		// 4,6,9,11 这是31天
		// 2这是29天
		System.out.println("请输入一个月份：");
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
			System.out.println("1,3,5,7,8,10,12  这是31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("4,6,9,11这是30天");
			break;
		default:
			if ((s1 % 4 == 0 && s1 % 100 != 0) || (s1 % 400 == 0)) {
				System.out.println(mon + "是29天！");
			} else {
				System.out.println(mon + "是28天！");
			}

		}

	}
}
