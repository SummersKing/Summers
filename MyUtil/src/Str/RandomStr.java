package Str;

import java.util.ArrayList;
import java.util.Random;

public class RandomStr {
private String phrase=null;
private Random random=new Random();
private StringBuilder strB = new StringBuilder();
static {
}
	@SafeVarargs
	public RandomStr(ArrayList<String> ...parm) {
		int len=parm.length;
		for(int i=0;i<len;i++) {
			strB.append(parm[i].get(random.nextInt(parm[i].size())));
		}
		this.phrase=strB+"";
	}
	public RandomStr(String[]...parm) {
		int len=parm.length;
		for(int i=0;i<len;i++) {
			strB.append( parm[i][random.nextInt(len)]);
		}
		this.phrase=strB+"";
	}
	/**  

	 * <p>Title: getRandonmPhrase</p>  

	 * <p>Description: 输入一些list 参数自动生成一个随机字符串从每个list获取一个元素</p>  

	 * @param parm 可变参数
	 * @return  字符串
	 * <p> @date 2018年11月1日  </p> 
	 */
	public static String getRandonmPhrase(ArrayList<String> ...parm) {
		Random random=new Random();
		int len=parm.length;
		String phrase=null;
		StringBuilder strB = new StringBuilder();
		for(int i=0;i<len;i++) {
		strB.append(random.nextInt(parm[i].size()));
		}
		phrase=strB+"";
		return phrase;
	}
}
