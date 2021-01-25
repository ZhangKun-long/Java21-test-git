package com.neuedu.part03;

import java.util.Scanner;

/**
 * 
 * 流程控制语句
 * 1.条件语句，在程序运行过程中，根据条件是否成立，执行代码的过程
 * if语句if(表达式)｛执行语句块;｝其中表达式结果只能为true和false，如果表达式为真时进入语句块执行
 *当if和else当中只有一条语句时，可以不写｛｝
 */
public class Testpart301 {
	public static void main(String[] args) {
		/*System.out.println("请输入一个数字：");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); 
		if (a%2 == 0) {
			System.out.println(a+"为偶数");
		}else {
			System.out.println(a+"为奇数");
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
		
		//控制台输出一个成绩，输出该成绩的等级：90-100优  80-89良  70-79中等 60-69及格  0-60不及格
		System.out.println("请输出成绩以显示等级：");
		Scanner soc = new Scanner(System.in);
		int a = soc.nextInt();
		//判断输入的是否合法
		if (a < 0 || a > 100) {
			System.out.println("输入错误，请重新输入！");
			 a = soc.nextInt();
			if(a < 0 || a > 100){
				System.out.println("频繁输入错误，输入结束！");
				return;
			}
		}
		
		if(a<60&&a>=0){
			System.out.println("成绩不及格");
		}else if (a >= 60&&a<=69) {
			System.out.println("成绩及格");
		}else if (a >= 70&&a<=79) {
			System.out.println("成绩中等");
		}else if (a >= 80&&a<=89) {
			System.out.println("成绩良好");
		}else if (a >= 90&&a<=100) {
			System.out.println("成绩优秀");
		}
	}
}
