package Tools;
import java.util.*;
public class Randomint {
		
	public static int[] randomint(int num)
	/* 
	 * randomint 方法主要生成
	 *@param range 生成1~range的整数序列
	 *@param num 生成1~range中num个随机数，且不重复
	 *return nums(整数随机序列数组)
	 */
	{
		System.out.println();
		int[] nums=new int[num];
		r:for(int j=0;j<num;j++) {
	      	  int rand=(int)(Math.random()*num+1);
	          	 for(int k=0;k<num;k++) { 	 
	                if(rand==nums[k]){
	              	    j--;
	              	    continue r;}
	          	 }
	          	  nums[j]=rand;
	          	 }
		System.out.println("自动生成1到"+num+"的随机数组");
		for(int i=0;i<num;i++) {
			System.out.print(nums[i]+" ");
		}
		
		return nums;
	}
	/**  
	
	 * <p>Title: 1~range内num 个不重复的随机数</p>  
	
	 * <p>Description: </p>  
	
	 * @param range
	 * @param num
	 * @return  
	 * <p> @date 2018年8月21日  </p> 
	 */
	public static int[] randomint(int range, int num) {
		System.out.println();
		int[] nums=new int[num];
		r:for(int j=0;j<num;j++) {
	      	  int rand=(int)(Math.random()*range+1);
	          	 for(int k=0;k<num;k++) { 	 
	                if(rand==nums[k]){
	              	    j--;
	              	    continue r;}
	          	 }
	          	  nums[j]=rand;
	          	 }		
		System.out.println("自动生成"+num+"个1到"+range+"的不重复的随机数组：");
		for(int i=0;i<num;i++) {
			System.out.print(nums[i]+" ");
		}
		
		return nums;

	}
	
	public static int[] randomeeasy(int nums) {
		long []oldnums=new long[nums];
		
		for(int i=0;i<nums;i++) {
			long a=(long)(Math.random()*2000000000);
			oldnums[i]=a;
		}
		int[] newnums= new int [nums];
		for(int i=0;i<nums;i++) {
			      int k=1;
			for(int j=0;j<nums;j++) {
			
				if(oldnums[i]>oldnums[j]) {
                       k++;	
				}
                 newnums[i]=k;
			}
		}
		System.out.println();
		System.out.println("自动生成1到"+nums+"的的随机数组：");
		System.out.println(Arrays.toString(newnums));
		return newnums;
	}
	
	public static String randomfromshuzu(String shuzu[])
	
	{
		int a=shuzu.length;
		int nums=(int)(Math.random()*a);
		String yuansu =shuzu[nums];
         
		return yuansu;
		
	}
	

//	public static void main(String[]args){
//		Randomint a=new Randomint();
//		a.randomint(12);//静态方法不用也可以实现
//		a.randomeeasy(12);
//	    a.randomint(12,12);
//		
//	}
}
