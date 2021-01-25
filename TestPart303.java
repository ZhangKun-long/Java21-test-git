package com.neuedu.part03;

import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

/**
 * 
 * 循环 1.while(表达式){代码块} //如果表达式结果为真就执行代码块,不满足条件表达式条件时循环停止 2.do...while();
 * do{代码块} while(); 会默认执行一次，再去校验这个条件 3.for(表达式1，表达式2，表达式3){代码块} 表达式1：用于初始化，只执行一次
 * 表达式2：循环条件，为布尔型 表达式3：迭代语句 debug 先加断点 F6执行代码 F8结束断点 循环是可以嵌套的，表达式可以不写，分号必须写
 * 循环的终端break:中断当前循环
 * continue只跳出本次循环
 * 格式化代码：Ctrl+shift+F
 *
 *
 */
public class TestPart303 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		// 死循环 永远不会停止的循环
		do {
			System.out.println("执行了循环！");

		} while (a > b);

		// 输出1-100的和
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

		// 计算1-1000的奇数和
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

		// 输出五行7列的*
		int i = 0;
		int j = 0;
		for (i = 0; i < 5; i++) {
			System.out.println("*******");
		}

		// 判断一个数是否为质数（素数）大于1，除了1和他本身之外没有其他数可以整除它
		// 如果此处写return则后面的所有语句不运行，return是结束方法，break结束本次循环
		System.out.println("请输入一个数：");
		Scanner s = new Scanner(System.in);
		i = s.nextInt();
		for (j = 2; j < i; j++) {
			if (i % j == 0) {
				System.out.println("不是素数");
				break;
			} else {
				System.out.println("是素数");
				break;
			}
		}

		// 一百万 存3年 每年4%的利率(复利) ，三年后本息多少
		float money = 1000000f;
		for (j = 0; j < 3; j++) {
			money = money + money * 0.04f;
		}
		System.out.println(money);

		// 输出五行7列的*
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 7; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}

		// 输出1+1/2+1/3+1/4+...+1/100的和
		double su = 0;
		double i1 = 0;
		for (i1 = 1; i1 <= 100; i1++) {
			su = su + 1 / i1;
		}
		System.out.println(su);

		// 输入99乘法表
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

		// 1+2+3+4+...累加多少次能超过666 一般不知道循环次数的 推荐与while循环
		// 循环的终端
		i = 1;
		sum = 0;
		while (sum < 666) { // 这个方法i的次数多加了1，所以从1开始到<666
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

		// 编写一个程序，找出大于200的最小的质数。
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
		//指定循环位置跳出，在目标位置创建名称label标识符加冒号，在关键字后面加
		//break label是指定循环终止
		//continue label是指定循环开始
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
		
		//扩展：常用设计模式中的策略模式		策略模式解决else if问题  开闭原则：对扩展开放，对修改关闭  不建议修改代码，加类
	        
	        
	        
	        
	}
}
