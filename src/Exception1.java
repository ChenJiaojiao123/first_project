import java.util.Scanner;
/**
 *@ClassName:Exception1
 *@Description:
 *@author Chenjiao
 *@date:2017��11��18��
 */
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ��ʮ���������������磺FF��");
		Scanner in=new Scanner(System.in);
		String a=in.next();
		int b;
		try
		{  						 //�쳣����
			b=Integer.parseInt(a,16);
			System.out.println(a+"ת����ʮ����Ϊ��"+b);
		}
		catch(Exception e)
		{
			e.printStackTrace();     //������ջ�е���Ϣ���
			System.out.println(a+"����һ����Ч��ʮ��������");
			b=0;
		}
		System.out.println("����");
	}
}
