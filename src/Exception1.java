import java.util.Scanner;
/**
 *@ClassName:Exception1
 *@Description:
 *@author Chenjiao
 *@date:2017年11月18日
 */
public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个十六进制数：（例如：FF）");
		Scanner in=new Scanner(System.in);
		String a=in.next();
		int b;
		try
		{  						 //异常处理
			b=Integer.parseInt(a,16);
			System.out.println(a+"转换成十进制为："+b);
		}
		catch(Exception e)
		{
			e.printStackTrace();     //将跟踪栈中的信息输出
			System.out.println(a+"不是一个有效的十六进制数");
			b=0;
		}
		System.out.println("结束");
	}
}
