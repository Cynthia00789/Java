package lab2;

import java.util.Scanner;

public class SelectElectronics {
	public static void main(String[] args){
		
		//��ʾ�û�����
		System.out.println("Shopping����ϵͳ>�������");
		System.out.println(" ");
		System.out.println("=============================");
		System.out.println("��ѡ����Ʒ�ı�ţ�");
		System.out.println("1.�����  "+"2.��ˮ��  "+"3.����������  "+"4.�紵��");
		System.out.println("=============================");
		
		//������Ʒ�ļ۸��ܼ�
		double dfs=150.0;
		double dsh=130.0;
		double kqj=300.0;
		double dcf=350.0;
		double sum=0.0;
		
		//����ѭ����Ϊexe
		exe:do{
			//��ȡ��Ʒ���
			System.out.println("��������Ʒ��ţ�");
			Scanner sc1 = new Scanner(System.in);
			int no = sc1.nextInt();
			
			//��ȡ��Ʒ����
			System.out.println("��������Ʒ������");
			Scanner sc2 = new Scanner(System.in);
			int num=sc2.nextInt();
			
			//�ж���Ʒ��ţ��õ��ܼۣ�����۸�
			switch(no){
			case 1:
				double sum1=dfs*num;
				System.out.println("����� ��150.0"+"\t"+"������"+num+"\t"+"�ϼƣ���"+sum1);
				sum+=sum1;
				break;
			case 2:
				double sum2=dsh*num;
				System.out.println("��ˮ�� ��130.0\t"+"������"+num+"\t�ϼƣ���"+sum2);
				sum+=sum2;
				break;
			case 3:
				double sum3=kqj*num;
				System.out.println("���������� ��300.0\t"+"������"+num+"\t�ϼƣ���"+sum3);
				sum+=sum3;
				break;
			case 4:
				double sum4=dcf*num;
				System.out.println("�紵�� ��350.0\t"+"������"+num+"\t�ϼƣ���"+sum4);
				sum+=sum4;
				break;
			default:
				System.out.println("�����������ȷ���룡");
				break;
			}
			
			//�ж��Ƿ��˳�
			System.out.println("�Ƿ��˳�����y/n��");
			Scanner sc3 = new Scanner(System.in);
			String pan = sc3.next();
			if(pan.equals("y")){
				break exe;
			}
		}while(true);
		
		//����ܼ�
		System.out.println("=============================");
		System.out.println("��Ӧ�����ܼ�Ϊ����"+sum);
		System.out.println("лл�ݹˣ�");
	}
	
}
