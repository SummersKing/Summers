package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import eff.test;
import io.FileUtil;
import sun.management.counter.Variability;

public class Test {

	public static void main(String[] args) {
		
		test test1 = new test(1);
		test test2 = new test(2);
		test test3 = new test(3);

	}
	public static void effteste() {
		ArrayList<String>arrayList=new ArrayList<>();
		String tel = "1你好嘛1wqedrqwdqw";
        String telReg = "[A-Za-z0-9]+";
        System.out.println(tel.matches(telReg));
        
        //List list = Collections.synchronizedList(new ArrayList());
	}
	public static  void systemDemo() {
		String[] src= {"s","Sa","sa"};
		String[] dest={"1","2","3","4","5"};
		System.arraycopy(src, 1, dest, 3, 2);//被复制的数组，复制开始的位置，目标数组，复制开始索引，个数
		System.out.println(Arrays.toString(dest));
		long ctm = System.currentTimeMillis();
		Date date = new Date();
		long time = date.getTime();
		System.out.println("ctm="+ctm+"\r\n"+"time"+time);
	}

}
