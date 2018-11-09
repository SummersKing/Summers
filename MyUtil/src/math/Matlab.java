package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matlab {

	public static void main(String[] args) {

		latinMatrix(23);
		
	}
	
	/**  
	
	 * <p>Title: latinMatrix</p>  
	
	 * <p>Description: 获取一个拉丁方数据列</p>  
	
	 * @param l 拉丁方数据的长度  
	 * <p> @date 2018年11月1日  </p> 
	 */
	public static void latinMatrix(Integer l) {
		Random random = new Random();
		Integer init=random.nextInt(l)+1;
		List <Integer>martix=new ArrayList<>();
		int m=0;
		int y1=0;
		for(int y=0;y<l;y++) {
			
			if(init<l||init<y1) {
				init++;
			}else if(init==l) {
				init=1;
			}
			for(int x=0;x<l;x++) {
				 if(x==0) { y1=init; m=y1;}
					if(m<l||m<y1) {
						m++;
					}else if(m==l) {
						m=1;
					}
				 martix.add(m);
				 System.out.print(m+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
