package Tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.sun.jmx.snmp.Timestamp;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.bcel.internal.util.Class2HTML;

public class TimekKts {
private static long ctm=System.currentTimeMillis();
private static Date date=new Date();// Sat Oct 27 10:22:34 CST 2018
private static Timestamp timestamp =new Timestamp();
private static SimpleDateFormat sdf=new SimpleDateFormat("北京时间：y-M-d h:m:s ");

public static String getTimeA() {
	long currentTimeMillis = System.currentTimeMillis();
	date=new Date(currentTimeMillis);
	String format = sdf.format(date);
	System.out.println(format);
	return format;
}
public static String getTimeB() {
	String format = sdf.format(date);
	System.out.println(format);
	return format;
}
public static String getTimeC() {
	date=new Date(ctm);
	String format = sdf.format(date);
	System.out.println(format);
	return format;
}

	
}
