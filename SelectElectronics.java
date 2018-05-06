package lab2;

import java.util.Scanner;

public class SelectElectronics {
	public static void main(String[] args){
		
		//提示用户操作
		System.out.println("Shopping管理系统>购物结算");
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("请选择商品的编号：");
		System.out.println("1.电风扇  "+"2.电水壶  "+"3.空气净化器  "+"4.电吹风");
		System.out.println("=============================");
		
		//定义商品的价格，总价
		double dfs=150.0;
		double dsh=130.0;
		double kqj=300.0;
		double dcf=350.0;
		double sum=0.0;
		
		//定义循环名为exe
		exe:do{
			//获取商品编号
			System.out.println("请输入商品编号：");
			Scanner sc1 = new Scanner(System.in);
			int no = sc1.nextInt();
			
			//获取商品数量
			System.out.println("请输入商品数量：");
			Scanner sc2 = new Scanner(System.in);
			int num=sc2.nextInt();
			
			//判断商品编号，得到总价，输出价格
			switch(no){
			case 1:
				double sum1=dfs*num;
				System.out.println("电风扇 ￥150.0"+"\t"+"数量："+num+"\t"+"合计：￥"+sum1);
				sum+=sum1;
				break;
			case 2:
				double sum2=dsh*num;
				System.out.println("电水壶 ￥130.0\t"+"数量："+num+"\t合计：￥"+sum2);
				sum+=sum2;
				break;
			case 3:
				double sum3=kqj*num;
				System.out.println("空气净化器 ￥300.0\t"+"数量："+num+"\t合计：￥"+sum3);
				sum+=sum3;
				break;
			case 4:
				double sum4=dcf*num;
				System.out.println("电吹风 ￥350.0\t"+"数量："+num+"\t合计：￥"+sum4);
				sum+=sum4;
				break;
			default:
				System.out.println("输入错误！请正确输入！");
				break;
			}
			
			//判断是否退出
			System.out.println("是否退出？（y/n）");
			Scanner sc3 = new Scanner(System.in);
			String pan = sc3.next();
			if(pan.equals("y")){
				break exe;
			}
		}while(true);
		
		//输出总价
		System.out.println("=============================");
		System.out.println("您应付的总价为：￥"+sum);
		System.out.println("谢谢惠顾！");
	}
	
}
