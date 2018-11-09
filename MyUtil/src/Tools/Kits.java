package Tools;

import java.io.Closeable;
import java.util.Scanner;

import jdk.internal.dynalink.beans.StaticClass;

public class Kits {

	/**
	 * 
	 * <p>
	 * Title: 分割线
	 * </p>
	 * 
	 * <p>
	 * Description: 分割线，按J键继续
	 * </p>
	 * 
	 * <p>
	 * @date 2018年8月21日
	 * </p>
	 */
	@Deprecated
	public static void fenge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("按J继续");
		System.out.println("-----------------------------------------------");
		String c = sc.next();
		while (true) {
			if (c.equals("j") || c.equals("J")) {
				break;
			}
		}
		sc.close();
	}

	/**  
	
	 * <p>Title: max</p>  
	
	 * <p>Description:输入一些double 数据输出最大的 </p>  
	
	 * @param values
	 * @return  
	 * <p> @date 2018年11月1日  </p> 
	 */
	public double max(double... values) {
		double largest = Double.MIN_VALUE;
		for (double v : values)
			if (v > largest)
				largest = v;

		return largest;
	}

	public static void printAscii(int start, int end) {
		boolean flag = true;

		int num = end - start;
		for (int i = 0; i <= num / 10; i++) {
			int z = i * 10;
			for (int j = 0; j < 10; j++) {
				int x = z + j + start;
				char ch = (char) (x);
				System.out.print(x + ":" + ch + "   ");
				if (z > end) {
					flag = false;
				}

			}
			System.out.println();
		}

	}
public static void main(String[] args) {
}

	/**  
	
	 * <p>Title: close</p>  
	
	 * <p>Description:所有的IO流都继承Closeable接口 </p>  
	
	 * @param closeableList  
	 * <p> @date 2018年9月10日  </p> 
	 */
	public static void close(Closeable... closeableList) {
        try {
            for (Closeable closeable : closeableList) {
                if ( null!= closeable){
                    closeable.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
